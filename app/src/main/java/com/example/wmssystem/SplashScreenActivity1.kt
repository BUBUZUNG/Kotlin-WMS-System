package com.example.wmssystem

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SplashScreenActivity1 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen1)

        val ivBlt: TextView = findViewById(R.id.DevLogo)

        ivBlt.alpha = 0f
        ivBlt.animate().setDuration(1500).alpha(1f).withEndAction{
            val intent = Intent(this, SplashScreenActivity2::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }
    }
}