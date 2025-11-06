package es.fpsumma.dam2.myapplication.ui.screens.editprofile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import es.fpsumma.dam2.myapplication.ui.navigation.Routes

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditProfileScreen(navController: NavController) {
    var textoIngresado by remember { mutableStateOf("") }

    Column {
        Spacer(modifier = Modifier.height(24.dp))
        Row (
            modifier = Modifier
            .padding(24.dp),
            verticalAlignment = Alignment.CenterVertically

        ){
            TextButton(
                onClick = {
                    navController.navigate(Routes.HOME)
                },

            ) {
                Text(
                    "<-",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            }
            Text(text = "Editar Perfil",
                 fontWeight = FontWeight.Bold)
        }



        Column (modifier = Modifier.padding(16.dp)){
            OutlinedTextField(

                value = textoIngresado,


                onValueChange = { nuevoTexto ->
                    textoIngresado = nuevoTexto
                },
                modifier = Modifier.fillMaxWidth(),


                label = { Text("Introduce tu nombre") },
            )
            OutlinedTextField(

                value = textoIngresado,


                onValueChange = { nuevoTexto ->
                    textoIngresado = nuevoTexto
                },
                modifier = Modifier.fillMaxWidth(),

                label = { Text("Introduce tu nombre") },
            )
            OutlinedTextField(

                value = textoIngresado,


                onValueChange = { nuevoTexto ->
                    textoIngresado = nuevoTexto
                },
                modifier = Modifier.fillMaxWidth(),

                label = { Text("Introduce tu nombre") },
            )
            OutlinedTextField(

                value = textoIngresado,


                onValueChange = { nuevoTexto ->
                    textoIngresado = nuevoTexto
                },
                modifier = Modifier.fillMaxWidth(),

                label = { Text("Introduce tu nombre") },
            )
            OutlinedTextField(

                value = textoIngresado,


                onValueChange = { nuevoTexto ->
                    textoIngresado = nuevoTexto
                },
                modifier = Modifier.fillMaxWidth(),

                label = { Text("Introduce tu nombre") },
            )
            OutlinedTextField(

                value = textoIngresado,


                onValueChange = { nuevoTexto ->
                    textoIngresado = nuevoTexto
                },
                modifier = Modifier.fillMaxWidth(),

                label = { Text("Introduce tu nombre") },
            )

        }


    }
}