package com.example.lampadinaex2g9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var on:RadioButton = findViewById(R.id.on)
        var off:RadioButton = findViewById(R.id.off)
        var lightOn:ImageView = findViewById(R.id.l_on)
        var lightOff:ImageView = findViewById(R.id.l_off)

        on.setOnClickListener {
            lightOff.visibility = View.INVISIBLE
            lightOn.visibility = View.VISIBLE
        }

        off.setOnClickListener {
            lightOn.visibility = View.INVISIBLE
            lightOff.visibility = View.VISIBLE
        }



    }
}