package com.example.room_database.fragments.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.room_database.R
import com.example.room_database.data.User

class Listadapter:RecyclerView.Adapter<Listadapter.MyViweHolder>() {
    private var userlist= emptyList<User>()



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViweHolder {
        return MyViweHolder(LayoutInflater.from(parent.context).inflate(R.layout.custom,parent,false))


    }

    override fun getItemCount(): Int {
        return userlist.size

    }

    override fun onBindViewHolder(holder: MyViweHolder, position: Int) {
        val currentItem=userlist[position]


        holder.itemView.findViewById<TextView>(R.id.t1).text=currentItem.id.toString()
        holder.itemView.findViewById<TextView>(R.id.t2).text= currentItem.firstname
        holder.itemView.findViewById<TextView>(R.id.t3).text= currentItem.lastname
        holder.itemView.findViewById<TextView>(R.id.t4).text= currentItem.age
    }
    fun setData(user:List<User>){
        this.userlist=user
        notifyDataSetChanged()
    }
    class MyViweHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

}