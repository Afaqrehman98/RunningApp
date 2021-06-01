package com.example.mvvmrunningapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.mvvmrunningapp.R
import com.example.mvvmrunningapp.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        setSupportActionBar(activityMainBinding.toolbar)

        val bottomNavigation = activityMainBinding.bottomNavigationView
        val navController = findNavController(R.id.nav_host_fragment_container)

        bottomNavigation.setupWithNavController(navController)

        val appBarConfiguration =
            AppBarConfiguration(
                setOf(
                    R.id.settingsFragment,
                    R.id.runFragment,
                    R.id.statisticsFragment
                )
            )

        setupActionBarWithNavController(navController, appBarConfiguration)

    }
}