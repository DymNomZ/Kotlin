package com.example.task1

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class RegisterActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val usernameET = findViewById<EditText>(R.id.usernameET)
        val passwordET = findViewById<EditText>(R.id.passwordET)

        val registerBtn = findViewById<Button>(R.id.registerBtn)
        registerBtn.setOnClickListener{

            val intent = Intent(this, LoginActivity::class.java).apply{
                putExtra("username", usernameET.text.toString())
                putExtra("password", passwordET.text.toString())
            }

            startActivity(intent)
        }
    }
}