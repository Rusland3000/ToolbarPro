package ru.integra.toolbarpro

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_settings.*

class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        setSupportActionBar(toolbar)

        //supportActionBar?.setDisplayHomeAsUpEnabled(true);
        //supportActionBar?.setDisplayShowHomeEnabled(true);





        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_activity_main, menu)

        val searchMenuItem = menu?.findItem(R.id.action_search)
        searchMenuItem?.isVisible = false

        val microMenuItem = menu?.findItem(R.id.action_micro) //
        microMenuItem?.isVisible = false

        return true // super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        Log.e("error", item.toString())
        return super.onOptionsItemSelected(item)
    }
}
