package com.ignhcuatro.parcial2.ui.screens

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import com.ignhcuatro.parcial2.data.Product
import com.ignhcuatro.parcial2.data.shoppingList
import com.ignhcuatro.parcial2.ui.components.mainBottomBar
import com.ignhcuatro.parcial2.viewmodel.ProductViewModel

@Composable
fun ProductDetailScreen(productId: Int, navController: NavController, viewModel: ProductViewModel = viewModel()) {
    val selectedProduct = viewModel.getProduct(productId)
    val context = LocalContext.current

    if (selectedProduct == null) {
        Text("Producto no encontrado")
        return
    }

    Scaffold(
        bottomBar = {
            if (navController != null) {
                mainBottomBar(navController)
            }
        }
    ) { paddingValues ->

        Column (
            modifier = Modifier.fillMaxSize().padding(paddingValues).padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(
                modifier = Modifier.size(10.dp)
            )

            Image(
                painter = rememberAsyncImagePainter(selectedProduct.image),
                contentDescription = selectedProduct.name,
                modifier = Modifier
                    .size(250.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .fillMaxSize(),
                contentScale = ContentScale.Fit
            )

            Text(
                text = "Nombre: ${selectedProduct.name}"
            )

            Spacer(
                modifier = Modifier.size(10.dp)
            )

            Text(
                text = "Descripcion: ${selectedProduct.description}"
            )

            Spacer(
                modifier = Modifier.size(10.dp)
            )

            Text(
                text = "Categoría: ${selectedProduct.category}"
            )

            Text(
                text = "Precio: $ ${selectedProduct.price.toString()}"
            )

            Button(onClick = {
                shoppingList.add(selectedProduct)

                Toast.makeText(context, "Se agregó ${selectedProduct.name} a su carretilla", Toast.LENGTH_LONG).show()
            }) {
                Text("Comprar")
            }
        }
    }

}