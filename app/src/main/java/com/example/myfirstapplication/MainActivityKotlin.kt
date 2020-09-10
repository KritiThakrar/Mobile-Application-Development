package com.example.myfirstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText


class MainActivityKotlin : AppCompatActivity() {
    companion object{
        const val MESSAGE_ID = "com.example.myfirstapplication.MESSAGE_ID"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_kotlin)
    }
    fun sendClicked(v: View){
        val messageEditText = findViewById<EditText>(R.id.message_et)
        val message : String= messageEditText.text.toString()
        val intent= Intent(this, DisplayMessageActivity::class.java)
            intent.putExtra(MESSAGE_ID, message)
            startActivity(intent)
    }
}