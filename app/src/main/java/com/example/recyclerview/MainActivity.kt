package com.example.recyclerview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView= findViewById<RecyclerView>(R.id.recyclerview)
        recyclerView.layoutManager=LinearLayoutManager(this)
        val data = ArrayList<Contact>()
        for(i in 1..2000){
            data.add(Contact(R.drawable.ic_launcher_foreground, "Item "+i))
        }
        val adapter= ContactAdapter(data)
        recyclerView.adapter=adapter
    }
}

