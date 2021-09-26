package com.example.learnjava.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.learnjava.R

class Hard_RecyclerAdapter(private  var hqlistner : Hard_RecyclerAdapter.onHqueClickListener) : RecyclerView.Adapter<Hard_RecyclerAdapter.ViewHolder>(){

    interface onHqueClickListener{
        fun onHqueClick(position: Int)
    }

    fun setOnQueClickListener(listener: onHqueClickListener){
        hqlistner = listener
    }

    private var hardQuestion = arrayOf("1.Take an array of length n where all the numbers are nonnegative and unique. Find the element in the array possessing the highest value. Split the element into two parts where first part contains the next highest value in the array and second part hold the required additive entity to get the highest value. Print the array where the highest value get splitted into those two parts. Sample input: 4 8 6 3 2 Sample output: 4 6 2 6 3 2",
        "2.Write down the names of 10 of your friends in an array and then sort those in alphabetically ascending order.",
        "3.Input a string which contains some palindrome substrings. Find out the position of palindrome substrings if exist and replace it by *. (For example if input string is “bob has a radar plane” then it should convert in “*** has a ***** plane”.",
        "4.The Matrix class has methods for each of the following:, 1 - get the number of rows, 2 - get the number of columns, 3 - set the elements of the matrix at given position (i,j), 4 - adding two matrices. If the matrices are not addable, -Matrices cannot be added- will be displayed., 5 - multiplying the two matrices",
        "5.Create a class named 'PrintNumber' to print various numbers of different datatypes by creating different methods with the same name 'printn' having a parameter for each datatype.",
        "6.Ceiling of a number",
        "7. Floor of a number.",
        "8.Position of target element in infinite sorted array.",
        "9.Find rotation in an array.",
        "10.Given a positive integer num, write a function which returns True if num is a perfect square else False. Follow up: Do not use any built-in library function such as sqrt.",
        "11.Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target."
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Hard_RecyclerAdapter.ViewHolder {
        val m = LayoutInflater.from(parent.context).inflate(R.layout.quest_list, parent, false)

        return ViewHolder(m)
    }
    override fun getItemCount(): Int {
        return hardQuestion.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),View.OnClickListener {
        var hardTitle: TextView = itemView.findViewById(R.id.display)
        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = bindingAdapterPosition
            if (position!=RecyclerView.NO_POSITION) {
                if (v != null) {
                    hqlistner.onHqueClick(position)
                }
            }
        }

    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.hardTitle.text = hardQuestion[position]
    }

}