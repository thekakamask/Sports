package com.dcac.sports.data

import com.dcac.sports.R
import com.dcac.sports.model.Sport

/**
 * Sports data
 */
object LocalSportsDataProvider {
    val defaultSport = getSportsData()[0]

    fun getSportsData(): List<Sport> {
        return listOf(
            Sport(
                id = 1,
                titleResourceId = R.string.baseball,
                subtitleResourceId = R.string.sports_list_baseball,
                playerCount = 9,
                olympic = true,
                imageResourceId = R.drawable.ic_baseball_square,
                sportsImageBanner = R.drawable.ic_baseball_banner,
                sportDetails = R.string.sport_detail_baseball
            ),
            Sport(
                id = 2,
                titleResourceId = R.string.badminton,
                subtitleResourceId = R.string.sports_list_badminton,
                playerCount = 1,
                olympic = true,
                imageResourceId = R.drawable.ic_badminton_square,
                sportsImageBanner = R.drawable.ic_badminton_banner,
                sportDetails = R.string.sport_detail_badminton
            ),
            Sport(
                id = 3,
                titleResourceId = R.string.basketball,
                subtitleResourceId = R.string.sports_list_basketball,
                playerCount = 5,
                olympic = true,
                imageResourceId = R.drawable.ic_basketball_square,
                sportsImageBanner = R.drawable.ic_basketball_banner,
                sportDetails = R.string.sport_detail_basketball
            ),
            Sport(
                id = 4,
                titleResourceId = R.string.bowling,
                subtitleResourceId = R.string.sports_list_bowling,
                playerCount = 1,
                olympic = false,
                imageResourceId = R.drawable.ic_bowling_square,
                sportsImageBanner = R.drawable.ic_bowling_banner,
                sportDetails = R.string.sport_detail_bowling
            ),
            Sport(
                id = 5,
                titleResourceId = R.string.cycling,
                subtitleResourceId = R.string.sports_list_cycling,
                playerCount = 1,
                olympic = true,
                imageResourceId = R.drawable.ic_cycling_square,
                sportsImageBanner = R.drawable.ic_cycling_banner,
                sportDetails = R.string.sport_detail_cycling
            ),
            Sport(
                id = 6,
                titleResourceId = R.string.golf,
                subtitleResourceId = R.string.sports_list_golf,
                playerCount = 1,
                olympic = false,
                imageResourceId = R.drawable.ic_golf_square,
                sportsImageBanner = R.drawable.ic_golf_banner,
                sportDetails = R.string.sport_detail_golf
            ),
            Sport(
                id = 7,
                titleResourceId = R.string.running,
                subtitleResourceId = R.string.sports_list_running,
                playerCount = 1,
                olympic = true,
                imageResourceId = R.drawable.ic_running_square,
                sportsImageBanner = R.drawable.ic_running_banner,
                sportDetails = R.string.sport_detail_running
            ),
            Sport(
                id = 8,
                titleResourceId = R.string.soccer,
                subtitleResourceId = R.string.sports_list_soccer,
                playerCount = 11,
                olympic = true,
                imageResourceId = R.drawable.ic_soccer_square,
                sportsImageBanner = R.drawable.ic_soccer_banner,
                sportDetails = R.string.sport_detail_soccer
            ),
            Sport(
                id = 9,
                titleResourceId = R.string.swimming,
                subtitleResourceId = R.string.sports_list_swimming,
                playerCount = 1,
                olympic = true,
                imageResourceId = R.drawable.ic_swimming_square,
                sportsImageBanner = R.drawable.ic_swimming_banner,
                sportDetails = R.string.sport_detail_swimming
            ),
            Sport(
                id = 10,
                titleResourceId = R.string.table_tennis,
                subtitleResourceId = R.string.sports_list_table_tennis,
                playerCount = 1,
                olympic = true,
                imageResourceId = R.drawable.ic_table_tennis_square,
                sportsImageBanner = R.drawable.ic_table_tennis_banner,
                sportDetails = R.string.sport_detail_table_tennis
            ),
            Sport(
                id = 11,
                titleResourceId = R.string.tennis,
                subtitleResourceId = R.string.sports_list_tennis,
                playerCount = 1,
                olympic = true,
                imageResourceId = R.drawable.ic_tennis_square,
                sportsImageBanner = R.drawable.ic_tennis_banner,
                sportDetails = R.string.sport_detail_tennis
            )
        )
    }
}