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

class ProductAdapter(val context: Context, val products: List<Product>) :
    RecyclerView.Adapter<ProductAdapter.ProductsHolder>() {

    lateinit var mListener: onItemClickListener

    interface onItemClickListener {
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener) {
        mListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductsHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_list_item, parent, false)
        return ProductsHolder(view, mListener)

    }

    override fun onBindViewHolder(holder: ProductsHolder, position: Int) {
        holder.bindProduct(products[position], context)


    }

    override fun getItemCount(): Int {
        return products.count()
    }

    inner class ProductsHolder(itemView: View, listener: onItemClickListener) :
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
        }

        init {
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }


    }

}