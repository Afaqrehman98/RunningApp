package com.example.mvvmrunningapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.mvvmrunningapp.R
import com.example.mvvmrunningapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

//        val navController = findNavController(R.id.nav_host_fragment)
//
//        setSupportActionBar(activityMainBinding.toolbar)
//        activityMainBinding.bottomNavigationView.setupWithNavController(activityMainBinding.navHostFragment.findNavController())
//
//        val navHost = FindVi
//        activityMainBinding.navHostFragment.findNavController()
//            .addOnDestinationChangedListener { _, destination, _ ->
//                when (destination.id) {
//                    R.id.settingsFragment, R.id.runFragment, R.id.statisticsFragment ->
//                        bottomNavigationView.visibility = View.VISIBLE
//                    else -> bottomNavigationView.visibility = View.GONE
//                }
//            }
    }
}