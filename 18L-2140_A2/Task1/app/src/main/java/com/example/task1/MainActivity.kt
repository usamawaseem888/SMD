package com.example.task1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task1.ui.theme.Task1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Task1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   // task_a()
                   // task_b()
                    task_c()
                }
            }
        }
    }
}

@Composable
fun task_a(){
val image= painterResource(R.drawable.bg_compose_background)
    Column {
        Image(painter = image, contentDescription =null )
        Text(text = "JetPack Compose tutorials",
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)


            )
        Text(text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs",
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)

            )
        Text(text = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.",
textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
            )
    }

}
@Composable
fun task_b(){
    val image= painterResource(R.drawable.ic_task_completed)
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = image, contentDescription = null, modifier = Modifier.size(200.dp))
        Text(text = "All Tasks Completed",
fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(
                top = 24.dp,
                bottom =8.dp
            )
            )
        
        Text(text = "Nice Work", fontSize = 16.sp)
    }


}
@Composable
fun task_c(){
    Column {
        Row{
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .fillMaxHeight(0.5f)
                    .background(Color(0xFFEADDFF)),


            ){
                functiong(heading = "Text composable", info = "Displays text and follows the recommended Material Design guidelines.")

            }
            Box(modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.5f)
                .background(Color(0xFFD0BCFF))){
                functiong(heading = "Image composable", info ="Creates a composable that lays out and draws a given Painter class object." )


            }
        }
        Row {
            Box(modifier = Modifier
                .fillMaxWidth(0.5f)
                .fillMaxHeight()
                .background(Color(0xFFB69DF8))){
                functiong(heading = "Row composable", info = "A layout composable that places its children in a horizontal sequence.")

            }
            Box(modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(Color(0xFFF6EDFF))){
                functiong(heading = "Column composable", info ="A layout composable that places its children in a vertical sequence." )

            }
        }
    }



}

@Composable
fun functiong(heading:String,info:String){
Column(

    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally,
    modifier = Modifier
        .padding(16.dp)
        .fillMaxSize()
) {
    Text(text = heading,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        modifier = Modifier.padding(bottom = 16.dp)
        )
    Text(text = info,
        textAlign = TextAlign.Justify,
    )

}
    
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Task1Theme {
        Box(modifier = Modifier.fillMaxSize())
        task_c()
    }
}