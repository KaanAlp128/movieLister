package com.example.movielister

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.movielister.databinding.ActivityMovieDetailBinding
import com.example.movielister.fragment.MovieDetailFragment
import com.example.movielister.model.Movie

class MovieDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMovieDetailBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_movie_detail)

        val selectedMovie = intent.getSerializableExtra("MOVIE_KEY") as Movie
        binding.movie = selectedMovie

    }

}
