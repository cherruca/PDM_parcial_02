package com.ignhcuatro.parcial2.data

data class Product(
    val id : Int,
    val name : String,
    val category: String,
    val price : Double,
    val image : String,
    val description : String
)

val productList = listOf<Product>(
    Product(
        101,
        "Alitas de pollo congeladas",
        "Carnes",
        4.50,
        "https://img.superselectos.com/7fe41f5dd611fcec70bf9acf6e8bbec893676337_Mediumbw.jpg",
        "ALITAS PICANTES 12 ALAS SELLO DE ORO 454 GRAMOS"
    ),

    Product(
        102,
        "CHILE VERDE OFERTA UNIDAD",
        "Verduras",
        0.34,
        "https://img.superselectos.com/1e2df64530dfb9a8b376beab4fa98f3ca651bc98_Mediumbw.jpg",
        "CHILE VERDE OFERTA UNIDAD"
    ),

    Product(
        103,
        "CEBOLLINES MANOJO",
        "Verduras",
        0.87,
        "https://img.superselectos.com/2cf01e0d6972157e4427adbec80d190199083a79_Mediumbw.jpg",
        "CEBOLLINES MANOJO"
    ),

    Product(
        104,
        "Premezclado Smirnoff Ice Raspberry 350 mL Lata",
        "Bebidas alcohólicas",
        1.55,
        "https://img.superselectos.com/ec415550e0313cea3d049caeff09a4092f1861b2_Mediumbw.jpg",
        "Vodka Smirnoff Ice Raspberry 350mL"
    ),

    Product(
        105,
        "Rapiditas Bimbo Wraps 320 g",
        "Panadería",
        2.40,
        "https://img.superselectos.com/a407f2da64de074ff4babe09616e03a7eb3be2be_Mediumbw.jpg",
        "Tortillas de harina de trigo Wraps By Rapiditas tamaño XL bolsa con 5 unidades"
    ),

    Product(
        106,
        "LAVAPLATOS AXION LIMON 1 kg",
        "Jabones",
        3.75,
        "https://img.superselectos.com/5e2ab15c6e732427abecfad3ebf7acee066479a1_Mediumbw.jpg",
        "Lavaplatos Axion Limon 1 kg"
    ),

    Product(
        107,
        "Aceite De Oliva Borges Extra Virgen 2000 ml",
        "Aceite",
        34.10,
        "https://img.superselectos.com/2ca6717efcc731a38476763f05fe687dcb8a8e7a_Mediumbw.jpg",
        "Ideal para aderezos y aliños. Extracción en frío de aceitunas selectas. Fuente natural de antioxidantes. Rico en grasas saludables. Sabor equilibrado."
    ),

    Product(
        108,
        "Whisky Johnnie Walker Blue Label 750 mL",
        "Bebidas alcohólicas",
        374.75,
        "https://img.superselectos.com/f2e62a410c7140228096c2ce54263d2b250fb7ef_Mediumbw.jpg",
        "WHISKY J. WALKER BLUE LABEL 750 40º BOTELLA"
    ),

    Product(
        109,
        "Pechuga Deshuesada De Pollo Indio Libra",
        "Carnes",
        3.87,
        "https://img.superselectos.com/b2a5c059269a2ece0f224f48094c9860a6f89700_Mediumbw.jpg",
        "PECHUGA DESHUESADA DE POLLO INDIO LIBRA"
    ),
)

val shoppingList = mutableListOf<Product>()