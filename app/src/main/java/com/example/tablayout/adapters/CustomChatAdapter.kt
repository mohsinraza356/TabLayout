package com.example.tablayout.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tablayout.R
import com.example.tablayout.models.ChatItemModel

class CustomChatAdapter(private val chatList:List<ChatItemModel>)
    :RecyclerView.Adapter<CustomChatAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.chat_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val item=chatList[position]
        holder.userName.text=item.name
        holder.message.text=item.message
        holder.time.text=item.time
        holder.image.setImageResource(item.image)
    }

    override fun getItemCount(): Int {
        return chatList.size
    }

    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        val image:ImageView=itemView.findViewById(R.id.image)
        val userName:TextView=itemView.findViewById(R.id.name)
        val message:TextView=itemView.findViewById(R.id.message)
        val time:TextView=itemView.findViewById(R.id.time)
    }
}