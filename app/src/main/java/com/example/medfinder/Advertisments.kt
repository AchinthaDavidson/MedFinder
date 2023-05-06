package com.example.medfinder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.medfinder.adapters.advertismentAdapter

class Advertisments : AppCompatActivity() {

    lateinit var add_adv:Button
    private var advidhead = mutableListOf<String>()
    private var advid = mutableListOf<String>()
    private var advimg = mutableListOf<String>()
    private var advedt = mutableListOf<String>()
    private var advdet= mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_advertisments)

        add_adv = findViewById(R.id.adv_add_page)

        val recyclerView:RecyclerView = findViewById(R.id.rec_view_advlist)
        val adapter = advertismentAdapter(advidhead,advid,advimg,advedt,advdet)

        recyclerView.adapter=adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    fun toaddadvpge(view: View){
        val add_adv_pge = Intent(this,Advertisment_add::class.java)
        startActivity(add_adv_pge)
        finish()
    }

}