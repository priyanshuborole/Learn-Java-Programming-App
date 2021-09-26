package com.example.learnjava

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.learnjava.databinding.ActivityInterviewBinding
import com.google.firebase.storage.FirebaseStorage
import java.io.File


class InterviewActivity : AppCompatActivity() {
    private lateinit var binding : ActivityInterviewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInterviewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val que = "ques"
        val storageRef = FirebaseStorage.getInstance().reference.child("interview/$que.txt")
        val localFile = File.createTempFile("tptxt","txt")
        storageRef.getFile(localFile).addOnSuccessListener {
            if (binding.progressBarI.visibility == View.VISIBLE){
                binding.progressBarI.visibility = View.GONE
            }

            binding.tvInter.text= localFile.readText()


        }.addOnFailureListener{
            Toast.makeText(this, "Failed to Retrieve Data, Check Internet Connection", Toast.LENGTH_LONG).show()
            if (binding.progressBarI.visibility == View.VISIBLE){
                binding.progressBarI.visibility = View.GONE
            }
        }
    }
}