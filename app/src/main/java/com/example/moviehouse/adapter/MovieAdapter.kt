package com.example.moviehouse.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviehouse.R
import com.example.moviehouse.data.MovieData
import kotlinx.android.synthetic.main.movie_card.view.*

class MovieAdapter(private var movieList: ArrayList<MovieData>): RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {
    inner class MovieViewHolder(movieView: View) : RecyclerView.ViewHolder(movieView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_card, parent, false)
        return MovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.itemView.apply {
            container.setImageResource(movieList[position].image)
        }
    }

    override fun getItemCount(): Int = movieList.size


}