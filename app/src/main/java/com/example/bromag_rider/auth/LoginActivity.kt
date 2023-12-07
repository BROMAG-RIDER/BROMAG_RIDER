package com.example.bromag_rider.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.bromag_rider.MainActivity
import com.example.bromag_rider.R

class LoginActivity : AppCompatActivity() {

    var login: Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login=findViewById(R.id.btnLogin)
        login?.setOnClickListener{
            val intent= Intent(this, MainActivity ::class.java)
            startActivity(intent)
        }
    }
}