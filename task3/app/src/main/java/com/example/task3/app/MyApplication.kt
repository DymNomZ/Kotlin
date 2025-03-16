package com.example.task3.app

import android.app.Application
import android.util.Log

class MyApplication : Application() {

    private var appName: String = "My App"
    private var appVersion: Double = 1.0
    private var userId: Int = 0
    private var isLoggedIn: Boolean = false
    private var apiKey: String = "sample_api_key_123"

    fun getAppName(): String = appName

    fun setAppName(name: String) {
        appName = name
    }

    fun getAppVersion(): Double = appVersion

    fun setAppVersion(version: Double) {
        appVersion = version
    }

    fun getUserId(): Int = userId

    fun setUserId(id: Int) {
        userId = id
    }

    fun isLoggedIn(): Boolean = isLoggedIn

    fun setLoggedIn(loggedIn: Boolean) {
        isLoggedIn = loggedIn
    }

    fun getApiKey(): String = apiKey

    fun setApiKey(key: String) {
        apiKey = key
    }

    override fun onCreate() {
        super.onCreate()
        Log.d("MyApplication", "Application started")
    }
}