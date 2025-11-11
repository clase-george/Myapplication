package es.fpsumma.dam2.myapplication.ui.screens.viewprofile

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import es.fpsumma.dam2.myapplication.ui.navigation.Routes
import es.fpsumma.dam2.myapplication.ui.theme.MyApplicationTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ViewProfileScreen(navController: NavController) {
    var nombre by remember { mutableStateOf("") }
    var profesion by remember { mutableStateOf("") }
    nombre = "George Eduard Turcescu"
    profesion = "Desarrollador Android"
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
            Column {
                Row {

                }
                Row {

                }
                Row {

                }
                Row {

                }
            }

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    val navController = rememberNavController()
    MyApplicationTheme {
        ViewProfileScreen(navController)
    }

}