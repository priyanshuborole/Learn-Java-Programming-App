package com.example.learnjava.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.learnjava.R
import com.example.learnjava.adapter.TheoryAdapter
import com.example.learnjava.databinding.FragmentMainBinding
import com.example.learnjava.databinding.FragmentTextDisplayBinding

class TextDisplayFragment : Fragment() {
    lateinit var binding: FragmentTextDisplayBinding
    private val args by navArgs<TextDisplayFragmentArgs>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //binding = FragmentTextDisplayBinding.bind(view)
        Toast.makeText(requireContext(),"Your Position ${args.pos}", Toast.LENGTH_SHORT).show()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentTextDisplayBinding.inflate(layoutInflater)
        return binding.root
    }
}