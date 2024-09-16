package com.steven.tareasesion2.pantallas
import android.content.Intent
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import com.steven.tareasesion2.PresentarActivity
import com.steven.tareasesion2.R

@Composable 
fun PantallaPrincipal() {
    val contex = LocalContext.current
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(painter = painterResource(id = R.drawable.dos), contentDescription = "logo")
        Text(text ="Hola desde la función Pantalla", style = MaterialTheme.typography.titleLarge, color = MaterialTheme.colorScheme.error
            )
        OutlinedButton(onClick = {
            Log.d("PantallaPrincipal","Click")
            val intent = Intent(
                        contex,
                        PresentarActivity::class.java
                    )
            contex.startActivity(intent)
        }
        ) {


            Text(text = "Continuar",
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.primary)
        }
    }

}

