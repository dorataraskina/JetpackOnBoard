package com.example.onboardjetpack

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.onboardjetpack.ui.theme.OnBoardJetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OnBoardJetpackTheme {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Fon()
                    Image(
                        modifier = Modifier
                            .width(500.dp)
                            .height(500.dp),
                        painter = painterResource(id = R.drawable.elip),
                        contentDescription = null
                    )
                    Image(
                        modifier = Modifier
                            .width(300.dp)
                            .height(300.dp),
                        painter = painterResource(id = R.drawable.logo),
                        contentDescription = null
                    )

                }
                /*Image(
                    modifier = Modifier
                        .width(100.dp)
                        .height(200.dp),
                    painter = painterResource(id = R.drawable.frame),
                    contentDescription = null
                )*/

            }
        }
        object : CountDownTimer(5000, 1000) {
            override fun onTick(millisUntilFinished: Long) {}
            override fun onFinish() {
                startActivity(Intent(this@MainActivity, OnB1Activity::class.java))
            }
        }.start()
    }
}

@Composable
fun Fon(modifier: Modifier = Modifier.fillMaxSize()) {
    Image(
        modifier = Modifier.fillMaxSize(),
        painter = painterResource(id = R.drawable.fon1),
        contentDescription = ""
    )
}

@Preview
@Composable
fun Preview() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Fon()
        Image(
            modifier = Modifier
                .width(500.dp)
                .height(500.dp),
            painter = painterResource(id = R.drawable.elip),
            contentDescription = null
        )
        Image(
            modifier = Modifier
                .width(300.dp)
                .height(300.dp),
            painter = painterResource(id = R.drawable.logo),
            contentDescription = null
        )
    }
   /* Image(
        modifier = Modifier
            .width(100.dp)
            .height(200.dp),
        painter = painterResource(id = R.drawable.frame),
        contentDescription = null
    )*/
}