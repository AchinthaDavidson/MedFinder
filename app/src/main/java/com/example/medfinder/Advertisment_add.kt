package com.example.medfinder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton


class Advertisment_add : AppCompatActivity() {

    lateinit var bck_to_adv_home:ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_advertisment_add)

        bck_to_adv_home = findViewById(R.id.bck_btn_adv_home)
    }

    fun bckToadvhome(view: View){
        val bck_adv_hm = Intent(this,Advertisments::class.java)
        startActivity(bck_adv_hm)
        finish()
    }
}