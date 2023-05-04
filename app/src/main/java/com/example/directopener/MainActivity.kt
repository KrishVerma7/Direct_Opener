package com.example.directopener

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val mailbtn: Button = findViewById(R.id.mailBtn)
        val browseBtn: Button = findViewById(R.id.browseBtn)
        val dialBtn: Button = findViewById(R.id.dialBtn)
        val editText: EditText = findViewById(R.id.editText2)
        mailbtn.setOnClickListener {
            val mail = editText.text.toString()
            val i = Intent()
            i.action=Intent.ACTION_SENDTO
            i.data= Uri.parse("mailto:$mail")
            startActivity(i)

        }
        browseBtn.setOnClickListener{
            val browser=editText.text.toString()
            val i=Intent()
            i.action=Intent.ACTION_VIEW
            i.data= Uri.parse("http://$browser")
            startActivity(i)
        }
        dialBtn.setOnClickListener{
            val dial=editText.text.toString()
            val i=Intent()
            i.action=Intent.ACTION_DIAL
            i.data= Uri.parse("tel:$dial")
            startActivity(i)
        }
    }
}