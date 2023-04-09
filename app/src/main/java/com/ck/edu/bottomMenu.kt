package com.ck.edu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import fragments.account
import fragments.dashFragment
import fragments.homeFragment
import kotlinx.android.synthetic.main.activity_menu_page_layout.*


class bottomMenu : AppCompatActivity() {

    private val homeFrag= homeFragment()
    private val accountFrag= account()
    private val dashboard= dashFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_page_layout)
        replaceFragment(accountFrag)

        bottom_navigation.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.baseline_dashboard ->replaceFragment(dashboard)
                R.id.baseline_account ->replaceFragment(accountFrag)
                R.id.baseline_home-> replaceFragment(homeFrag)
            }
            true
        }
    }
    private fun replaceFragment(fragment: Fragment){
        if(fragment !=null){
            val transaction=supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()
        }
    }
}