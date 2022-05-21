package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FifthPage : AppCompatActivity() {
    lateinit var btnPrev3 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth_page)

        btnPrev3 = findViewById(R.id.btnPrev3)
        btnPrev3.setOnClickListener {
            val intent = Intent(this, FourthPage::class.java)
            startActivity(intent)
        }
    }
}