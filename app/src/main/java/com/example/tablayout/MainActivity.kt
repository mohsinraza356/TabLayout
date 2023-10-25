package com.example.tablayout

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.tablayout.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private val tabsArray = arrayOf(
        "Chats","Status","Calls"
    )
    //private val fragmentList: List<Fragment> = listOf(ChatFragment(), StatusFragment(), CallsFragment())
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        setSupportActionBar(binding.toolBar)
        setTabsAdapter()
        getTabsTitle()
        binding.viewPager.registerOnPageChangeCallback(object:ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                updateFabForFragment(position)
            }

        }        )
    }
    private fun setTabsAdapter(){
        val adapter=TabAdapter(supportFragmentManager,lifecycle)
        binding.viewPager.adapter=adapter
    }
    private fun getTabsTitle(){
        TabLayoutMediator(binding.tabs,binding.viewPager){tab,position->
            tab.text=tabsArray[position]
        }.attach()
    }
    private fun updateFabForFragment(position:Int){
        when(position){
            0->{
                binding.floatingActionButton.setImageResource(R.drawable.new_chat)
                binding.floatingActionButtonEdit.hide()
                binding.floatingActionButton.setOnClickListener {  }
            }
            1->{
                binding.floatingActionButton.setImageResource(R.drawable.new_status)
                binding.floatingActionButtonEdit.show()
                binding.floatingActionButton.setOnClickListener {  }
            }
            2->{
                binding.floatingActionButton.setImageResource(R.drawable.new_call)
                binding.floatingActionButtonEdit.hide()
                binding.floatingActionButton.setOnClickListener {
                }
        }
    }


}
}