package com.example.learnjava.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView
import com.example.learnjava.R
import com.example.learnjava.fragment.TheoryFragment

class TheoryAdapter(private  var listner : onItemClickListener): RecyclerView.Adapter<TheoryAdapter.ViewHolder>() {

    interface onItemClickListener{
        fun onItemClick(position: Int)
    }

   /* fun setOnItemClickListener(listener: onItemClickListener){
        mlistner = listener
    }*/

    private var title = arrayOf("Get Started","Hello World","Variables & Operators","Input","Control Statement",
                                "Functions","Arrays","Classes & Objects","Inheritance","PolyMorphism","Abstract & Interference","Collections","Files" )


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.theory_list,parent,false)
        val viewHolder = ViewHolder(v)
        viewHolder.cardView.setOnClickListener {
            listner.onItemClick(viewHolder.absoluteAdapterPosition)
        }
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.theoryTitle.text = title[position]

    }

    override fun getItemCount(): Int {
        return title.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var theoryTitle: TextView = itemView.findViewById(R.id.theory_title)
        var cardView = itemView.findViewById<View>(R.id.cardView)
        init {
            //itemView.setOnClickListener(this)
        }

        /*override fun onClick(v: View?) {
            val position = bindingAdapterPosition
            if (position!=RecyclerView.NO_POSITION) {
                if (v != null) {
                    mlistner.onItemClick(position)
                }
            }
        }*/

    }
}