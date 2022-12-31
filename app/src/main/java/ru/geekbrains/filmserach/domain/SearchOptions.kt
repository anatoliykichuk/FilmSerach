package ru.geekbrains.filmserach.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class SearchOptions(
    val name: String,
    val genre: String,
    val country: String,
    val startYearDefault: Float,
    val startYear: Float,
    val endYearDefault: Float,
    val endYear: Float,
    val startPopularityDefault: Float,
    val startPopularity: Float,
    val endPopularityDefault: Float,
    val endPopularity: Float
) : Parcelable {

    fun getYearRange(): String {
        return "${startYear.toInt()}-${endYear.toInt()}"
    }

    fun getPopularityRange(): String {
        return "${startPopularity.toInt()}-${endPopularity.toInt()}"
    }

    override fun toString(): String {
        val optionsBuilder: MutableList<String> = mutableListOf()
        val optionSeparator = "&"

        if (name.isNotEmpty()) {
            optionsBuilder.add("field=name&search=$name")
        }

        if (genre.isNotEmpty()) {
            optionsBuilder.add("field=genres.name&search=$genre")
        }

        if (country.isNotEmpty()) {
            optionsBuilder.add("field=premiere.country&search=$country")
        }

        if (startYear > startYearDefault || endYear < endYearDefault) {
            optionsBuilder.add("field=year&search=${getYearRange()}")
        }

        if (startPopularity > startPopularityDefault || endPopularity < endPopularityDefault) {
            optionsBuilder.add("field=rating.kp&search=${getPopularityRange()}")
        }

        return optionsBuilder.joinToString(optionSeparator)
    }
}