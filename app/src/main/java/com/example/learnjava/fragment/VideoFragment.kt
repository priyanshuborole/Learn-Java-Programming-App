package com.example.learnjava.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.learnjava.R
import com.example.learnjava.YoutubeActivity
import com.example.learnjava.adapter.TheoryAdapter
import com.example.learnjava.adapter.VideoAdapter

class VideoFragment : Fragment(R.layout.fragment_video),VideoAdapter.onVdoClickListener {
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_video,container,false)
        recyclerView = view.findViewById(R.id.vdo_recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = VideoAdapter(this)
        return view
    }

    override fun onVdoClick(position: Int) {
        val vintent = Intent(activity, YoutubeActivity::class.java)
        vintent.putExtra("position", position)
        startActivity(vintent)
    }

}