package com.zasa.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zasa.coderswag.Model.Product
import com.zasa.coderswag.R
import com.zasa.coderswag.Utils.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_description.*

class Description : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description)

        val product = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)
        val resId = this.resources.getIdentifier(product?.image, "drawable", this.packageName)

        ivProductImage.setImageResource(resId)
        tvTitle.text = product?.title
        tvProductPrice.text = product?.price
        tvProductDesc.text = product?.desc
    }
}