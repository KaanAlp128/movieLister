package com.example.movielister.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.movielister.R
import com.example.movielister.adapter.MovieAdapter
import com.example.movielister.databinding.ActivityMovieDetailBinding
import com.example.movielister.model.MovieViewModel

class MovieDetailFragment : Fragment(R.layout.activity_movie_detail) {

    private lateinit var binding: ActivityMovieDetailBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = ActivityMovieDetailBinding.bind(view)

    }

}
