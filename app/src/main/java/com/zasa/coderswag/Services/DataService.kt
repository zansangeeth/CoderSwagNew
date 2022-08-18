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
        Product("Devslops Graphic Beanie", "$18", "hat1", "\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nec nisi vitae sem ornare rhoncus id ac orci. Nam tempus odio ac tellus blandit, eget rutrum sem fringilla. Duis est velit, dapibus sed justo nec, porttitor viverra ligula. Fusce iaculis nibh id venenatis condimentum.\""),
        Product("Devslops Hat Black", "$20", "hat2","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nec nisi vitae sem ornare rhoncus id ac orci. Nam tempus odio ac tellus blandit, eget rutrum sem fringilla. Duis est velit, dapibus sed justo nec, porttitor viverra ligula. Fusce iaculis nibh id venenatis condimentum."),
        Product("Devslops Hat White", "$18", "hat3", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nec nisi vitae sem ornare rhoncus id ac orci. Nam tempus odio ac tellus blandit, eget rutrum sem fringilla. Duis est velit, dapibus sed justo nec, porttitor viverra ligula. Fusce iaculis nibh id venenatis condimentum."),
        Product("Devslops Hat Snapback", "$22", "hat4", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nec nisi vitae sem ornare rhoncus id ac orci. Nam tempus odio ac tellus blandit, eget rutrum sem fringilla. Duis est velit, dapibus sed justo nec, porttitor viverra ligula. Fusce iaculis nibh id venenatis condimentum."),
        Product("Devslops Graphic Beanie", "$18", "hat1", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nec nisi vitae sem ornare rhoncus id ac orci. Nam tempus odio ac tellus blandit, eget rutrum sem fringilla. Duis est velit, dapibus sed justo nec, porttitor viverra ligula. Fusce iaculis nibh id venenatis condimentum."),
        Product("Devslops Hat Black", "$20", "hat2", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nec nisi vitae sem ornare rhoncus id ac orci. Nam tempus odio ac tellus blandit, eget rutrum sem fringilla. Duis est velit, dapibus sed justo nec, porttitor viverra ligula. Fusce iaculis nibh id venenatis condimentum."),
        Product("Devslops Hat White", "$18", "hat3", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nec nisi vitae sem ornare rhoncus id ac orci. Nam tempus odio ac tellus blandit, eget rutrum sem fringilla. Duis est velit, dapibus sed justo nec, porttitor viverra ligula. Fusce iaculis nibh id venenatis condimentum."),
        Product("Devslops Hat Snapback", "$22", "hat4", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nec nisi vitae sem ornare rhoncus id ac orci. Nam tempus odio ac tellus blandit, eget rutrum sem fringilla. Duis est velit, dapibus sed justo nec, porttitor viverra ligula. Fusce iaculis nibh id venenatis condimentum."),
        Product("Devslops Graphic Beanie", "$18", "hat1", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nec nisi vitae sem ornare rhoncus id ac orci. Nam tempus odio ac tellus blandit, eget rutrum sem fringilla. Duis est velit, dapibus sed justo nec, porttitor viverra ligula. Fusce iaculis nibh id venenatis condimentum."),
        Product("Devslops Hat Black", "$20", "hat2", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nec nisi vitae sem ornare rhoncus id ac orci. Nam tempus odio ac tellus blandit, eget rutrum sem fringilla. Duis est velit, dapibus sed justo nec, porttitor viverra ligula. Fusce iaculis nibh id venenatis condimentum."),
        Product("Devslops Hat White", "$18", "hat3", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nec nisi vitae sem ornare rhoncus id ac orci. Nam tempus odio ac tellus blandit, eget rutrum sem fringilla. Duis est velit, dapibus sed justo nec, porttitor viverra ligula. Fusce iaculis nibh id venenatis condimentum."),
        Product("Devslops Hat Snapback", "$22", "hat4", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nec nisi vitae sem ornare rhoncus id ac orci. Nam tempus odio ac tellus blandit, eget rutrum sem fringilla. Duis est velit, dapibus sed justo nec, porttitor viverra ligula. Fusce iaculis nibh id venenatis condimentum.")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "$28", "hoodie1", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nec nisi vitae sem ornare rhoncus id ac orci. Nam tempus odio ac tellus blandit, eget rutrum sem fringilla. Duis est velit, dapibus sed justo nec, porttitor viverra ligula. Fusce iaculis nibh id venenatis condimentum."),
        Product("Devslopes Hoodie Red", "$32", "hoodie2", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nec nisi vitae sem ornare rhoncus id ac orci. Nam tempus odio ac tellus blandit, eget rutrum sem fringilla. Duis est velit, dapibus sed justo nec, porttitor viverra ligula. Fusce iaculis nibh id venenatis condimentum."),
        Product("Devslopes Gray Hoodie", "$28", "hoodie3", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nec nisi vitae sem ornare rhoncus id ac orci. Nam tempus odio ac tellus blandit, eget rutrum sem fringilla. Duis est velit, dapibus sed justo nec, porttitor viverra ligula. Fusce iaculis nibh id venenatis condimentum."),
        Product("Devslopes Black Hoodie", "$32", "hoodie1", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nec nisi vitae sem ornare rhoncus id ac orci. Nam tempus odio ac tellus blandit, eget rutrum sem fringilla. Duis est velit, dapibus sed justo nec, porttitor viverra ligula. Fusce iaculis nibh id venenatis condimentum."),
        Product("Devslopes Hoodie Red", "$32", "hoodie2", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nec nisi vitae sem ornare rhoncus id ac orci. Nam tempus odio ac tellus blandit, eget rutrum sem fringilla. Duis est velit, dapibus sed justo nec, porttitor viverra ligula. Fusce iaculis nibh id venenatis condimentum."),
        Product("Devslopes Gray Hoodie", "$28", "hoodie3", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nec nisi vitae sem ornare rhoncus id ac orci. Nam tempus odio ac tellus blandit, eget rutrum sem fringilla. Duis est velit, dapibus sed justo nec, porttitor viverra ligula. Fusce iaculis nibh id venenatis condimentum."),
        Product("Devslopes Black Hoodie", "$32", "hoodie1", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nec nisi vitae sem ornare rhoncus id ac orci. Nam tempus odio ac tellus blandit, eget rutrum sem fringilla. Duis est velit, dapibus sed justo nec, porttitor viverra ligula. Fusce iaculis nibh id venenatis condimentum."),
        Product("Devslopes Hoodie Red", "$32", "hoodie2", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nec nisi vitae sem ornare rhoncus id ac orci. Nam tempus odio ac tellus blandit, eget rutrum sem fringilla. Duis est velit, dapibus sed justo nec, porttitor viverra ligula. Fusce iaculis nibh id venenatis condimentum."),
        Product("Devslopes Gray Hoodie", "$28", "hoodie3", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nec nisi vitae sem ornare rhoncus id ac orci. Nam tempus odio ac tellus blandit, eget rutrum sem fringilla. Duis est velit, dapibus sed justo nec, porttitor viverra ligula. Fusce iaculis nibh id venenatis condimentum."),
        Product("Devslopes Black Hoodie", "$32", "hoodie1", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nec nisi vitae sem ornare rhoncus id ac orci. Nam tempus odio ac tellus blandit, eget rutrum sem fringilla. Duis est velit, dapibus sed justo nec, porttitor viverra ligula. Fusce iaculis nibh id venenatis condimentum."),
        Product("Devslopes Hoodie Red", "$32", "hoodie2", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nec nisi vitae sem ornare rhoncus id ac orci. Nam tempus odio ac tellus blandit, eget rutrum sem fringilla. Duis est velit, dapibus sed justo nec, porttitor viverra ligula. Fusce iaculis nibh id venenatis condimentum."),
        Product("Devslopes Gray Hoodie", "$28", "hoodie3", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nec nisi vitae sem ornare rhoncus id ac orci. Nam tempus odio ac tellus blandit, eget rutrum sem fringilla. Duis est velit, dapibus sed justo nec, porttitor viverra ligula. Fusce iaculis nibh id venenatis condimentum."),
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black", "$18", "shirt1", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nec nisi vitae sem ornare rhoncus id ac orci. Nam tempus odio ac tellus blandit, eget rutrum sem fringilla. Duis est velit, dapibus sed justo nec, porttitor viverra ligula. Fusce iaculis nibh id venenatis condimentum."),
        Product("Devslopes Badge Light Gray", "$20", "shirt2", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nec nisi vitae sem ornare rhoncus id ac orci. Nam tempus odio ac tellus blandit, eget rutrum sem fringilla. Duis est velit, dapibus sed justo nec, porttitor viverra ligula. Fusce iaculis nibh id venenatis condimentum."),
        Product("Devslopes Logo Shirt Red", "$22", "shirt3", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nec nisi vitae sem ornare rhoncus id ac orci. Nam tempus odio ac tellus blandit, eget rutrum sem fringilla. Duis est velit, dapibus sed justo nec, porttitor viverra ligula. Fusce iaculis nibh id venenatis condimentum."),
        Product("Devslopes Hustle", "$22", "shirt4", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nec nisi vitae sem ornare rhoncus id ac orci. Nam tempus odio ac tellus blandit, eget rutrum sem fringilla. Duis est velit, dapibus sed justo nec, porttitor viverra ligula. Fusce iaculis nibh id venenatis condimentum."),
        Product("Kickflip Studios", "$18", "shirt5", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nec nisi vitae sem ornare rhoncus id ac orci. Nam tempus odio ac tellus blandit, eget rutrum sem fringilla. Duis est velit, dapibus sed justo nec, porttitor viverra ligula. Fusce iaculis nibh id venenatis condimentum."),
        Product("Devslopes Shirt Black", "$18", "shirt1", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nec nisi vitae sem ornare rhoncus id ac orci. Nam tempus odio ac tellus blandit, eget rutrum sem fringilla. Duis est velit, dapibus sed justo nec, porttitor viverra ligula. Fusce iaculis nibh id venenatis condimentum."),
        Product("Devslopes Badge Light Gray", "$20", "shirt2", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nec nisi vitae sem ornare rhoncus id ac orci. Nam tempus odio ac tellus blandit, eget rutrum sem fringilla. Duis est velit, dapibus sed justo nec, porttitor viverra ligula. Fusce iaculis nibh id venenatis condimentum."),
        Product("Devslopes Logo Shirt Red", "$22", "shirt3", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nec nisi vitae sem ornare rhoncus id ac orci. Nam tempus odio ac tellus blandit, eget rutrum sem fringilla. Duis est velit, dapibus sed justo nec, porttitor viverra ligula. Fusce iaculis nibh id venenatis condimentum."),
        Product("Devslopes Hustle", "$22", "shirt4", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nec nisi vitae sem ornare rhoncus id ac orci. Nam tempus odio ac tellus blandit, eget rutrum sem fringilla. Duis est velit, dapibus sed justo nec, porttitor viverra ligula. Fusce iaculis nibh id venenatis condimentum."),
        Product("Kickflip Studios", "$18", "shirt5", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nec nisi vitae sem ornare rhoncus id ac orci. Nam tempus odio ac tellus blandit, eget rutrum sem fringilla. Duis est velit, dapibus sed justo nec, porttitor viverra ligula. Fusce iaculis nibh id venenatis condimentum."),
        Product("Devslopes Shirt Black", "$18", "shirt1", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nec nisi vitae sem ornare rhoncus id ac orci. Nam tempus odio ac tellus blandit, eget rutrum sem fringilla. Duis est velit, dapibus sed justo nec, porttitor viverra ligula. Fusce iaculis nibh id venenatis condimentum."),
        Product("Devslopes Badge Light Gray", "$20", "shirt2", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris nec nisi vitae sem ornare rhoncus id ac orci. Nam tempus odio ac tellus blandit, eget rutrum sem fringilla. Duis est velit, dapibus sed justo nec, porttitor viverra ligula. Fusce iaculis nibh id venenatis condimentum."),
    )

    val digitalGoods = listOf<Product>()

    fun getProducts(category: String?) : List<Product>{
        return when(category){
            "SHIRT" -> shirts
            "HAT" -> hats
            "HOODIE" -> hoodies
            else -> digitalGoods
        }
    }

}