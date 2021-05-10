package com.elvanerdem.bottomnavigationapp

import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.bottomnavigationapp.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var navView: BottomNavigationView
    private lateinit var navController: NavController

    private val childFragmentList = arrayOf(
        R.id.movieDetailsFragment,
        R.id.TVSeriesDetailFragment,
        R.id.TVSeriesOtherDetailFragment
    )
    private val childFragmentMenuList = arrayOf(0, 1, 1)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navView = findViewById(R.id.nav_view)

        navController = findNavController(R.id.nav_host_fragment)
        navView.setupWithNavController(navController)

        var appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_movies,
                R.id.navigation_tv_series,
                R.id.navigation_watch_list,
                R.id.navigation_search
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                navController.navigateUp()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }


    override fun onBackPressed() {
        navController.previousBackStackEntry?.let {
            val destinationFragment = it.destination.id
            if (childFragmentList.contains(destinationFragment)){
                navView.menu[childFragmentMenuList[childFragmentList.indexOf(destinationFragment)]].isChecked = true
            }
        }

        super.onBackPressed()
    }
}

