package com.zasa.coderswag.Adapers

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.zasa.coderswag.Model.Product
import com.zasa.coderswag.R

class ProductAdapter(val context: Context, val products: List<Product>, private val itemClick: (Product) -> Unit) :
    RecyclerView.Adapter<ProductAdapter.ProductsHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductsHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_list_item, parent, false)
        return ProductsHolder(view, itemClick)

    }

    override fun onBindViewHolder(holder: ProductsHolder, position: Int) {
        holder.bindProduct(products[position], context)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    inner class ProductsHolder(itemView: View, private val itemClick: (Product) -> Unit) :
        RecyclerView.ViewHolder(itemView) {

        val productImage = itemView.findViewById<ImageView>(R.id.productImage)
        val productName = itemView.findViewById<TextView>(R.id.productName)
        val productPrice = itemView.findViewById<TextView>(R.id.productPrice)

        fun bindProduct(product: Product, context: Context) {
            val resourceId =
                context.resources.getIdentifier(product.image, "drawable", context.packageName)
            productImage.setImageResource(resourceId)
            productName.text = product.title
            productPrice.text = product.price
            itemView.setOnClickListener { itemClick(product) }
        }

    }

}