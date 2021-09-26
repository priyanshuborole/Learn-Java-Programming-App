package com.example.learnjava.adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.learnjava.R

class Easy_RecyclerAdapter(private  var eqlistner : Easy_RecyclerAdapter.onEqueClickListener)  : RecyclerView.Adapter<Easy_RecyclerAdapter.ViewHolder>(){
    private var easyQuestion = arrayOf("1.Take name as input and print a greeting message for that name.","2.Print the pattern on the screen","3.Take side of a square from user and print area and perimeter of it.",
        "4. A shop will give discount of 10% if the cost of purchased quantity is more than 1000.Ask user for quantity. Suppose, one unit will cost 100.Judge and print total cost for user.",
        "5. A school has following rules for grading system:a. Below 25 - F, b. 25 to 45 - E, c. 45 to 50 - D, d. 50 to 60 - C, e. 60 to 80 - B, f. Above 80 - A. Ask user to enter marks and print the corresponding grade.",
        "6. A 4 digit number is entered through keyboard. Write a program to print a new number with digits reversed as of orignal one. E.g.- INPUT : 1234   OUTPUT : 4321",
        "7.Write a Java program to calculate factorial of a number.",
        "8.Write a program to print the sum of two numbers entered by user by defining your own method.",
        "9.Take 10 integer inputs from user and store them in an array and print them on screen.",
        "10.Find largest and smallest elements of an array.",
        "11.Write a program to check if the letter 'e' is present in the word 'Umbrella'.",
        "12.Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as John by creating an object of the class Student.",
        "13.Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor."
    )

    var easySize = easyQuestion.size

    interface onEqueClickListener{
        fun onEqueClick(position: Int)
    }

    fun setOnQueClickListener(listener: onEqueClickListener){
        eqlistner = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Easy_RecyclerAdapter.ViewHolder {
        val e = LayoutInflater.from(parent.context).inflate(R.layout.quest_list, parent, false)

        return ViewHolder(e)
    }

    override fun onBindViewHolder(holder: Easy_RecyclerAdapter.ViewHolder, position: Int) {
        holder.EasyTitle.text = easyQuestion[position]
    }

    override fun getItemCount(): Int {
        return easyQuestion.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),View.OnClickListener {
        var EasyTitle: TextView = itemView.findViewById(R.id.display)
        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = bindingAdapterPosition
            if (position!=RecyclerView.NO_POSITION) {
                if (v != null) {
                    eqlistner.onEqueClick(position)
                }
            }
        }

    }
}