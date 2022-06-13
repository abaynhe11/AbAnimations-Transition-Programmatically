package com.google.firebase.quickstart.auth.abanimations_transitionprogrammatically

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Right : Button = findViewById(R.id.btn_right)
        Right.setOnClickListener {
            val intent = Intent(this,Right_Activity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
    }
}