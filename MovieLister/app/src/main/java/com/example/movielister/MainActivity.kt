package com.example.movielister

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.movielister.adapter.MovieAdapter


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val movies = Datasource(this).loadMovies()
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.adapter = MovieAdapter(movies)

    }
}


