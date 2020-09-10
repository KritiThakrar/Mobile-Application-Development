package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony.BaseMmsColumns.MESSAGE_ID
import android.widget.TextView
import android.widget.Toast

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        val textView = findViewById<TextView>(R.id.message_tv)
        val message= intent.getStringExtra(MainActivityKotlin.MESSAGE_ID)
        textView.text= message
//        Toast.makeText(this,message, Toast.LENGTH_SHORT).show()

        }
    }
