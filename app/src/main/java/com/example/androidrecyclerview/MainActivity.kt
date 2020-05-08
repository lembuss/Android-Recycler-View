package com.example.androidrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mylist = listOf(
            ListItem("Brian Kirwa", "Student at eMobilis"),
            ListItem("Irene Nzole", "Student at eMobilis"),
            ListItem("Ian Otieno", "Student at eMobilis"),
            ListItem("Cheryl Mangeli", "Student at eMobilis")
        )

        RecyclerView.layoutManager = LinearLayoutManager(this)
        RecyclerView.adapter = ContentAdapter(mylist)
    }
}
