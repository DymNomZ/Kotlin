package com.example.task3

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import com.example.task3.app.MyApplication

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)

        val app = (application as MyApplication) // Cast to your custom Application class

        app.setUserId(123)
        app.setLoggedIn(true)
        app.setAppVersion(2.0)
        app.setAppName("Kotlin Task 3")

        val appName = app.getAppName()
        val userId = app.getUserId()
        val isLoggedIn = app.isLoggedIn()
        val appVersion = app.getAppVersion()
        val apiKey = app.getApiKey()

        textView.setText("""
            App Name: $appName
            User ID: $userId
            Logged In: $isLoggedIn
            App Version: $appVersion
            API Key: $apiKey
        """.trimIndent())

    }
}