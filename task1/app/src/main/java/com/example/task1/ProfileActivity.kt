package com.example.task1

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class ProfileActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val usernameTV = findViewById<TextView>(R.id.usernameTV)
        val passwordTV = findViewById<TextView>(R.id.passwordTV)

        intent?.let {
            it.getStringExtra("username").let{ username ->
                usernameTV.setText(username)
            }
            it.getStringExtra("password").let{ password ->
                passwordTV.setText(password)
            }
        }

    }
}