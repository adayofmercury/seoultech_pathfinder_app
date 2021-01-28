package com.example.pathfinderapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class ShowmapActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_showmap)

        this.supportActionBar?.hide()

        val course1 : ImageView = findViewById(R.id.course1)
        val course2 : ImageView = findViewById(R.id.course2)
        val course3 : ImageView = findViewById(R.id.course3)
        val course4 : ImageView = findViewById(R.id.course4)
        val course5 : ImageView = findViewById(R.id.course5)
        val course6 : ImageView = findViewById(R.id.course6)
        val course7 : ImageView = findViewById(R.id.course7)

        course1.setOnClickListener {
            val intent = Intent(this, Course1Activity::class.java)
            startActivity((intent))
        }
        course2.setOnClickListener {
            val intent = Intent(this, Course2Activity::class.java)
            startActivity((intent))
        }
        course3.setOnClickListener {
            val intent = Intent(this, Course3Activity::class.java)
            startActivity((intent))
        }
        course4.setOnClickListener {
            val intent = Intent(this, Course4Activity::class.java)
            startActivity((intent))
        }
        course5.setOnClickListener {
            val intent = Intent(this, Course5Activity::class.java)
            startActivity((intent))
        }
        course6.setOnClickListener {
            val intent = Intent(this, Course6Activity::class.java)
            startActivity((intent))
        }
        course7.setOnClickListener {
            val intent = Intent(this, Course7Activity::class.java)
            startActivity((intent))
        }
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) hideSystemUI()
    }

    private fun hideSystemUI() {
        // Enables regular immersive mode.
        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_IMMERSIVE
                // Set the content to appear under the system bars so that the
                // content doesn't resize when the system bars hide and show.
                or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                // Hide the nav bar and status bar
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_FULLSCREEN)
    }

    // Shows the system bars by removing all the flags
    // except for the ones that make the content appear under the system bars.
    private fun showSystemUI() {
        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)
    }
}