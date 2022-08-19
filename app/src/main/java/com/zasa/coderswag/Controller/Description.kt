package com.zasa.coderswag.Controller

import android.content.Intent
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

        ivShare.setOnClickListener {
            val shareIntent = Intent()
            shareIntent.action= Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, "this is ${product?.title}")
            intent.type = "text/plain"
            startActivity(Intent.createChooser(shareIntent, "Share to :"))
        }
    }
}