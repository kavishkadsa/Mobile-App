package com.kotlin.madlabexam2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class OnboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard)

        val nextButton = findViewById<Button>(R.id.button3)

        nextButton.setOnClickListener {
            // Navigates to the GetStartActivity
            val intent = Intent(this, GetStartActivity::class.java)
            startActivity(intent)
        }
    }
}