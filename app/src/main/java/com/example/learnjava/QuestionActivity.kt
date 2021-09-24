package com.example.learnjava

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.learnjava.adapter.FragmentAdapter
import com.example.learnjava.fragment.Easy
import com.example.learnjava.fragment.Hard
import com.example.learnjava.fragment.Medium
import com.google.android.material.tabs.TabLayout

class QuestionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)
        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        val tablayout = findViewById<TabLayout>(R.id.tabLayout)
        val fragmentAdapter = FragmentAdapter(supportFragmentManager)
        fragmentAdapter.addFragment(Easy() , "Easy")
        fragmentAdapter.addFragment(Medium() , "Medium.kt")
        fragmentAdapter.addFragment(Hard() , "Hard")

        viewPager.adapter = fragmentAdapter
        tablayout.setupWithViewPager(viewPager)

    }
}