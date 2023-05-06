package com.example.medfinder

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class pha_myaccount : AppCompatActivity() {

    lateinit var bckphahome:ImageButton ;

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pha_myaccount)

        bckphahome = findViewById(R.id.bck_btn_prof_to_pha_home)
    }

    fun bckTophaHome(view: View){
        val p_home = Intent(this,pharmacy_home::class.java)
        startActivity(p_home)
        finish()
    }
}