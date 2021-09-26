package com.example.learnjava.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.SupportActionModeWrapper
import androidx.navigation.fragment.findNavController
import com.example.learnjava.InterviewActivity
import com.example.learnjava.QuestionActivity
import com.example.learnjava.R
import com.example.learnjava.YoutubeActivity
import com.example.learnjava.databinding.FragmentMainBinding
class MainFragment : Fragment() {
    lateinit var binding : FragmentMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.theoryBtn.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_theoryFragment)
        }
        binding.questionBtn.setOnClickListener {
            val intent = Intent(activity,QuestionActivity::class.java)
            startActivity(intent)

        }
        binding.videoBtn.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_videoFragment)
        }
        binding.interviewQueBtn.setOnClickListener {
            val iIntent = Intent(activity,InterviewActivity::class.java)
            startActivity(iIntent)
        }
        binding.shareBtn.setOnClickListener {
            val i = Intent(Intent.ACTION_SEND)
            i.type = "text/plain"
            i.putExtra(Intent.EXTRA_TEXT, "Checkout this app to learn java programming, --link--(will be provided soon")
            startActivity(Intent.createChooser(i, "Share this app with"))
        }
    }

}