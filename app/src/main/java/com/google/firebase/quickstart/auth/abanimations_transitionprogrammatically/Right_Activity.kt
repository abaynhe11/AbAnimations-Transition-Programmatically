package com.google.firebase.quickstart.auth.abanimations_transitionprogrammatically

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Right_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_right)
        val Left : Button = findViewById(R.id.btn_left)
        Left.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right)
        }
    }
}