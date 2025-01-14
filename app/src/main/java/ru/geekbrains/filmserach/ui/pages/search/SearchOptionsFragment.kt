package ru.geekbrains.filmserach.ui.pages.search

import android.os.Build
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.annotation.RequiresApi
import androidx.navigation.fragment.findNavController
import com.google.android.material.slider.RangeSlider

import ru.geekbrains.filmserach.R
import ru.geekbrains.filmserach.data.*
import ru.geekbrains.filmserach.data.net.SearchOptions
import ru.geekbrains.filmserach.databinding.FragmentSearchOptionsBinding
import ru.geekbrains.filmserach.ui.base.BaseFragment
import java.time.LocalDate

const val SEARCH_OPTIONS = "search_options"
const val YEARS_FOR_STEP = 10F
const val START_YEAR = 1890F
const val POPULARITY_FOR_STEP = 1F
const val START_POPULARITY = 0F
const val END_POPULARITY = 10F

class SearchOptionsFragment : BaseFragment<FragmentSearchOptionsBinding>() {

    override fun getViewBinding() = FragmentSearchOptionsBinding.inflate(layoutInflater)

    companion object {
        fun newInstance() = SearchOptionsFragment()
    }

    override fun initView() {
        binding.startSearching.setOnClickListener {
            startSearching()
        }
    }

    override fun initData() {
        setGenresList()
        setCountriesList()
        setYearsOptions()
        setPopularityOptions()
    }

    private fun startSearching() {
        val searchOptions = SearchOptions(
            name = binding.name.text.toString(),
            genre = binding.genre.text.toString(),
            country = binding.country.text.toString(),
            startYearDefault = binding.years.valueFrom,
            startYear = binding.years.values[0],
            endYearDefault = binding.years.valueTo,
            endYear = binding.years.values[1],
            startPopularityDefault = binding.popularity.valueFrom,
            startPopularity = binding.popularity.values[0],
            endPopularityDefault = binding.popularity.valueTo,
            endPopularity = binding.popularity.values[1]
        )
        val bundle = Bundle()
        bundle.putParcelable(SEARCH_OPTIONS, searchOptions)
        findNavController().navigate(R.id.film_list_fragment, bundle)
    }

    private fun setGenresList() {
        val genres = getAllGenres().toTypedArray()
        val genreView = binding.genre as AutoCompleteTextView
        genreView.threshold = 1

        ArrayAdapter<String>(requireContext(), android.R.layout.simple_list_item_1, genres
        ).also {
            genreView.setAdapter(it)
        }
    }

    private fun setCountriesList() {
        val countries = getAllCountries().values.toTypedArray()
        val countriesView = binding.country as AutoCompleteTextView
        countriesView.threshold = 1

        ArrayAdapter<String>(requireContext(), android.R.layout.simple_list_item_1, countries
        ).also {
            countriesView.setAdapter(it)
        }
    }

    @RequiresApi(Build.VERSION_CODES.N)
    private fun setYearsOptions() {
        val yearsView = binding.years as RangeSlider
        var endYear = LocalDate.now().year.toFloat()
        val rest = (endYear - START_YEAR) % YEARS_FOR_STEP

        if (rest > 0) {
            endYear += (YEARS_FOR_STEP - rest)
        }

        yearsView.stepSize = YEARS_FOR_STEP
        yearsView.valueFrom = START_YEAR
        yearsView.valueTo = endYear
        yearsView.values = listOf<Float>(START_YEAR, endYear)
    }

    private fun setPopularityOptions() {
        val popularityView = binding.popularity as RangeSlider
        popularityView.stepSize = POPULARITY_FOR_STEP
        popularityView.valueFrom = START_POPULARITY
        popularityView.valueTo = END_POPULARITY
        popularityView.values = listOf<Float>(START_POPULARITY, END_POPULARITY)
    }
}