package com.example.medfinder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class DeleteAccount : AppCompatActivity() {

    lateinit var delbackToaccount : ImageButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delete_account)

        delbackToaccount = findViewById(R.id.del_myacc_bck_btn)
    }

    fun delbckmyaccount(view: View){
        val bcktomyacc = Intent(this,cus_myaccount::class.java)
        startActivity(bcktomyacc)
        finish()
    }
}