package cub.sys360.jetpack_compose_news_ui.core.model

data class NewModel(
    val title : String,
    val station: String,
    val imageUrl : Int,
    val desc: String,
    val category: String,
    val channelLogo : Int,
    val timestamp : String
)
