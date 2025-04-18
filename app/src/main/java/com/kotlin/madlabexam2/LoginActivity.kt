package com.kotlin.madlabexam2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Find the TextView for the SignUp link by ID
        val registerTextView = findViewById<TextView>(R.id.tvSignup)

        // Set an OnClickListener for Sign Up navigation
        registerTextView.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

        // Find the "Log In" button by ID
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        // Set an OnClickListener for "Log In" navigation
        btnLogin.setOnClickListener {
            // Create an Intent to navigate to HomeActivity
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)  // Start HomeActivity
        }
    }
}
