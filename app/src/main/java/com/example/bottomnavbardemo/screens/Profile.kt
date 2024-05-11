package com.example.bottomnavbardemo.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bottomnavbardemo.R
import com.example.bottomnavbardemo.ui.theme.Purple200

@Composable
fun ProfileScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Purple200),
        contentAlignment = Alignment.Center
    ) {
        Column (horizontalAlignment =Alignment.CenterHorizontally ){

    Text(
        text = "PROFILE",
        fontSize = MaterialTheme.typography.h3.fontSize,
        fontWeight = FontWeight.Bold,
        color = Color.White
    )

            Image(
                modifier = Modifier
                    .size(300.dp)
                    .clip(CircleShape),
                painter = painterResource(id = R.drawable.ref_1),
                contentDescription = "CerclIm"
            )
            Box(modifier = Modifier.fillMaxSize()){
                Column {
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .height(100.dp)){
                        Row (modifier = Modifier.padding(20.dp)){
                            Text( modifier = Modifier.padding(3.dp),text = "   Name:",
                                fontSize = MaterialTheme.typography.h3.fontSize,
                                fontWeight = FontWeight.Bold,
                                color = Color.White)
                            Text(modifier = Modifier.padding(3.dp),text = " Alex",
                            fontSize = MaterialTheme.typography.h3.fontSize,
                            fontWeight = FontWeight.Bold,
                            color = Color.White)
                        }

                    }
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .height(100.dp)){
                        Row (modifier = Modifier.padding(20.dp)){
                            Text( modifier = Modifier.padding(3.dp),text = "   ID:",
                                fontSize = MaterialTheme.typography.h3.fontSize,
                                fontWeight = FontWeight.Bold,
                                color = Color.White)
                            Text(modifier = Modifier.padding(3.dp),text = " 0010023",
                                fontSize = MaterialTheme.typography.h3.fontSize,
                                fontWeight = FontWeight.Bold,
                                color = Color.White)
                        }

                    }


                }
            }

        }
    }
}

@Composable
@Preview
fun ProfileScreenPreview() {
    ProfileScreen()
}