package com.example.odev3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.odev3.adapter.GalleryAdapter

class Gallery : AppCompatActivity() {


    lateinit var listView: ListView
    val titles = arrayOf<String>("Project1","Project2","Project3","Project4","Project5")
    val imageId = arrayOf<Int>(
        R.drawable.project1,R.drawable.project2,R.drawable.project3,R.drawable.project4,R.drawable.project5
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)
        listView = findViewById(R.id.listView)

        val myListAdapter = GalleryAdapter(this,titles,imageId)
        listView.adapter = myListAdapter

        listView.setOnItemClickListener(){adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)
        }
    }
}