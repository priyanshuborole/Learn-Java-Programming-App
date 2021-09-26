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
import com.example.learnjava.adapter.Med_RecyclerAdapter

class Medium : Fragment(R.layout.fragment_medium),Med_RecyclerAdapter.onMqueClickListener {

    private lateinit var recyclerView_m: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_medium, container, false)
        recyclerView_m = view.findViewById(R.id.medium_recycler)
        recyclerView_m.layoutManager = LinearLayoutManager(activity)
        recyclerView_m.adapter = Med_RecyclerAdapter(this)
        return view
    }

    override fun onMqueClick(position: Int) {
        val intent = Intent(activity, QuestionDisplay::class.java)
        intent.putExtra("position", position+13)
        startActivity(intent)
    }
}