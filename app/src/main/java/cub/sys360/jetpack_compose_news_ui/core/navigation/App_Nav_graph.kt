package cub.sys360.jetpack_compose_news_ui.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import cub.sys360.jetpack_compose_news_ui.core.appconstants.app_constants.Detail_Screen_Index
import cub.sys360.jetpack_compose_news_ui.presentation.DetailsScreen
import cub.sys360.jetpack_compose_news_ui.presentation.HomeScreen
import cub.sys360.jetpack_compose_news_ui.presentation.SeeMoreScreen


@Composable
fun navigationGraph(navController: NavHostController){



    NavHost(navController = navController, startDestination = navigationRoute.homeScreen.routes ){


        ///Home Screen Routes
        composable(
            route = navigationRoute.homeScreen.routes
        ){
            HomeScreen(navController)
        }



        ///see more screen
        composable(route =navigationRoute.seeMoreScreen.routes){
            SeeMoreScreen(navController)
        }


        //Detail Screen
        composable(route =navigationRoute.detailScreen.routes,
            arguments= listOf(
                navArgument(name = "$Detail_Screen_Index"){
                     type = NavType.IntType
                }
            )){

            var index = it.arguments?.getInt(Detail_Screen_Index)

            DetailsScreen(navController,index)

        }



    }

}