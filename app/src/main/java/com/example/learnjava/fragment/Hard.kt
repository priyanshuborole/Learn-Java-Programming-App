package com.example.learnjava.fragment
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.learnjava.R
import com.example.learnjava.adapter.Hard_RecyclerAdapter

class Hard : Fragment(R.layout.fragment_hard) {

    private lateinit var recyclerView_h: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_hard, container, false)
        recyclerView_h = view.findViewById(R.id.hard_recycler)
        recyclerView_h.layoutManager = LinearLayoutManager(activity)
        recyclerView_h.adapter = Hard_RecyclerAdapter()
        return view
    }
}