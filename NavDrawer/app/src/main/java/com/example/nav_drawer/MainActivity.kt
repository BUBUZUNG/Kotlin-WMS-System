package com.example.nav_drawer

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast

import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)

        //เอาไว้เพิ่มปุ่ม hamberger ที่ actionbar
        var toggle = ActionBarDrawerToggle(
            this,
            drawer_layout,
            toolbar,
            R.string.nav_open,
            R.string.nav_close
        )
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()


        navigation_view.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_assessment -> {
                    //write your implementation here
                    Toast.makeText(this,"Assessment",Toast.LENGTH_LONG).show()
                    true
                }
                else -> {
                    if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
                        drawer_layout.closeDrawer(GravityCompat.START)
                    }
                    false
                }

            }

//        navigation_view.setNavigationItemSelectedListener { menuItem ->
//            when (menuItem.itemId) {
//                R.id.nav_gallery -> {
//                    //write your implementation here
//                    if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
//                        drawer_layout.closeDrawer(GravityCompat.START)
//                    }
//                    true
//                }
//                else -> {
//                    if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
//                        drawer_layout.closeDrawer(GravityCompat.START)
//                    }
//                    false
//                }
//            }
//        }

        }
    }

}

