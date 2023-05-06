package com.example.medfinder

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class cus_drugs : AppCompatActivity() {

    lateinit var back_to_phahome :ImageButton
    lateinit var cht_btn :ImageButton

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cus_drugs)

        back_to_phahome = findViewById(R.id.cus_req_to_pha_home)
        cht_btn = findViewById(R.id.chat_btn)
    }

    fun bckTophaHomeDrugreqs(view: View){
        val cus_list_to_pha_home = Intent(this,pharmacy_home::class.java)
        startActivity(cus_list_to_pha_home)
        finish()
    }

    fun msgTocus(view:View){
        val cus_chat = Intent(this,pha_chat_to_customer::class.java)
        startActivity(cus_chat)
        finish()
    }
}