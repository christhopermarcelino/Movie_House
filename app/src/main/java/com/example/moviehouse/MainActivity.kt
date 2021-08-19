package com.example.moviehouse

import android.graphics.Movie
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.moviehouse.adapter.MovieAdapter
import com.example.moviehouse.data.MovieData
import com.example.moviehouse.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_MovieHouse)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val popularMovieList = ArrayList<MovieData>()
        popularMovieList.add(MovieData(R.drawable.img_poster_money_heist))
        popularMovieList.add(MovieData(R.drawable.img_poster_lord_of_the_rings))
        popularMovieList.add(MovieData(R.drawable.img_poster_2012))

        setListToHorizontalRecylerView(binding.rvPopularMovies, popularMovieList)

        val newReleaseMovieList = ArrayList<MovieData>()
        newReleaseMovieList.add(MovieData(R.drawable.img_poster_godzilla))
        newReleaseMovieList.add(MovieData(R.drawable.img_poster_avengers))
        newReleaseMovieList.add(MovieData(R.drawable.img_poster_inception))

        setListToHorizontalRecylerView(binding.rvNewReleaseMovies, newReleaseMovieList)
    }

    private fun setListToHorizontalRecylerView(element: RecyclerView, movieList: ArrayList<MovieData>) {
        element.setHasFixedSize(true)
        element.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        element.adapter = MovieAdapter(movieList)
    }


}