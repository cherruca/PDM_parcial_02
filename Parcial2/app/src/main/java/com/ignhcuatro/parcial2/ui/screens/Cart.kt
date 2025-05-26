package com.ignhcuatro.parcial2.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.ignhcuatro.parcial2.data.shoppingList
import com.ignhcuatro.parcial2.navigation.Screen
import com.ignhcuatro.parcial2.ui.components.ProductCard
import com.ignhcuatro.parcial2.ui.components.mainBottomBar
import com.ignhcuatro.parcial2.viewmodel.ProductViewModel

@Composable
fun cartScreen(navController: NavController, viewModel: ProductViewModel = viewModel()) {
//    val search by viewModel.search.collectAsState()
//    val searchResults by viewModel.searchResults.collectAsState()

    Scaffold(
        bottomBar = {
            if (navController != null) {
                mainBottomBar(navController)
            }
        }
    ) { paddingValues ->
        Column(modifier = Modifier
            .padding(paddingValues)
            .padding(20.dp)
            .fillMaxSize()
        ) {

            Text(text = "Tus compras")

            Spacer(
                modifier = Modifier.size(10.dp)
            )

//            Row (
//                modifier = Modifier
//                    .fillMaxWidth()
//            ) {
//                TextField(
//                    value = search,
//                    onValueChange = { viewModel.onSearch(it) },
//                    label = { Text("buscar") },
//                    modifier = Modifier.fillMaxWidth()
//                )
//
//            }

            Spacer(
                modifier = Modifier.size(10.dp)
            )

            LazyColumn {
                items(shoppingList) { selectedProduct ->
                    ProductCard(selectedProduct = selectedProduct) {
                        navController.navigate(Screen.ProductDetail.createRoute(selectedProduct.id))
                    }

                    Spacer(
                        modifier = Modifier.size(10.dp)
                    )

                }
            }


        }
    }
}