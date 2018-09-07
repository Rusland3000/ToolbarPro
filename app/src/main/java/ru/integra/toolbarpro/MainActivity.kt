package ru.integra.toolbarpro

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var toolb: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initToolbar()

        btn.setOnClickListener() {
            StartSettings()
            //Toast.makeText(this@MainActivity, "Start settings activity!", Toast.LENGTH_SHORT).show()

        }

    }

    private fun initToolbar() {
        toolb = findViewById<Toolbar>(R.id.toolbar)
        toolb.setTitle("Toolbar Title")
        toolb.setOnMenuItemClickListener { item -> StartSettings() }
        toolb.inflateMenu(R.menu.menu)

    }

    fun StartSettings(): Boolean {
        val intent = Intent(this, SettingsActivity::class.java)
        // To pass any data to next activity
        //intent.putExtra("keyIdentifier", value)
        startActivity(intent)
        return true
    }
}
