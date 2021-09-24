package com.example.learnjava.adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.learnjava.R

class Easy_RecyclerAdapter  : RecyclerView.Adapter<Easy_RecyclerAdapter.ViewHolder>(){
    private var easyQuestion = arrayOf("Get Started","Hello World","Variables & Operators","Input","Control Statement",
        "Functions","Arrays","Classes & Objects","Inheritance","PolyMorphism","Abstract & Interference","Collections","Files" )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Easy_RecyclerAdapter.ViewHolder {
        val e = LayoutInflater.from(parent.context).inflate(R.layout.quest_list, parent, false)

        return ViewHolder(e)
    }

    override fun onBindViewHolder(holder: Easy_RecyclerAdapter.ViewHolder, position: Int) {
        holder.EasyTitle.text = easyQuestion[position]
    }

    override fun getItemCount(): Int {
        return easyQuestion.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var EasyTitle: TextView
        init {
            EasyTitle = itemView.findViewById(R.id.display)
        }

    }
}