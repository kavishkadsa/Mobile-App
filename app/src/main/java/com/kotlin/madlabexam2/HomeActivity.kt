package com.kotlin.madlabexam2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Find the ImageView by ID for Pizza, Burger, Settings, Profile, and Exit
        val pizzaImageView = findViewById<ImageView>(R.id.pizzaIcon)
        val burgerImageView = findViewById<ImageView>(R.id.burgerIcon)
        val settingsImageView = findViewById<ImageView>(R.id.settingsIcon)
        val profileImageButton = findViewById<ImageButton>(R.id.profileIcon)
        val exitImageView = findViewById<ImageView>(R.id.cartIcon)

        // Set OnClickListener for Pizza Image
        pizzaImageView.setOnClickListener {
            // Navigate to ActivityPizzaMenu when Pizza Image is clicked
            val intent = Intent(this, ActivityPizzaMenu::class.java)
            startActivity(intent)
        }

        // Set OnClickListener for Burger Image
        burgerImageView.setOnClickListener {
            // Navigate to ActivityBurgerMenu when Burger Image is clicked
            val intent = Intent(this, ActivityBurgerMenu::class.java)
            startActivity(intent)
        }

        // Set OnClickListener for Settings ImageView
        settingsImageView.setOnClickListener {
            // Navigate to Settings Activity when Settings Image is clicked
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }

        // Set OnClickListener for Profile ImageButton
        profileImageButton.setOnClickListener {
            // Navigate to Profile Activity when Profile ImageButton is clicked
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        // Set OnClickListener for Exit ImageView
        exitImageView.setOnClickListener {
            // Navigate to Exit Activity when Exit Image is clicked
            val intent = Intent(this, ExitActivity::class.java)
            startActivity(intent)
        }
    }
}
