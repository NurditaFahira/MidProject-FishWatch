package com.example.midproject_nurdita_fishwatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.midproject_nurdita_fishwatch.UI.Home.HomeFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val fragment: Fragment = HomeFragment()
        val fragmentManager : FragmentManager = supportFragmentManager
        val fragmentTransaction : FragmentTransaction = fragmentManager.beginTransaction()

        if(savedInstanceState == null){
            fragmentTransaction.replace(R.id.container_fragment, fragment)
            fragmentTransaction.commitNow()
        }

        //fragmentTransaction.addToBackStack(null)

       // fragmentManager.executePendingTransactions()

    }
}