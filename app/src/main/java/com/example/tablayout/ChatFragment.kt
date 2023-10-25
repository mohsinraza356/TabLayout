package com.example.tablayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tablayout.adapters.CustomChatAdapter
import com.example.tablayout.models.ChatItemModel


class ChatFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_chat, container, false)
        val recyclerView:RecyclerView=view.findViewById(R.id.recyclerView)
        val dataList=ArrayList<ChatItemModel>()
        dataList.add(ChatItemModel(R.drawable.profile,"Ali","Hi","12:00pm"))
        dataList.add(ChatItemModel(R.drawable.profile,"Rabia","Hello","11:58am"))
        dataList.add(ChatItemModel(R.drawable.profile,"Saim","How are you?","11:50am"))
        dataList.add(ChatItemModel(R.drawable.profile,"Hashim","Waiting for you","11:45am"))
        dataList.add(ChatItemModel(R.drawable.profile,"Daim","At 12","11:42am"))
        dataList.add(ChatItemModel(R.drawable.profile,"Mohsin","Will meet you soon","11:30am"))
        dataList.add(ChatItemModel(R.drawable.profile,"Hamza","It's been long to see you","10:50am"))
        dataList.add(ChatItemModel(R.drawable.profile,"Farhad","Lunch at 1:00pm","10:37am"))
        dataList.add(ChatItemModel(R.drawable.profile,"Moon","When will you come?","10:09am"))
        dataList.add(ChatItemModel(R.drawable.profile,"Arham","When is the plan?","10:00am"))
        dataList.add(ChatItemModel(R.drawable.profile,"Fareed","I am fine.","09:59am"))
        dataList.add(ChatItemModel(R.drawable.profile,"Ahmed",":)","09:39am"))
        dataList.add(ChatItemModel(R.drawable.profile,"Hasib",":)","09:39am"))
        dataList.add(ChatItemModel(R.drawable.profile,"Hassan",":)","09:39am"))
        val adapter= CustomChatAdapter(dataList)
        recyclerView.adapter=adapter
        return view

    }



}