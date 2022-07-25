package com.example.weather

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class CityName : AppCompatActivity() {

    private lateinit var et_name: EditText
    private lateinit var btn_start: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_city_name)

        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()

        et_name=findViewById(R.id.et_name)
        btn_start=findViewById(R.id.btn_start)

        btn_start.setOnClickListener {
            if(et_name.text.toString().isEmpty()){
                Toast.makeText(this,"Enter City name ",Toast.LENGTH_SHORT).show()
            }
            else{
                val intent= Intent(this,MainActivity::class.java)
                intent.putExtra("CITY_NAME",et_name.text.toString())
                startActivity(intent)
            }
        }
    }
}