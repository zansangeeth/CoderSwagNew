package com.zasa.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.zasa.coderswag.R


class Description : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description)


        val titleDes : TextView = findViewById(R.id.tvProductTitle)
        val bundle : Bundle? =intent.extras
        val title = bundle!!.getString("title")

        titleDes.text = title

    }
}