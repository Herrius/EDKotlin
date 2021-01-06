package com.example.edkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import org.w3c.dom.Text

class Adapter (val bebidaList:ArrayList<Bebida>):RecyclerView.Adapter<Adapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.lista,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(bebidaList[position])
    }

    override fun getItemCount(): Int {
        return bebidaList.size
    }
    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        fun bindItems(bebida: Bebida){
            val nombre:TextView=itemView.findViewById(R.id.titulo) as TextView
            val imagen:ImageView=itemView.findViewById(R.id.image) as ImageView
            val descripcion:TextView=itemView.findViewById(R.id.descripcion) as TextView

            nombre.text=bebida.nombre.toString()
            Glide.with(itemView).load(bebida.imagen.toString()).into(imagen)
            descripcion.text=bebida.descripcion.toString()
        }
    }
}