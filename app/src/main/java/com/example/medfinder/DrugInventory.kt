package com.example.medfinder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class DrugInventory : AppCompatActivity() {

    lateinit var bck_to_pha_hme:ImageButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drug_inventory)

        bck_to_pha_hme = findViewById(R.id.bck_btn_to_pha_home)
    }

    fun bck_To_phaHome(view:View){
        val bck_pha_home = Intent(this,pharmacy_home::class.java)
        startActivity(bck_pha_home)
        finish()
    }

}