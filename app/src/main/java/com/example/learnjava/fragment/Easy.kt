package com.example.learnjava.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.learnjava.QuestionDisplay
import com.example.learnjava.R
import com.example.learnjava.adapter.Easy_RecyclerAdapter

class Easy : Fragment(R.layout.fragment_easy),Easy_RecyclerAdapter.onEqueClickListener {

    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_easy, container, false)
        recyclerView = view.findViewById(R.id.easy_recycler)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter =Easy_RecyclerAdapter(this)
        return view
    }

    override fun onEqueClick(position: Int) {
        val intent = Intent(activity,QuestionDisplay::class.java)
        intent.putExtra("position", position)
        startActivity(intent)


    }
}