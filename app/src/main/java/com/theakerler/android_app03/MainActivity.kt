package com.theakerler.android_app03

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.theakerler.android_app03.ui.theme.AndroidApp03Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidApp03Theme {
                PerfilConContacto()
            }
        }
    }
}

@Composable
fun PerfilConContacto() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        // Contenido encima de la imagen
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 0.dp, bottom = 16.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                modifier = Modifier
                    .background(Color.Black)
                    .fillMaxWidth()
                    .height(30.dp)
            ){}
            // Bloque superior con imagen, nombre y título
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.perfil),
                    contentDescription = "Foto de perfil",
                    modifier = Modifier
                        .size(260.dp)
                        .clip(CircleShape) // Recorta en forma de círculo
                        .border(4.dp, Color.Black, CircleShape), // Borde opcional
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text("Luz Cama Quea", fontSize = 30.sp, fontWeight = FontWeight.Bold)
                Text("Developer Android-Laravel-Django-React", fontSize = 16.sp, fontWeight = FontWeight.Medium)
            }

            // Bloque inferior con contactos
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(16.dp),
                horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally,
            ){
                Column(
                    modifier = Modifier
                        .width(360.dp)
                        .padding(start = 25.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp) // espacio entre filas
                ) {
                    Row(verticalAlignment = androidx.compose.ui.Alignment.CenterVertically) {
                        Image(
                            painter = painterResource(id = R.drawable.phone),
                            contentDescription = "Phone Icon",
                            modifier = Modifier.size(30.dp)
                        )
                        Spacer(modifier = Modifier.width(15.dp))
                        Text("+51 900 407 939", fontSize =  20.sp )
                    }
                    Row(verticalAlignment = androidx.compose.ui.Alignment.CenterVertically )  {
                        Image(
                            painter = painterResource(id = R.drawable.instagram),
                            contentDescription = "Social Icon",
                            modifier = Modifier.size(30.dp)
                        )
                        Spacer(modifier = Modifier.width(15.dp))
                        Text("@LuzCama_Dev" , fontSize =  20.sp)
                    }

                    Row(verticalAlignment = androidx.compose.ui.Alignment.CenterVertically)  {
                        Image(
                            painter = painterResource(id = R.drawable.email),
                            contentDescription = "Email Icon",
                            modifier = Modifier.size(30.dp)
                        )
                        Spacer(modifier = Modifier.width(15.dp))
                        Text("luz.cama@des.com" , fontSize =  20.sp)
                    }
                }
            }

        }
    }
}

