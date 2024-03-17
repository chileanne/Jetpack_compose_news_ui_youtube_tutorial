package cub.sys360.jetpack_compose_news_ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import cub.sys360.jetpack_compose_news_ui.core.navigation.navigationGraph
import cub.sys360.jetpack_compose_news_ui.presentation.SeeMoreScreen
import cub.sys360.jetpack_compose_news_ui.ui.theme.Jetpack_compose_news_uiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jetpack_compose_news_uiTheme {

                 val navController = rememberNavController();
                navigationGraph(navController = navController);

            }
        }
    }
}

