package com.example.medfinder.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.medfinder.R

class advertismentAdapter(private var advidheda:List<String>,
                          private var advid:List<String>,
                          private var advimg:List<String>,
                          private var advedt:List<String>,
                          private var advdlt:List<String> ):
    RecyclerView.Adapter<advertismentAdapter.ViewHolder>() {

        inner class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
            val adverIdhed : TextView = itemView.findViewById(R.id.adv_id_head)
            val adveredtId : TextView = itemView.findViewById(R.id.edt_adv_id)
            val adverimg : TextView = itemView.findViewById(R.id.adv_img_btn)
            val adverEdt : TextView = itemView.findViewById(R.id.edt_adv_btn)
            val adverDel : TextView = itemView.findViewById(R.id.dlt_adv_btn)

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val adv = LayoutInflater.from(parent.context).inflate(R.layout.advertismentlist,parent,false)
        return ViewHolder(adv)
    }

    override fun getItemCount(): Int {
        return advidheda.size
        return advid.size
        return advimg.size
        return advedt.size
        return advdlt.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.adverIdhed.text = advidheda[position]
        holder.adveredtId.text = advid[position]
        holder.adverimg.text = advimg[position]
        holder.adverEdt.text = advedt[position]
        holder.adverDel.text =  advdlt[position]

    }
}