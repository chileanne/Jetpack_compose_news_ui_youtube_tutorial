package cub.sys360.jetpack_compose_news_ui.core.navigation

import cub.sys360.jetpack_compose_news_ui.core.appconstants.app_constants.Detail_Screen
import cub.sys360.jetpack_compose_news_ui.core.appconstants.app_constants.Detail_Screen_Index

sealed class navigationRoute(val routes : String){


    object homeScreen : navigationRoute(routes = "HomeScreen")


    object  detailScreen : navigationRoute(routes = "$Detail_Screen/{$Detail_Screen_Index}"){
         fun passRequiredArguments(
             index: Int
         ):String{
            return "$Detail_Screen/$index"
         }
    }

    object seeMoreScreen : navigationRoute(routes = "SeeMoreScreen")

}
