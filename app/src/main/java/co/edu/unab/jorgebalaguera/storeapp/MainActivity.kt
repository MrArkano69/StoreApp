package co.edu.unab.jorgebalaguera.storeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import co.edu.unab.jorgebalaguera.storeapp.ui.theme.LoginScreen
import co.edu.unab.jorgebalaguera.storeapp.ui.theme.StoreAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StoreAppTheme {

                val myNavController = rememberNavController()
                val myStartDestination: String = "login"

                NavHost(
                    navController = myNavController,
                    startDestination = myStartDestination
                ) {
                    composable(route = "login") {
                        LoginScreen(myNavController)
                    }
                    composable(route = "register") {
                        RegisterScreen(myNavController)
                    }
                }
            }
        }
    }
}


