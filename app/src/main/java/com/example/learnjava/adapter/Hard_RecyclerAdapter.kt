package com.example.learnjava.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.learnjava.R

class Hard_RecyclerAdapter : RecyclerView.Adapter<Hard_RecyclerAdapter.ViewHolder>(){

    private var hardQuestion = arrayOf("hard","Hello World","Variables & Operators","Input","Control Statement",
        "Functions","Arrays","Classes & Objects","Inheritance","PolyMorphism","Abstract & Interference","hard","Files" )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Hard_RecyclerAdapter.ViewHolder {
        val m = LayoutInflater.from(parent.context).inflate(R.layout.quest_list, parent, false)

        return ViewHolder(m)
    }
    override fun getItemCount(): Int {
        return hardQuestion.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var hardTitle: TextView

        init {
            hardTitle = itemView.findViewById(R.id.display)
        }

    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.hardTitle.text = hardQuestion[position]
    }

}