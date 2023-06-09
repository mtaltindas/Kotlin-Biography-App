package com.example.odev3.adapter

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.odev3.R
import com.example.odev3.models.User

class UserCustomAdapter(private val context: Activity, private val list: List<User>) : ArrayAdapter<User>(context,R.layout.custom_list_item, list ) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val rootView = context.layoutInflater.inflate(R.layout.custom_list_item, null, true)

        val r_title = rootView.findViewById<TextView>(R.id.r_title)

        val r_image = rootView.findViewById<ImageView>(R.id.r_img)

        val user = list.get(position)

        r_title.text = "${user.name}"
        Glide.with(rootView).load(user.image).into(r_image)

        return rootView
    }
}