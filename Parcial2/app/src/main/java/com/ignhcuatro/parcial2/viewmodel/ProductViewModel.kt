package com.ignhcuatro.parcial2.viewmodel

import androidx.lifecycle.ViewModel
import com.ignhcuatro.parcial2.data.Product
import com.ignhcuatro.parcial2.data.productList
import com.ignhcuatro.parcial2.data.shoppingList
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ProductViewModel : ViewModel() {
    private val originalSearch = MutableStateFlow("")
    val search: StateFlow<String> = originalSearch

    private val originalSearchResults = MutableStateFlow(productList)
    val searchResults: StateFlow<List<Product>> = originalSearchResults

    private val originalShoppingList = MutableStateFlow(shoppingList)
    val thisShoppingList: StateFlow<List<Product>> = originalShoppingList

    fun onSearch(searchItem: String) {
        originalSearch.value = searchItem
        originalSearchResults.value = productList.filter {
            it.name.contains(searchItem, ignoreCase = true) || it.category.contains(searchItem, ignoreCase = true)
        }
    }

    fun getProduct(id: Int): Product? {
        return productList.find { it.id == id }
    }

//    fun addProductToShoppingList(id: Int) {
//        thisShoppingList.value.add(originalSearchResults.value.get(id))
//    }
}