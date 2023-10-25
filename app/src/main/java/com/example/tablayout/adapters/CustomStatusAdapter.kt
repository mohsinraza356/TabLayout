package com.example.tablayout.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tablayout.R
import com.example.tablayout.models.StatusItemModel


class CustomStatusAdapter(private val statusList:List<StatusItemModel>)
    :RecyclerView.Adapter<CustomStatusAdapter.ViewHolder>(){
    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        val statusImage:ImageView=itemView.findViewById(R.id.statusImage)
        val statusUploader:TextView=itemView.findViewById(R.id.uploaderName)
        val statusTime:TextView=itemView.findViewById(R.id.statusTime)
    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.status_list_item,parent,false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val statusItem=statusList[position]
        holder.statusImage.setImageResource(statusItem.image)
        holder.statusUploader.text=statusItem.userName
        holder.statusTime.text=statusItem.statusTime
    }
    override fun getItemCount(): Int {
       return statusList.size
    }
}