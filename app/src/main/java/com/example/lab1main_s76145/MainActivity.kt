package com.example.lab1main_s76145

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val editName= findViewById<EditText>(R.id.editName);
        val buttonPressMe = findViewById<Button>(R.id.buttonPressMe)
        val showHello = findViewById<TextView>(R.id.showHello)

        buttonPressMe.setOnClickListener {
            val name =editName.text.toString().trim()
            if (name.isEmpty()){
                Toast.makeText(this,"Please enter name",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this,"Assalamualaikum,hi. $name",Toast.LENGTH_SHORT).show()
            }
        }

    }
}