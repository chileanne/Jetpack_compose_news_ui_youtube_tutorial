package cub.sys360.jetpack_compose_news_ui.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cub.sys360.jetpack_compose_news_ui.R
import cub.sys360.jetpack_compose_news_ui.core.sharedIcons

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreen(){
   Scaffold (
      topBar = {
          CenterAlignedTopAppBar(
              colors = TopAppBarDefaults.centerAlignedTopAppBarColors(),
              title = { 
                  Text(text = "Sports")
              },

              navigationIcon = {

                  sharedIcons(
                      icon = Icons.Filled.KeyboardArrowLeft,
                      onclick = {

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
   ){
        Column (
          modifier = Modifier
              .verticalScroll(rememberScrollState())
              .padding(it)
              .padding(8.dp)
        ){


            /** Image Ui**/
            Surface (
                  shape = MaterialTheme.shapes.small,
                  shadowElevation = 4.dp,
                  color = Color.Yellow,
                  modifier = Modifier
                      .fillMaxWidth()
                      .height(280.dp)
              ) {
                    Image(
                        painter = painterResource(id = R.drawable.spfour) ,
                        contentScale = ContentScale.FillBounds,
                        contentDescription = "")
                  
                  

              }


            /**Description **/
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Victor Osimehn stunning form in the Afcon games",
                style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(8.dp))
             Row {
              Icon(imageVector = ImageVector.vectorResource(id=R.drawable.schedule), contentDescription = "")
                 Text(text = "1 hour ago",
                     style = MaterialTheme.typography.bodySmall)
                 Spacer(modifier = Modifier.width(8.dp))
                 Text(text = "3 minutes read",
                     style = MaterialTheme.typography.bodySmall)
             }
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "By Cub360",
                style = MaterialTheme.typography.bodyMedium.copy(
                    fontWeight = FontWeight.W600
                )
                )
            Spacer(modifier = Modifier.height(12.dp))

            /** Content**/
            Text(text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vitae arcu id ipsum finibus efficitur. Etiam fringilla malesuada erat, sed tempus neque. Vivamus urna purus, efficitur eu nisl sit amet, ornare ultricies ligula. Vivamus nec dignissim velit. Vestibulum ut ex risus. Suspendisse tempus gravida sapien, non semper tellus lacinia id. Nulla vitae tellus ut est vehicula cursus id vitae est. Duis est risus, suscipit sit amet nunc at, vulputate vestibulum orci. Nulla tempor dui eu libero tristique, nec efficitur dolor luctus. Vivamus et cursus urna. Ut ac tellus eu odio consequat hendrerit. In ut laoreet odio, sit amet imperdiet leo. Cras sit amet risus tellus. Nam pulvinar, nibh semper mollis facilisis, dolor est commodo dolor, eget pellentesque magna nunc sit amet ex. Mauris bibendum ultricies diam et semper. Quisque aliquet eros nunc, vel pretium diam consectetur a.",
                style = MaterialTheme.typography.bodyMedium
            )

        }
   }
}