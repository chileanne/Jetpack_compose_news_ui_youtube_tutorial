package cub.sys360.jetpack_compose_news_ui.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import cub.sys360.jetpack_compose_news_ui.core.sharedIcons
import cub.sys360.jetpack_compose_news_ui.viewmodel.homeViewmodel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SeeMoreScreen(navController: NavHostController) {
    val viewmodel = homeViewmodel()

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(),
                title = {
                    Text(text = "See More")
                },

                navigationIcon = {

                    sharedIcons(
                        icon = Icons.Filled.KeyboardArrowLeft,
                        onclick = {
                              navController.popBackStack();
                        },
                        iconSize = 26.dp
                    )
                },


                actions ={
                    sharedIcons(
                        icon = Icons.Filled.Share,
                        onclick = {

                        },
                        iconSize = 18.dp
                    )
                }

            )
        }
    ) {

        LazyColumn(
            modifier = Modifier.padding(it)
        ){
            items(viewmodel.recommedationData.size){
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                        .padding(start = 3.dp, end = 3.dp, bottom = 5.dp),

                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.onPrimaryContainer
                    ),

                    ) {
                    Row {
                        ///left
                        Surface (
                            modifier = Modifier
                                .fillMaxWidth(0.5f)
                                .fillMaxHeight(),
                            color = Color.Green
                        ) {
                            Image(painter = painterResource(
                                id =  viewmodel.recommedationData[it].imageUrl),
                                contentDescription = "",
                                modifier = Modifier.clip(RectangleShape),
                                contentScale = ContentScale.FillBounds

                            )
                        }



                        ///right
                        Column(
                            modifier= Modifier.padding(4.dp),
                            verticalArrangement = Arrangement.Top
                        ) {


                            Surface (
                                modifier = Modifier
                                    .height(110.dp)
                                    .fillMaxWidth()
                                    .padding(0.dp),

                                ){

                                Column {
                                    Text(
                                        text =viewmodel.recommedationData[it].reportedBy,
                                        maxLines = 3,
                                        style = MaterialTheme.typography.bodySmall.copy(
                                            //  fontWeight = FontWeight.W700
                                        ),
                                        overflow = TextOverflow.Ellipsis

                                    )

                                    Spacer(modifier = Modifier.height(4.dp))


                                    Text(
                                        text =viewmodel.recommedationData[it].title,
                                        maxLines = 3,
                                        style = MaterialTheme.typography.bodyMedium.copy(
                                            fontWeight = FontWeight.W700
                                        ),
                                        overflow = TextOverflow.Ellipsis

                                    )
                                }

                            }










                            Text(
                                text =viewmodel.recommedationData[it].timestamp,
                                maxLines = 3,
                                style = MaterialTheme.typography.bodySmall,



                                )

                        }
                    }
                }
            }
        }

    }

}