package com.zasa.coderswag.Services

import com.zasa.coderswag.Model.Category
import com.zasa.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("HAT", "hatimage"),
        Category("HOODIE", "hoodieimage"),
        Category("SHIRT", "shirtimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslops Graphic Beanie", "$18", "hat1"),
        Product("Devslops Hat Black", "$20", "hat2"),
        Product("Devslops Hat White", "$18", "hat3"),
        Product("Devslops Hat Snapback", "$22", "hat4")
    )

    val hoodies = listOf(
        Product("Devslops Hoodie gray", "$28", "hoodie1"),
        Product("Devslops Hoodie Red", "$30", "hoodie2"),
        Product("Devslops Gray Hoodie", "$28", "hoodie3"),
        Product("Devslops Black Hoodie", "$32", "hoodie4")
    )

    val shirts = listOf(
        Product("Devslops Shirt Black", "$18", "shirt1"),
        Product("Devslops Badge Light Gray", "$20", "shirt2"),
        Product("Devslops Logo Shirt Red", "$22", "shirt3"),
        Product("Devslops Hustle", "$22", "shirt4"),
        Product("Kickflip Studios", "$18", "shirt5")
    )

    val digitalGoods = listOf<Product>()

    fun getProducts(category: String) : List<Product>{
        return when(category){
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGoods
        }
    }

}