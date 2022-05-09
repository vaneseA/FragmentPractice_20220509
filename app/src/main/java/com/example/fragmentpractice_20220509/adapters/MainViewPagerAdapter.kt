package com.example.fragmentpractice_20220509.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.fragmentpractice_20220509.fragments.BirthYearFragment
import com.example.fragmentpractice_20220509.fragments.HelloFragment
import com.example.fragmentpractice_20220509.fragments.NameFragment

class MainViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount() = 3

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> NameFragment()
            1 -> BirthYearFragment()
            else -> HelloFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
            return when (position) {
                0 -> "이름"
                1 -> "생년"
                else -> "인사"
        }
    }
}
