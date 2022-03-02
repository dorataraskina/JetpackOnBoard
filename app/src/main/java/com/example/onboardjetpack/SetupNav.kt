package com.example.onboardjetpack

import android.os.Build
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
public fun SetupNav(nav : NavHostController):Unit{
    NavHost(navController = nav, startDestination = Screen.First.route){
        composable(route = Screen.First.route){
            FirstScreen(nav = nav)
        }
        composable(route = Screen.Second.route){
            SecodScreen(nav = nav)
        }
    }

}