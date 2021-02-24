package com.example.stepeducation182

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var showWelcome: Button? = null;
    var welcomeText: TextView? = null;
    var editText: EditText? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeViews()
        initializeLiseners()
    }

    fun initializeViews() {
        showWelcome = findViewById(R.id.button_main_activity_press);
        welcomeText = findViewById(R.id.textView_main_activity_text);
        editText = findViewById(R.id.editText_main_activity_text)
    }

    fun initializeLiseners() {
        showWelcome?.setOnClickListener{
            welcomeText?.setText("Everithing looks fine!")
            for(char in editText!!.text) {
                if(Character.isDigit(char)) {
                    welcomeText?.setText("Error, we have digits in our name!")
                    break
                }
            }
        }
    }
}