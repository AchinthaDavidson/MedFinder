package com.example.medfinder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class phamacy_register : AppCompatActivity() {

    lateinit var bck_cus_reg:ImageButton
    lateinit var phamacy_home:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phamacy_register)

        bck_cus_reg= findViewById(R.id.bck_btn_to_cus)
        phamacy_home=findViewById(R.id.pha_signup)
    }

    fun bckToCusReg(view: View){
        val bk_Btn_Cus_reg = Intent(this,signups::class.java)
        startActivity(bk_Btn_Cus_reg)
        finish()
    }

    fun phamcy_sign(view: View){
        val phamacy_signin = Intent(this,pharmacy_home::class.java)
        startActivity(phamacy_signin)
        finish()
    }
}