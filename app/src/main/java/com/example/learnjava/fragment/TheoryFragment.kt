package com.example.learnjava.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.learnjava.R
import com.example.learnjava.adapter.TheoryAdapter

class TheoryFragment : Fragment(R.layout.fragment_theory),TheoryAdapter.onItemClickListener {
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_theory,container,false)
        recyclerView = view.findViewById(R.id.theory_recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = TheoryAdapter(this)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

   override fun onItemClick(position: Int) {
        val pos = position
        val action = TheoryFragmentDirections.actionTheoryFragmentToTextDisplayFragment(pos)
        findNavController().navigate(action)

    }


}