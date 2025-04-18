package com.kotlin.madlabexam2  // Ensure it's in the same package as HomeActivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class CartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart) // Ensure activity_cart.xml exists
    }
}
