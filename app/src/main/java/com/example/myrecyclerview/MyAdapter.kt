package com.example.myrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.card_items.view.*


class MyAdapter(var cardlist:ArrayList<CardList>):RecyclerView.Adapter<MyAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view =LayoutInflater.from(parent.context).inflate(R.layout.card_items,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val card = cardlist[position]
        holder.setData(card)
    }

    override fun getItemCount(): Int {
        return cardlist.size
    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        fun setData(card:CardList){
            itemView.name.text = card.name
            itemView.phone.text = card.phone
            itemView.address.text = card.address

        }

    }

}