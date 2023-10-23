package com.example.weatherfrontend

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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat
import com.example.weatherfrontend.ui.theme.WeatherFrontendTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherFrontendTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    task_b()
                    //task_a()
                }
            }
        }
    }
}

@Composable
fun task_b(){
    Column {
        Row {
            Box(modifier = Modifier
                .fillMaxWidth(.6f)
                .fillMaxHeight(.3f)

            ){
                Column(modifier = Modifier.fillMaxSize()) {

Row {
    Icon(imageVector = Icons.Default.ArrowBack, contentDescription ="go back" ,
        modifier=Modifier.padding(top=14.dp)
    )
    Text(text = "LOCATIONS", modifier = Modifier.padding(16.dp),
        fontSize = 16.sp)
    Icon(imageVector = Icons.Default.MoreVert, contentDescription = "more option",
        modifier=Modifier.padding
            (start=40.dp,
            top= 12.dp))
}



                   Text(text ="You are currently getting results for popular from India" ,modifier = Modifier
                       .padding(16.dp)
                   )
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {

                        Button(onClick = { /*TODO*/ },
                            modifier = Modifier
                                .alpha(0.5f)
                            ) {
                            Text(text = "Choose place")

                        }
                    }

                }

            }
            Box(modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(.3f)
                .background(Color.LightGray)){
                Column(
                    modifier=Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
Icon(imageVector = Icons.Default.Add, contentDescription = "Add place",
    modifier=Modifier.padding(bottom=4.dp)

    )
                    Text(text = "ADD PLACE")

                }
            }
        }
        Column {
            city_list(city = "Mumbai", temp = 29, weat = "Sunny", humidity = "51", bg = Color(0xFFB69DF8))
            city_list(city =  "Bhopal", temp = 21, weat = "Clear", humidity = "35", bg =Color(0xFFCCB6E2) )
            city_list(city ="Indore", temp = 24, weat = "Smoke", humidity = "35", bg =Color(0xFFD0BCFF) )
        }





    }
}

@Composable
fun city_list(city: String, temp: Int, weat: String, humidity: String,bg:Color) {
Box(
    modifier= Modifier
        .size(height = 120.dp, width = 600.dp)
        .background(bg)


) {


    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row {

            Text(
                text = city,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                color = Color.Black,
                //modifier=Modifier.padding(4.dp)
            )

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.BottomEnd
            ) {
                Text(
                    text = "$temp, $weat",
                    color = Color(0xFFD14B4B),
                    fontSize = 15.sp,
                    modifier = Modifier.padding(
                        end = 8.dp,
                        top = 4.dp
                    )

                )
            }

        }
        Text(
            text = "Humidity: $humidity%",
            fontSize = 15.sp,
            modifier = Modifier.alpha(0.5f)
        )
    }
}
}

@Composable
fun task_a(){
    val a= painterResource( R.drawable.w2)
    Image(painter = a, contentDescription =null , contentScale = ContentScale.FillHeight)

    Column {
        Row(
            modifier = Modifier
                .padding(top = 20.dp)
                .fillMaxWidth()) {

            Icon(imageVector = Icons.Default.List,
                contentDescription = null,
                tint = Color.White,
                modifier=Modifier.padding(
                    top=4.dp,
                    start=12.dp
                )
            )

            Text(text = "Mumbai",
                color = Color.White,
                fontSize = 24.sp,
                modifier=Modifier.padding(
                    start=8.dp
                )
            )
            Icon(imageVector = Icons.Default.Search,
                contentDescription =null,
                tint=Color.White,
                modifier=Modifier.padding(
                    start=200.dp,
                    top=4.dp
                )

            )
            Icon(imageVector = Icons.Filled.Settings,
                contentDescription = null,
                tint=Color.White,
                modifier = Modifier.padding(
                    start=10.dp,
                    top=4.dp))
        }
        Row(modifier=Modifier.padding(
            top=48.dp,
            start=12.dp)
        ) {
            Text(text = "28",
                fontSize = 70.sp,
                color = Color.White
            )
            Column {
                Text(text = "°C",
                    color=Color.White,
                    fontSize = 28.sp,
                    modifier=Modifier.padding(top=4.dp)
                )
                Text(text = " Sunny",
                    fontSize = 28.sp,
                    color=Color.White,
                    modifier=Modifier.padding(top=4.dp))
            }
            Column(
                modifier= Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.End,

            ) {
                Text(text = "13 Feb, Saturday",
                    color = Color.White,
                    fontSize = 28.sp)
                Text(text = "02:00PM",
                    color = Color.White,
                    fontSize = 28.sp)
            }
        }
        Box(modifier = Modifier
            .size(height = 500.dp, width = 400.dp)

        )



        Row {
            val w1= painterResource(R.drawable.cloud_fill0_wght400_grad0_opsz24)
            val w2= painterResource(R.drawable.cloud_fill0_wght400_grad0_opsz24__1_)
            val w3= painterResource(R.drawable.sunny_fill0_wght400_grad0_opsz24)
            val w4= painterResource(R.drawable.thunderstorm_fill0_wght400_grad0_opsz24)
            weather(day = "Sat", icon=w1 , temp ="21" )
            weather(day = "Sun", icon=w2 , temp ="20" )
            weather(day = "Mon", icon=w4 , temp ="18" )
            weather(day = "Tue", icon=w3 , temp ="22" )


        }
    }


}
@Composable
fun weather(day:String,icon:Painter ,temp:String){
    Box(modifier = Modifier
        .size(height = 150.dp, width = 105.dp)
        .background(Color.White)
    ){
        Column (
            modifier=Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
            ){
            Text(text =day,
                fontSize = 28.sp
            )
            Icon(painter = icon, contentDescription =null,modifier=Modifier.size(28.dp) )
            Text(text = temp,
                fontSize = 28.sp
            )


        }


    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WeatherFrontendTheme {
        Box(modifier = Modifier.fillMaxSize()

        ) {
           task_b()
           // task_a()
        }
    }
}