package com.example.loginviewandroidapp.Views.HomePageActivity.TabLayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.loginviewandroidapp.R
import com.example.loginviewandroidapp.databinding.ActivityTabLayoutBinding
import com.google.android.material.tabs.TabLayoutMediator

class TabLayoutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTabLayoutBinding
    private val fragmentLists = ArrayList<Fragment>()
    private val fragmentTitleList = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTabLayoutBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        fragmentLists.add(FirstFragment())
        fragmentLists.add(SecondFragment())
        fragmentLists.add(ThirdFragment())

        val adapter = ViewPagerAdapter(this)
        binding.viewPager.adapter = adapter

        fragmentTitleList.add("ONE")
        fragmentTitleList.add("TWO")
        fragmentTitleList.add("THREE")

        TabLayoutMediator(binding.tabLayout, binding.viewPager){ tab, position ->
            tab.text = fragmentTitleList[position]
        }.attach()

        binding.tabLayout.getTabAt(0)!!.setIcon(R.drawable.baseline_looks_one_24)
        binding.tabLayout.getTabAt(1)!!.setIcon(R.drawable.baseline_looks_two_24)
        binding.tabLayout.getTabAt(2)!!.setIcon(R.drawable.baseline_looks_3_24)



    }

    inner class ViewPagerAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity){
        override fun getItemCount(): Int {
            return fragmentLists.size
        }

        override fun createFragment(position: Int): Fragment {
            return fragmentLists[position]
        }

    }
}