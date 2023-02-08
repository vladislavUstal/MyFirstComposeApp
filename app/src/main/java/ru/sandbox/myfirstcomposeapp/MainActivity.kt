package ru.sandbox.myfirstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import ru.sandbox.myfirstcomposeapp.ui.mainScreen.MainScreen
import ru.sandbox.myfirstcomposeapp.ui.theme.MyFirstComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstComposeAppTheme {
                MainScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyFirstComposeAppTheme {
        MainScreen()
    }
}