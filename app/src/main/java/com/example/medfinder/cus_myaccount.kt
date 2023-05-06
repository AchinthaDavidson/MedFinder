package com.example.medfinder

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class cus_myaccount : AppCompatActivity() {

    lateinit var bkhome : ImageButton
    lateinit var edtdetils : Button
    lateinit var delaccount : Button
    lateinit var chngepw : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cus_myaccount)

        bkhome = findViewById(R.id.bck_btn_home)
        delaccount = findViewById(R.id.my_Acc_Delete)
        chngepw = findViewById(R.id.my_Acc_change_pw)
    }

    fun bckTohome(view: View){
        val bckhome = Intent(this,home::class.java)
        startActivity(bckhome)
        finish()
    }

    fun btnDeleteAcc(view: View){
        val delacc = Intent(this,DeleteAccount::class.java)
        startActivity(delacc)
        finish()
    }

    fun ChngPWacc(view: View){
        val changepwacc = Intent(this,change_pw::class.java)
        startActivity(changepwacc)
        finish()
    }
}