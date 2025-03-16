package com.example.task1

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val usernameET = findViewById<EditText>(R.id.usernameET)
        val passwordET = findViewById<EditText>(R.id.passwordET)

        intent?.let {
            it.getStringExtra("username").let{ username ->
                usernameET.setText(username)
            }
            it.getStringExtra("password").let{ password ->
                passwordET.setText(password)
            }
        }

        val loginBtn = findViewById<Button>(R.id.loginBtn)
        loginBtn.setOnClickListener{

            val intent = Intent(this, ProfileActivity::class.java).apply{
                putExtra("username", usernameET.text.toString())
                putExtra("password", passwordET.text.toString())
            }

            startActivity(intent)
        }

    }
}