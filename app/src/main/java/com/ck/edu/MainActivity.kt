package com.ck.edu

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        login.setOnClickListener{
            val Intent= Intent(this,com.ck.edu.bottomMenu::class.java)
            startActivity(Intent)
        }
        sign.setOnClickListener{
            val Intent= Intent(this,com.ck.edu.register::class.java)
            startActivity(Intent)
        }

    }






}