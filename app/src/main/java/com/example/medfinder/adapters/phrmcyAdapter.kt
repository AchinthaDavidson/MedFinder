package com.example.medfinder.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.medfinder.R

class phrmcyAdapter(private var pharmacy:List<String>):
    RecyclerView.Adapter<phrmcyAdapter.ViewHolder>(){

    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val  phamcy : Button = itemView.findViewById(R.id.pha_1)

        init {
            itemView.setOnClickListener{v: View ->
                val position : Int = adapterPosition
                Toast.makeText(itemView.context,"clicked ${position+1}",Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.phamcylist,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return pharmacy.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.phamcy.text = pharmacy[position]
    }

}