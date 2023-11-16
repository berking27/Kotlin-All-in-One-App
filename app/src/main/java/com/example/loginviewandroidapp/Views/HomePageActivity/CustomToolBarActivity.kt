package com.example.loginviewandroidapp.Views.HomePageActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import com.example.loginviewandroidapp.R
import com.example.loginviewandroidapp.databinding.ActivityCustomToolBarBinding
import com.google.android.material.snackbar.Snackbar

class CustomToolBarActivity : AppCompatActivity(), SearchView.OnQueryTextListener {
    private lateinit var binding: ActivityCustomToolBarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCustomToolBarBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.toolbar.title = "Toolbar Menu"
        setSupportActionBar(binding.toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu,menu)

        val item = menu.findItem(R.id.action_search)
        val searchView = item.actionView as SearchView
        searchView.setOnQueryTextListener(this)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.action_information -> {
                Snackbar.make(binding.toolbar,"Information Tapped",Snackbar.LENGTH_SHORT).show()
                return true
            }
            R.id.action_settings -> {
                Snackbar.make(binding.toolbar,"Settings Tapped",Snackbar.LENGTH_SHORT).show()
                return true
            }
            R.id.action_add -> {
                Snackbar.make(binding.toolbar,"Add Tapped",Snackbar.LENGTH_SHORT).show()
                return true
            }
            R.id.action_exit -> {
                Snackbar.make(binding.toolbar,"Exit Tapped",Snackbar.LENGTH_SHORT).show()
                return true
            }

            else -> return super.onOptionsItemSelected(item)
        }

    }

    override fun onQueryTextSubmit(query: String): Boolean {
        Log.e("onQueryTextSubmit",query)
        return true
    }

    override fun onQueryTextChange(newText: String): Boolean {
        Log.e("onQueryTextSubmit",newText)
        return true
    }

}