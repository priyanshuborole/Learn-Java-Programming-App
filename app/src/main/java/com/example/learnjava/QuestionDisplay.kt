package com.example.learnjava

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.learnjava.databinding.ActivityQuestionDisplayBinding
import com.google.firebase.storage.FirebaseStorage
import java.io.File

class QuestionDisplay : AppCompatActivity() {
    private lateinit var binding: ActivityQuestionDisplayBinding

    private var ques = arrayOf("takenameasinputandgreet","printThepattern","3.takesideofsqasinputanddisplayarea","checkthediscount","5displaygrades",
                                "6.reversednumber","7factorialofnumber","8createyopurownmethod","9takeinputandprintarray","10largestandsmallestinarray",
                                "11occurenceofe","12studentclass","13areaandparioftriangle","1untiluserpressq","2armstrongnumber","3primefactor","4circumferenceandarea",
                                "5primeornot","6shiftelementtorght","7palindrome","8","9","10","1arraysplit","2sortalphabetically","3","4","5","6","7","8h","9h","10h","11h")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityQuestionDisplayBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val bundle : Bundle?= intent.extras
        val display = bundle!!.getInt("position")
        val storageRef = FirebaseStorage.getInstance().reference.child("question/${ques[display]}.html")

        val localFile = File.createTempFile("temphtml","html")
        storageRef.getFile(localFile).addOnSuccessListener {
            if (binding.progressBar.visibility == View.VISIBLE){
                binding.progressBar.visibility = View.GONE
            }
            //binding.tvQues.text = localFile.readText()
            val webV = localFile.readText()
            binding.webView.loadData(webV,"text/html", "UTF-8")


        }.addOnFailureListener{
            Toast.makeText(this, "Failed to Retrieve Data, Check Internet Connection",Toast.LENGTH_LONG).show()
            if (binding.progressBar.visibility == View.VISIBLE){
                binding.progressBar.visibility = View.GONE
            }
        }


    }
}