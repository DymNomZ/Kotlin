package com.example.task2

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.task2.utils.*

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentViewAndShowToast(R.layout.activity_main, "Layout set with toast")

        var editText = findViewById<EditText>(R.id.editText)
        var textView = findViewById<TextView>(R.id.textView)
        var simpleBtn = findViewById<Button>(R.id.simpleBtn)

        editText.setText("123")
        if (editText.isEmpty()) {
            showToast("EditText is empty")
        } else {
            val number = editText.toIntOrZero()
            textView.setText("Number: $number")
        }

        editText.setTextColorRes(android.R.color.holo_blue_dark)

        textView.setTextOrHide("Hello, World!")
        textView.setBold()
        textView.setItalic()

        simpleBtn.setOnClickListener {
            simpleBtn.toggle()
        }

        textView.setTextColor(getColorCompat(android.R.color.holo_red_dark))

        val sampleString = "hello world"

        val capitalizedString = sampleString.capitalizeFirstLetter()
        val reversedString = sampleString.reverse()
        val vowelCount = sampleString.countVowels()

        showToast(capitalizedString)
        showToast(reversedString)
        showToast("$vowelCount")

    }
}