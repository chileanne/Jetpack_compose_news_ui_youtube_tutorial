package cub.sys360.jetpack_compose_news_ui.core

import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun sharedIcons(icon: ImageVector, onclick : () -> Unit, iconSize: Dp){
    IconButton(
        modifier = Modifier
            .clip(CircleShape)
            .background(color = MaterialTheme.colorScheme.tertiary)
            .size(32.dp),
        onClick = onclick,


        ) {
        Icon(
            modifier = Modifier.size(iconSize),
            imageVector = icon,
            contentDescription = "")
    }
}

