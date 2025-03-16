package com.example.task2.utils

import android.app.Activity
import android.graphics.Color
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

// Extension functions for EditText
fun EditText.isEmpty(): Boolean = this.text.isNullOrEmpty()

fun EditText.toIntOrZero(): Int = this.text.toString().toIntOrNull() ?: 0

fun EditText.setTextColorRes(colorRes: Int) {
    this.setTextColor(ContextCompat.getColor(this.context, colorRes))
}

// Extension functions for TextView
fun TextView.setTextOrHide(text: String?) {
    if (text.isNullOrEmpty()) {
        this.visibility = View.GONE
    } else {
        this.text = text
        this.visibility = View.VISIBLE
    }
}

fun TextView.setBold() {
    this.setTypeface(android.graphics.Typeface.DEFAULT_BOLD)
}

fun TextView.setItalic(){
    this.setTypeface(android.graphics.Typeface.defaultFromStyle(android.graphics.Typeface.ITALIC))
}

// Extension functions for View
fun Button.setGreen() {
    this.setBackgroundColor(Color.GREEN)
    this.setText("Green")
}

fun Button.setRed() {
    this.setBackgroundColor(Color.RED)
    this.setText("Red")
}

fun Button.toggle() {
    if (this.text == "Green") this.setRed() else this.setGreen()
}

// Extension functions for String
fun String.capitalizeFirstLetter(): String {
    return if (isNotEmpty()) {
        substring(0, 1).uppercase() + substring(1)
    } else {
        this
    }
}

fun String.reverse(): String {
    return this.reversed()
}

fun String.countVowels(): Int {
    val vowels = "aeiouAEIOU"
    return count { it in vowels }
}

// Extension functions for Activity
fun Activity.showToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

fun Activity.getColorCompat(colorResId: Int): Int {
    return ContextCompat.getColor(this, colorResId)
}

fun Activity.setContentViewAndShowToast(layoutResId: Int, toastMessage:String){
    setContentView(layoutResId)
    showToast(toastMessage)
}