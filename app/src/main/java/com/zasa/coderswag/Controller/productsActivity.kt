package com.zasa.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zasa.coderswag.R
import com.zasa.coderswag.Utils.EXTRA_CATEGORY

class productsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
    }
}