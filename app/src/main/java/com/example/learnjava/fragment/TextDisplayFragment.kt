package com.example.learnjava.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import com.example.learnjava.databinding.FragmentTextDisplayBinding
import com.google.firebase.storage.FirebaseStorage
import java.io.File

class TextDisplayFragment : Fragment() {
    private lateinit var binding: FragmentTextDisplayBinding
    private val args by navArgs<TextDisplayFragmentArgs>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val filename = arrayOf("getstarted","helloworld","variablesanddatatypes","input","string","ifelse","switchcase","loops","arrays",
            "methodandmethodoverloading","recursion","accessmodifiersgettersandsetters","constructors","inheritance","methodoverriding","abstractclassandmethod","packages")


        val storageRef = FirebaseStorage.getInstance().reference.child("Theory/${filename[args.pos]}.txt")

        val localFile = File.createTempFile("temptxt","txt")
        storageRef.getFile(localFile).addOnSuccessListener {
            if (binding.progressBarT.visibility == View.VISIBLE){
                binding.progressBarT.visibility = View.GONE
            }
            binding.tvDisplay.text = localFile.readText()

        }.addOnFailureListener{
        Toast.makeText(activity, "Failed to Retrieve Data, Check Internet Connection",Toast.LENGTH_LONG).show()
            if (binding.progressBarT.visibility == View.VISIBLE){
                binding.progressBarT.visibility = View.GONE
            }
        }

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentTextDisplayBinding.inflate(layoutInflater)
        binding.progressBarT.visibility = View.VISIBLE
        return binding.root
    }
}