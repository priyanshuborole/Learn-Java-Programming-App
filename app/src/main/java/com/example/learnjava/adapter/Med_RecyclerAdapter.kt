package com.example.learnjava.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.learnjava.R

class Med_RecyclerAdapter : RecyclerView.Adapter<Med_RecyclerAdapter.ViewHolder>(){

    private var mediumques = arrayOf("medium","Hello World","Variables & Operators","Input","Control Statement",
        "med","Arrays","Classes & Objects","medium","PolyMorphism","Abstract & Interference","hard","Files" )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Med_RecyclerAdapter.ViewHolder {
        val m = LayoutInflater.from(parent.context).inflate(R.layout.quest_list, parent, false)

        return ViewHolder(m)
    }
    override fun getItemCount(): Int {
        return mediumques.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var medTitle: TextView
        init {
            medTitle = itemView.findViewById(R.id.display)
        }

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.medTitle.text = mediumques[position]
    }

}