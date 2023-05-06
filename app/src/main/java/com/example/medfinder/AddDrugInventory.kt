package com.example.medfinder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class AddDrugInventory : AppCompatActivity() {

    lateinit var bck_to_pha_hme_drug_add: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_drug_inventory)

        bck_to_pha_hme_drug_add = findViewById(R.id.bck_btn_to_pha_home_from_add)
    }

    fun bck_To_phaHome_drag_add(view: View){
        val bck_home_add_drug = Intent(this,pharmacy_home::class.java)
        startActivity(bck_home_add_drug)
        finish()
    }
}