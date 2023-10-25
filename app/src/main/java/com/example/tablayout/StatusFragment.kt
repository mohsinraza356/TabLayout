package com.example.tablayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tablayout.adapters.CustomStatusAdapter
import com.example.tablayout.models.StatusItemModel

class StatusFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_status, container, false)
        val recyclerView:RecyclerView=view.findViewById(R.id.statusRecyclerView)
        val statusData=ArrayList<StatusItemModel>()
        statusData.add(StatusItemModel(R.drawable.profile,"Alia","27 minutes ago"))
        statusData.add(StatusItemModel(R.drawable.person7,"Hania","30 minutes ago"))
        statusData.add(StatusItemModel(R.drawable.person,"Ali","32 minutes ago"))
        statusData.add(StatusItemModel(R.drawable.profile_photo1,"Faria","34 minutes ago"))
        statusData.add(StatusItemModel(R.drawable.person5,"Hadia","39 minutes ago"))
        statusData.add(StatusItemModel(R.drawable.person2,"Basit","41 minutes ago"))
        statusData.add(StatusItemModel(R.drawable.person3,"Sheru","45 minutes ago"))
        statusData.add(StatusItemModel(R.drawable.person4,"Hamid","54 minutes ago"))
        val adapter= CustomStatusAdapter(statusData)
        recyclerView.adapter=adapter
        return view
    }

}