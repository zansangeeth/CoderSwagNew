package com.zasa.coderswag.Adapers

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.zasa.coderswag.Model.Category
import com.zasa.coderswag.R

class CatergoryAdapter(val context: Context, val categories: List<Category>) : BaseAdapter() {

    override fun getCount(): Int {
        return categories.count()
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView : View
        val holder : ViewHolder

        if (convertView == null){
            categoryView = LayoutInflater.from(context).inflate(R.layout.catergory_list_item, null)
            holder = ViewHolder()
            holder.categoryImage  = categoryView.findViewById(R.id.catergoryImage)
            holder.categoryName = categoryView.findViewById(R.id.catergoryName)
            println("i exist one time")
            categoryView.tag = holder
        }else{
            holder = convertView.tag as ViewHolder
            categoryView = convertView
            println("go green recycle!")
        }

        val category = categories[position]
        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holder.categoryImage?.setImageResource(resourceId)
        holder.categoryName?.text = category.title
        return categoryView
    }

    private class ViewHolder{
        var categoryImage : ImageView ?= null
        var categoryName : TextView ?= null
    }
}

