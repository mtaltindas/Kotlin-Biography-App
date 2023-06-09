package com.example.odev3

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.widget.ListView
import android.widget.TextView
import com.example.odev3.adapter.UserCustomAdapter
import com.example.odev3.services.UserService
import com.example.odev3.AboutMe as AboutMe
//Mehmet Talha Altındaş
class MainActivity : AppCompatActivity() {
        lateinit var listView: ListView
        lateinit var textView_uni:TextView
        val userService = UserService()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.menuListView)
        textView_uni=findViewById(R.id.textView_uni)
        val customAdapter = UserCustomAdapter(this, userService.userResult())
        listView.adapter = customAdapter

        listView.setOnItemClickListener(){adapterView, view, position, id ->
            when(id){
                0L->{
                    intent = Intent(this, AboutMe::class.java)
                    startActivity(intent)
                }1L->{
                    intent = Intent(this, Gallery::class.java)
                    startActivity(intent)

                }2L->{
                    intent = Intent(this, Contact::class.java)
                    startActivity(intent)
                }3L->{
                    intent = Intent(this, Blog::class.java)
                    startActivity(intent)
                }
            }
        }


            val spannableString=SpannableString(getString(R.string.uni_info))
            val uni_color=ForegroundColorSpan(getColor(R.color.red_uni))
            spannableString.setSpan(uni_color,10,31,Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
            textView_uni.text=spannableString
    }
}