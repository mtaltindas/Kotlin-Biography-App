package com.example.odev3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.odev3.adapter.ContactAdapter

class Contact : AppCompatActivity() {
    lateinit var listView: ListView
    val titles = arrayOf<String>("mtaltindas@gmail.com","/mtaltindas","/mtaltindas")
    val imageId = arrayOf<Int>(
        R.drawable.mail,R.drawable.linkedin,R.drawable.insta,
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)
        listView = findViewById(R.id.listView)

        val myListAdapter = ContactAdapter(this,titles,imageId)
        listView.adapter = myListAdapter

        listView.setOnItemClickListener(){adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)
        }

    }
}