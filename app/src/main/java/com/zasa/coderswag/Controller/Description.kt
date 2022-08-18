package com.zasa.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.zasa.coderswag.Model.Product
import com.zasa.coderswag.R
import com.zasa.coderswag.Utils.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_description.*
import kotlinx.android.synthetic.main.product_list_item.*


class Description : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description)

        val product = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)
        val resId = this.resources.getIdentifier(product?.image, "drawable", this.packageName)

        tvProductTitle.text = product?.title

    }
}