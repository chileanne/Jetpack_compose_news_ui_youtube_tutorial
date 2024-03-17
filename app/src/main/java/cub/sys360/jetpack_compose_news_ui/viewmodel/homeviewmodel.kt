package cub.sys360.jetpack_compose_news_ui.viewmodel

import androidx.lifecycle.ViewModel
import cub.sys360.jetpack_compose_news_ui.R
import cub.sys360.jetpack_compose_news_ui.core.model.NewModel

class homeViewmodel: ViewModel() {

    var carouselData = mutableListOf<NewModel>()
    var recommedationData = mutableListOf<NewModel>()



    init {


        /***caroysel data ***/


        carouselData.add(
            NewModel(
                title = "Stellar performance Takes Super Eagles to new heights",
                station = "CNN",
                desc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vitae arcu id ipsum finibus efficitur. Etiam fringilla",
                imageUrl = R.drawable.spseven,
                category = "Sport",
                channelLogo = R.drawable.cnn,
                timestamp = "30 minutes ago",
                reportedBy = "By Cub360"
            ))


        carouselData.add(
            NewModel(
                title = "Victor Osimehn stunning form in the Afcon games",
                station = "CNN",
                desc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vitae arcu id ipsum finibus efficitur. Etiam fringilla",
                imageUrl = R.drawable.spfour,
                category = "Sport",
                channelLogo = R.drawable.cnn,
                timestamp = "30 minutes ago",
                reportedBy = "By Cub360"
            ))



        carouselData.add(
            NewModel(
                title = "Super Eagles of Nigeria on their way up to the finals of the AFCON",
                station = "CNN",
                desc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vitae arcu id ipsum finibus efficitur. Etiam fringilla",
                imageUrl = R.drawable.spthree,
                category = "Sport",
                channelLogo = R.drawable.cnn,
                timestamp = "30 minutes ago",
                reportedBy = "By Cub360"
            ))




        /***recommendation data ****/

        recommedationData.add(
            NewModel(
                title = "Super Eagles of Nigeria on their way up",
                station = "CNN",
                desc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vitae arcu id ipsum finibus efficitur. Etiam fringilla",
                imageUrl = R.drawable.spthree,
                category = "Sport",
                channelLogo = R.drawable.cnn,
                timestamp = "30 minutes ago",
                reportedBy = "By Cub360"
            ))


        recommedationData.add(
            NewModel(
                title = "Victor Osimehn stunning form in the Afcon games",
                station = "CNN",
                desc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vitae arcu id ipsum finibus efficitur. Etiam fringilla",
                imageUrl = R.drawable.spfour,
                category = "Sport",
                channelLogo = R.drawable.cnn,
                timestamp = "30 minutes ago",
                reportedBy = "By Cub360"
            ))


        recommedationData.add(
            NewModel(
                title = "Super Eagles getting ready to face the Antelopes",
                station = "CNN",
                desc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vitae arcu id ipsum finibus efficitur. Etiam fringilla",
                imageUrl = R.drawable.spseven,
                category = "Sport",
                channelLogo = R.drawable.cnn,
                timestamp = "30 minutes ago",
                reportedBy = "By Cub360"
            ))



        recommedationData.add(
            NewModel(
                title = "Stellar performance Takes Super Eagles to new heights",
                station = "CNN",
                desc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vitae arcu id ipsum finibus efficitur. Etiam fringilla",
                imageUrl = R.drawable.spfive,
                category = "Sport",
                channelLogo = R.drawable.cnn,
                timestamp = "30 minutes ago",
                reportedBy = "By Cub360"
            ))



    }

}