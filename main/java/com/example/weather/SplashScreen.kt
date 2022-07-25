package com.example.weather

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()

        supportActionBar?.hide()
        Handler().postDelayed({
            val intent= Intent(this,CityName::class.java)
            finish()
            startActivity(intent)
        },2000)
    }
}