package com.zasa.coderswag.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.zasa.coderswag.Adapers.CategoryRecycleAdapter
import com.zasa.coderswag.Model.Category
import com.zasa.coderswag.Model.Product
import com.zasa.coderswag.R
import com.zasa.coderswag.Services.DataService
import com.zasa.coderswag.Utils.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.catergory_list_item.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecycleAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories) {
            category ->
            val productIntent = Intent(this, productsActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY,category.title)
            startActivity(productIntent)
        }
        listView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        listView.layoutManager = layoutManager
        listView.setHasFixedSize(true)

    }


}


