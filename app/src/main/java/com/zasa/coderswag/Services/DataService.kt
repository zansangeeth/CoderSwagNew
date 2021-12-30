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
        Product("Devslops Graphic Beanie", "$18", "hat01"),
        Product("Devslops Hat Black", "$20", "hat02"),
        Product("Devslops Hat White", "$18", "hat03"),
        Product("Devslops Hat Snapback", "$22", "hat04")
    )

    val hoodies = listOf(
        Product("Devslops Hoodie gray", "$28", "hoodie01"),
        Product("Devslops Hoodie Red", "$30", "hoodie02"),
        Product("Devslops Gray Hoodie", "$28", "hoodie03"),
        Product("Devslops Black Hoodie", "$32", "hoodie04")
    )

    val shirts = listOf(
        Product("Devslops Shirt Black", "$18", "shirt01"),
        Product("Devslops Badge Light Gray", "$20", "shirt02"),
        Product("Devslops Logo Shirt Red", "$22", "shirt03"),
        Product("Devslops Hustle", "$22", "shirt04"),
        Product("Kickflip Studios", "$18", "shirt05")
    )

}