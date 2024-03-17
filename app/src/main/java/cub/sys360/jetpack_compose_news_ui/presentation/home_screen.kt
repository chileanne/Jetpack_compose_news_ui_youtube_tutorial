package cub.sys360.jetpack_compose_news_ui.presentation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import cub.sys360.jetpack_compose_news_ui.core.navigation.navigationRoute
import cub.sys360.jetpack_compose_news_ui.core.sharedIcons
import cub.sys360.jetpack_compose_news_ui.viewmodel.homeViewmodel


@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(navController: NavHostController) {

   val viewmodel = homeViewmodel()


    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(text = "DailyNews",
                        style = MaterialTheme.typography.headlineSmall)

                },

                navigationIcon = {
                    sharedIcons(
                        icon = Icons.Filled.Menu,
                        onclick = {

                        },
                        iconSize = 26.dp
                    )
                },

                actions = {
                    sharedIcons(
                        icon = Icons.Filled.Search,
                        onclick = {

                        },
                        iconSize = 26.dp
                    )


                    Spacer(modifier = Modifier.width(8.dp))


                    sharedIcons(
                        icon = Icons.Filled.Notifications,
                        onclick = {

                        },
                        iconSize = 26.dp
                    )
                }

                )
        }
    ) {
        Column (
            modifier = Modifier.padding(it)
        ){


           val pagerState = rememberPagerState (
               initialPage = 0,
               pageCount = {
                   viewmodel.carouselData.size
               }
           )




            HorizontalPager(
                state = pagerState,
                pageSpacing = 0.dp,
                userScrollEnabled = true,
                reverseLayout = false,
            ) {

                Card(
                    elevation = CardDefaults.cardElevation(4.dp),
                    modifier = Modifier.
                        clickable {

                        }
                        .fillMaxWidth()
                        .height(240.dp)
                        .padding(end = 6.dp, start = 6.dp)
                ) {
                    Box {
                        Image(
                            painter = painterResource(id = viewmodel.carouselData[it].imageUrl) ,
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier.fillMaxSize(),
                            contentDescription = "")


                        Spacer(modifier = Modifier.height(30.dp))

                        Column(
                            modifier = Modifier.align(alignment= Alignment.BottomCenter),

                        ) {
                            Row (
                                modifier = Modifier.padding(start=12.dp)
                            ){
                                Image(
                                    painter = painterResource(id = viewmodel.carouselData[it].channelLogo) ,
                                    contentScale = ContentScale.FillBounds,
                                    modifier = Modifier
                                        .size(30.dp)
                                        .shadow(
                                            elevation = 4.dp,
                                            shape = CircleShape
                                        ) ,
                                    contentDescription = "")



                                Spacer(modifier = Modifier.size(5.dp))

                                Text(
                                    text = viewmodel.carouselData[it].station,
                                    style = MaterialTheme.typography.headlineSmall.copy(
                                        color = Color.White
                                    ))



                            }


                            Text(
                                text = viewmodel.carouselData[it].title,
                                modifier = Modifier
                                    .align(alignment = Alignment.Start)
                                    .padding(start = 10.dp, bottom = 8.dp, top = 4.dp),

                                style = MaterialTheme.typography.bodyMedium.copy(
                                    color = Color.White
                                ),


                                )


                        }
                    }
                    
                    


                }

            }


            Spacer(modifier = Modifier.height(18.dp))

            Row (
                Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                horizontalArrangement = Arrangement.Center
            ){
                repeat(viewmodel.carouselData.size){ iteration ->
                    val color = if(pagerState.currentPage==iteration)Color.Green else Color.LightGray

                    Box(modifier = Modifier.padding(2.dp)
                        .clip(RectangleShape)
                        .background(color)
                        .width(40.dp)
                        .height(4.dp)


                    )


                }
            }
            
            
            
            Spacer(modifier = Modifier.height(12.dp))



                Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment=Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 4.dp, end = 12.dp),
                ){
                    Text(
                        text = "Recommendation",
                        style = MaterialTheme.typography.bodyMedium.copy(
                          fontSize = 20.sp

                        )
                    )

                    Text(
                        text = "Show more",
                        style = MaterialTheme.typography.bodySmall.copy(
                            color = Color.Green,
                            fontWeight = FontWeight.W400
                            //fontSize = 16.sp
                        ),

                        modifier = Modifier.clickable {
                            navController.navigate(navigationRoute.seeMoreScreen.routes)
                        }


                    )


                }




            Spacer(modifier = Modifier.height(12.dp))

              LazyColumn(){
                  items(viewmodel.recommedationData.size){
                      Card(
                          modifier = Modifier
                              .clickable {
                                  navController.navigate(
                                      navigationRoute.detailScreen.passRequiredArguments(
                                          index= it
                                      )
                                  )
                              }
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
}