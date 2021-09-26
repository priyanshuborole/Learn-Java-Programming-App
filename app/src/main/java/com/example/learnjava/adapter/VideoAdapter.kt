package com.example.learnjava.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.learnjava.R

class VideoAdapter(private  var vlistner : VideoAdapter.onVdoClickListener) : RecyclerView.Adapter<VideoAdapter.ViewHolder>() {

    interface onVdoClickListener{
        fun onVdoClick(position: Int)
    }

    fun setOnItemClickListener(listener: onVdoClickListener){
        vlistner = listener
    }

    private var vdoTitle = arrayOf("Get Started","Hello World","Variables & Datatype", "Input","String","If-Else" ,
        "Switch Case","Loops" , "Arrays", "Method " ," Method Overloading","Recursion","Access modifiers, getters & setters",
        "Constructors" , "Inheritance","Method Overriding","Abstract Class & Methods","Interface","Collections","Packages" )


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.theory_list,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.videoTitle.text = vdoTitle[position]
    }

    override fun getItemCount(): Int {
       return vdoTitle.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        var videoTitle: TextView = itemView.findViewById(R.id.theory_title)
        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = bindingAdapterPosition
            if (position!=RecyclerView.NO_POSITION) {
                if (v != null) {
                    vlistner.onVdoClick(position)
                }
            }
        }

    }



}