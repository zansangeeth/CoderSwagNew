package com.zasa.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zasa.coderswag.Adapers.CatergoryAdapter
import com.zasa.coderswag.R
import com.zasa.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CatergoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CatergoryAdapter(this, DataService.categories)
        listView.adapter = adapter
    }


}


