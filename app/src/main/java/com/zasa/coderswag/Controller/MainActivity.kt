package com.zasa.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.zasa.coderswag.Adapers.CategoryRecycleAdapter
import com.zasa.coderswag.R
import com.zasa.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories)
        listView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        listView.layoutManager = layoutManager
        listView.setHasFixedSize(true)



    }


}


