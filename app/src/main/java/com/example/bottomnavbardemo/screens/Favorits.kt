package com.example.bottomnavbardemo.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.bottomnavbardemo.ui.theme.Animated_1
import com.example.bottomnavbardemo.ui.theme.Purple200

@Composable
fun Favoritscren() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Purple200),
        contentAlignment = Alignment.Center
    ) {
        Column (horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())){
                Animated_1()
                Animated_1()
        }


    }
}

