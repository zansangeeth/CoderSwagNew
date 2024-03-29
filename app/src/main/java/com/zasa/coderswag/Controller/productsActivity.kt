package com.zasa.coderswag.Controller

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.zasa.coderswag.Adapers.ProductAdapter
import com.zasa.coderswag.Model.Product
import com.zasa.coderswag.R
import com.zasa.coderswag.Services.DataService
import com.zasa.coderswag.Utils.EXTRA_CATEGORY
import com.zasa.coderswag.Utils.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_products.*


class productsActivity : AppCompatActivity() {

    lateinit var adapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)

        adapter = ProductAdapter(this, DataService.getProducts(categoryType)) {product ->
            val intent = Intent(this, Description::class.java)
            intent.putExtra(EXTRA_PRODUCT, product)
            startActivity(intent)
        }
        productsListView.adapter = adapter

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            spanCount = 3
        }

        val layoutManager = GridLayoutManager(this, spanCount)
        productsListView.layoutManager = layoutManager
        productsListView.adapter = adapter


    }

}