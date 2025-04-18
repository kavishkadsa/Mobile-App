package com.kotlin.madlabexam2

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Find the back arrow by ID and set the OnClickListener to navigate back
        val backArrow = findViewById<ImageView>(R.id.back_Arrow)
        backArrow.setOnClickListener {
            onBackPressed() // This will navigate back to the previous activity (HomeActivity)
        }
    }
}
