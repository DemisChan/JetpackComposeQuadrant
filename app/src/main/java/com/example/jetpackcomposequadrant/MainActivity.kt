package com.example.jetpackcomposequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposequadrant.ui.theme.JetpackComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Quadrant()
                }
            }
        }
    }
}

@Composable
fun Quadrant() {
    Row(verticalAlignment = Alignment.Top) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .background(Green)
                .fillMaxHeight(0.5f)
                .weight(0.5f)
                .padding(16.dp)
        ) {
            QuadrantText(title = stringResource(R.string.title_q1), description = stringResource(R.string.description_q1))
        }


        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .background(Yellow)
                .fillMaxHeight(0.5f)
                .weight(0.5f)
                .padding(16.dp)
        ) {
            QuadrantText(title = stringResource(R.string.title_q2), description = stringResource(R.string.description_q2))
        }
    }
    Row(verticalAlignment = Alignment.Bottom) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .background(Color.Cyan)
                .fillMaxHeight(0.5f)
                .weight(0.5f)
                .padding(16.dp)
        ) {
            QuadrantText(title = stringResource(R.string.title_q3), description = stringResource(R.string.description_q3))
        }
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .background(Color.Gray)
                .fillMaxHeight(0.5f)
                .weight(0.5f)
                .padding(16.dp)

        ) {
            QuadrantText(title = stringResource(R.string.title_q4), description = stringResource(R.string.description_q4))
        }
    }
}


@Composable
fun QuadrantText(title: String, description: String) {
    Text(
        text = title,
        fontWeight = Bold,
        modifier = Modifier.padding(bottom = 16.dp)
    )
    Text(
        text = description,
        textAlign = TextAlign.Justify
    )
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeQuadrantTheme {
        Quadrant()
    }
}