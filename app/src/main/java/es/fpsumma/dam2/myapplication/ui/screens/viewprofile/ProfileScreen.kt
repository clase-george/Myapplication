package es.fpsumma.dam2.myapplication.ui.screens.viewprofile

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import es.fpsumma.dam2.myapplication.R
import es.fpsumma.dam2.myapplication.ui.navigation.Routes
import es.fpsumma.dam2.myapplication.ui.theme.MyApplicationTheme
import org.jetbrains.annotations.Async
import java.io.File

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ViewProfileScreen(navController: NavController) {
    var nombre by remember { mutableStateOf("") }
    var profesion by remember { mutableStateOf("") }
    var correo by remember { mutableStateOf("") }
    var telefono by remember { mutableStateOf("") }
    var ubicacion by remember { mutableStateOf("") }
    var formacion by remember { mutableStateOf("") }
    nombre = "George Eduard Turcescu"
    profesion = "Desarrollador Android"
    correo = "correo@gmail.com"
    telefono ="+34 123456789"
    ubicacion ="Madrid, España"
    formacion ="Grado En Ingenieria Inf"
    Column {
        Spacer(modifier = Modifier.height(24.dp))
        Row(
            modifier = Modifier
                .padding(24.dp),
            verticalAlignment = Alignment.CenterVertically

        ) {
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
            Text(
                text = "Perfil",
                fontWeight = FontWeight.Bold
            )
        }
        Column {
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),
                horizontalArrangement = Arrangement.Center
            ){
                Image(

                    painter = painterResource(id = R.drawable.avatar),
                    contentDescription = "Foto de $nombre",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier

                        .size(100.dp) // Define el tamaño del círculo
                        .clip(CircleShape) // Recorta la imagen en forma de círculo
                        .border(
                            width = 2.dp,
                            color = Color(0xFF3F3F3F),
                            shape = CircleShape
                        )


                )
            }


            Row (
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp, bottom = 0.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ){
                Text(nombre,
                        color = Color(0xFFFF58C0),
                        fontWeight = FontWeight.Bold,
                                fontSize = 20.sp
                )
            }
            Row (
                modifier = Modifier
                    .padding(0.5.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ){
                Text(profesion,
                    color = Color(0xFF646464),
                    fontSize = 15.sp
                )
            }
            Column (modifier = Modifier.fillMaxWidth().padding(36.dp)){
                Row (modifier = Modifier.padding(bottom = 6.dp).fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween){
                    Text("\uD83D\uDCE7Correo",fontWeight = FontWeight.Bold)
                    Text(correo, modifier = Modifier.padding(start = 62.dp))
                }
                Row (modifier = Modifier.padding(bottom = 6.dp).fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween){
                    Text("\uD83D\uDCF1Teléfono",fontWeight = FontWeight.Bold)
                    Text(telefono, modifier = Modifier.padding(start = 62.dp))
                }
                Row (modifier = Modifier.padding(bottom = 6.dp).fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween){
                    Text("\uD83D\uDCCDUbicación", fontWeight = FontWeight.Bold)
                    Text(ubicacion, modifier = Modifier.padding(start = 62.dp))
                }
                Row (modifier = Modifier.padding(bottom = 6.dp).fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween){
                    Text("\uD83D\uDC68\u200D\uD83C\uDF93Formación", fontWeight = FontWeight.Bold)
                    Text(formacion, modifier = Modifier.padding(start = 62.dp))
                }
            }
            Row(modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.Center) {
                Button(
                    onClick = {
                        navController.navigate(Routes.EDIT)
                    }
                ) {
                    Text("Editar perrfil")
                }
            }
        }
    }
}

@Composable
fun AsyncImage(
    model: String,
    contentDescription: String,
    modifier: Modifier,
    contentScale: ContentScale
) {
    TODO("Not yet implemented")
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    val navController = rememberNavController()
    MyApplicationTheme {
        ViewProfileScreen(navController)
    }

}