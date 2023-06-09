package com.example.odev3.adapter

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.odev3.R


class ContactAdapter(private val context: Activity, private val title: Array<String>, private val imgid: Array<Int>)
    : ArrayAdapter<String>(context, R.layout.custom_list_contact, title) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val rootView = context.layoutInflater.inflate(R.layout.custom_list_contact, null, true)

        val titleText = rootView.findViewById(R.id.title) as TextView
        val imageView = rootView.findViewById(R.id.icon) as ImageView

        titleText.text = title[position]
        imageView.setImageResource(imgid[position])

        return rootView
    }
}