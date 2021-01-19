package com.example.pathfinderapp

import android.content.pm.ActivityInfo
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView
import androidx.core.view.isVisible

class HowtoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_howto)
        this.supportActionBar?.hide()

        val prev : (Button) = findViewById(R.id.prev)
        val next : (Button) = findViewById(R.id.next)
        val togglekoreng : (Button) = findViewById(R.id.togglekoreng)


        val backbtn : (ImageView) = findViewById(R.id.backBtn)

        val kor1 : (ImageView) = findViewById(R.id.kor1)
        val kor2 : (ImageView) = findViewById(R.id.kor2)
        val kor3 : (ImageView) = findViewById(R.id.kor3)

        val eng1 : (ImageView) = findViewById(R.id.eng1)
        val eng2 : (ImageView) = findViewById(R.id.eng2)
        val eng3 : (ImageView) = findViewById(R.id.eng3)

        prev.visibility = View.INVISIBLE

        backbtn.setOnClickListener {
            finish()
        }

        next.setOnClickListener {
            if (kor1.visibility == View.VISIBLE) {
                kor1.visibility = View.INVISIBLE
                kor2.visibility = View.VISIBLE
                prev.visibility = View.VISIBLE
            }
            else if (kor2.visibility == View.VISIBLE) {
                kor2.visibility = View.INVISIBLE
                kor3.visibility = View.VISIBLE
                next.visibility = View.INVISIBLE
            }

            else if (eng1.visibility == View.VISIBLE) {
                eng1.visibility = View.INVISIBLE
                eng2.visibility = View.VISIBLE
                prev.visibility = View.VISIBLE
            }
            else if (eng2.visibility == View.VISIBLE) {
                eng2.visibility = View.INVISIBLE
                eng3.visibility = View.VISIBLE
                next.visibility = View.INVISIBLE
            }

        }

        prev.setOnClickListener {
            if (kor2.visibility == View.VISIBLE) {
                kor2.visibility = View.INVISIBLE
                kor1.visibility = View.VISIBLE
                prev.visibility = View.INVISIBLE
            }
            else if (kor3.visibility == View.VISIBLE) {
                kor3.visibility = View.INVISIBLE
                kor2.visibility = View.VISIBLE
                next.visibility = View.VISIBLE
            }
            else if (eng2.visibility == View.VISIBLE) {
                eng2.visibility = View.INVISIBLE
                eng1.visibility = View.VISIBLE
                prev.visibility = View.INVISIBLE
            }
            else if (eng3.visibility == View.VISIBLE) {
                eng3.visibility = View.INVISIBLE
                eng2.visibility = View.VISIBLE
                next.visibility = View.VISIBLE
            }
        }

        togglekoreng.setOnClickListener {
            if (kor1.visibility == View.VISIBLE) {
                kor1.visibility = View.INVISIBLE
                eng1.visibility = View.VISIBLE
            }

            else if (kor2.visibility == View.VISIBLE) {
                kor2.visibility = View.INVISIBLE
                eng2.visibility = View.VISIBLE
            }

            else if (kor3.visibility == View.VISIBLE) {
                kor3.visibility = View.INVISIBLE
                eng3.visibility = View.VISIBLE
            }

            else if (eng1.visibility == View.VISIBLE) {
                eng1.visibility = View.INVISIBLE
                kor1.visibility = View.VISIBLE
            }

            else if (eng2.visibility == View.VISIBLE) {
                eng2.visibility = View.INVISIBLE
                kor2.visibility = View.VISIBLE
            }

            else if (eng3.visibility == View.VISIBLE) {
                eng3.visibility = View.INVISIBLE
                kor3.visibility = View.VISIBLE
            }
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