package ru.geekbrains.filmserach.ui.pages

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import coil.load
import org.koin.androidx.viewmodel.ext.android.viewModel
import ru.geekbrains.filmserach.R
import ru.geekbrains.filmserach.databinding.FragmentFilmBinding
import ru.geekbrains.filmserach.domain.Film
import ru.geekbrains.filmserach.domain.SELECTED_FILM

class FilmFragment : Fragment() {

    private val viewModel: FilmViewModel by viewModel()
    private var _binding: FragmentFilmBinding? = null
    private val binding
        get() = _binding!!

    companion object {
        fun newInstance() = FilmFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFilmBinding.inflate(inflater, container, false)

        return binding.root
    }

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // TODO: Use the ViewModel
        //val bundle = arguments?.getBundle(SELECTED_FILM)
        val film = arguments?.getParcelable(SELECTED_FILM, Film::class.java)

        showFilmData(film)
    }

    override fun onDestroyView() {
        super.onDestroyView()

        _binding = null
    }

    private fun showFilmData(film: Film?) {
        if (film == null) {
            return
        }

        binding.title.text = film.title
        binding.originalTitle.text = film.originalTitle
        binding.popularity.text = film.popularity.toString()
        binding.genre.text = film.genres.toString()
        binding.releaseDate.text = film.releaseDate
        binding.adult.text = film.adult.toString()
        binding.overview.text = film.overview

        if (film.posterPath == null || film.posterPath.isEmpty()) {
            binding.poster.load(film.posterPath)
        }
    }
}