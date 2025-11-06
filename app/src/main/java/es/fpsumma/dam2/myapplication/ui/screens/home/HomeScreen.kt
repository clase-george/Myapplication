package es.fpsumma.dam2.myapplication.ui.screens.home


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import es.fpsumma.dam2.myapplication.ui.navigation.Routes


// ui/screens/home/HomeScreen.kt

@Composable
fun HomeScreen(navController: NavController) {

    Column (
        modifier = Modifier
            .padding(24.dp)
    ) {
        Spacer(modifier = Modifier.height(24.dp))
        Column {
            Text(
                text ="Hola, usuario!",
                fontWeight = FontWeight.Bold
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text("Esta es tu pantalla de inicio.Desde aqui puedes acceder a diferentes secciones")

        Spacer(modifier = Modifier.height(16.dp))
        Card(
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant,
            ),
            modifier = Modifier
                .size(
                    width = 330.dp,
                    height = 100.dp
                )
        ) {
            Column (
                modifier = Modifier.padding(16.dp)
            ){
                Text(
                    text = "¿Sabías qué...",
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                )
                Text(
                    text = "¿Puedes navegar entre pantallas usando el NavController en Compose. ¡Explora abajo!",
                )
            }

        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                navController.navigate(Routes.VIEW)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Ver perfil")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                navController.navigate(Routes.EDIT)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Configuracion")
        }
    }
}