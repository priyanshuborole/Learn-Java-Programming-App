package com.example.learnjava.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.learnjava.R

class Med_RecyclerAdapter(private var mqlistner : Med_RecyclerAdapter.onMqueClickListener) : RecyclerView.Adapter<Med_RecyclerAdapter.ViewHolder>(){
    interface onMqueClickListener{
        fun onMqueClick(position: Int)
    }

    fun setOnQueClickListener(listener: onMqueClickListener){
        mqlistner = listener
    }
    private var mediumques = arrayOf("1.Take integer inputs from user until he/she presses q ( Ask to press q to quit after every integer input ). Print average and product of all numbers.",
        "2.Write all Armstrong numbers between 100 to 500.",
        "3.Write a program to find prime factor of a number. If a factor of a number is prime number then it is its prime factor.",
        "4.Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.",
        "5.Define a method to find out if number is prime or not.",
        "6.Write a program to shift every element of an array to circularly right. E.g.-INPUT : 1 2 3 4 5  OUTPUT : 5 1 2 3 4",
        "7.Write a program to check if a given string is a Palindrome.. A palindrome reads same from front and back e.g.- aba, ccaacc, mom, etc.",
        "8.Create a class named 'Member' having the following members: Data members1 - Name, 2 - Age, 3 - Phone number, 4 - Address, 5 - Salary",
        "9.Create a class with a method that prints -This is parent class- and its subclass with another method that prints -This is child class-. Now, create an object for each of the class and call 1 - method of parent class by object of parent class. 2 - method of child class by object of child class. 3 - method of parent class by object of child class.",
    "10.Write a program to print the names of students by creating a Student class. If no name is passed while creating an object of Student class, then the name should be Unknown, otherwise the name should be equal to the String value passed while creating object of Student class."
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Med_RecyclerAdapter.ViewHolder {
        val m = LayoutInflater.from(parent.context).inflate(R.layout.quest_list, parent, false)

        return ViewHolder(m)
    }
    override fun getItemCount(): Int {
        return mediumques.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),View.OnClickListener {
        var medTitle: TextView = itemView.findViewById(R.id.display)
        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = bindingAdapterPosition
            if (position!=RecyclerView.NO_POSITION) {
                if (v != null) {
                    mqlistner.onMqueClick(position)
                }
            }
        }

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.medTitle.text = mediumques[position]
    }

}