package com.example.movielister.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.movielister.MovieDetailActivity
import com.example.movielister.R
import com.example.movielister.model.Movie
class MovieAdapter(val dataset:List<Movie>): RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    class MovieViewHolder(private val view: View): RecyclerView.ViewHolder(view){
        val nameView: TextView = view.findViewById(R.id.nameView)
        val posterView: ImageView = view.findViewById(R.id.posterView)
        private lateinit var movie:Movie

        init{
            view.setOnClickListener{
                val context = itemView.context
                val showUserIntent = Intent(context, MovieDetailActivity::class.java)
                showUserIntent.putExtra("MOVIE_KEY", movie)
                context.startActivity(showUserIntent)
            }
        }
        fun bind(movie:Movie){
            this.movie = movie
            nameView.text = movie.name

            Glide.with(posterView)
                .load(movie.posterUrl)
                .into(posterView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val itemLayout = LayoutInflater.from(parent.context).inflate(R.layout.movie_layout, parent, false)
        return MovieViewHolder(itemLayout)
    }

    override fun getItemCount(): Int = dataset.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = dataset[position]
        holder.bind(movie)
    }
}