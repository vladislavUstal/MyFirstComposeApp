package ru.sandbox.myfirstcomposeapp.ui.mainScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import ru.sandbox.myfirstcomposeapp.R

@Composable
fun MainScreenToolbar() {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(
                id = R.drawable.ic_geolocation
            ),
            contentScale = ContentScale.Crop,
            contentDescription = "ic_geolocation"
        )
        Text(
            text = "Belgorod",
            modifier = Modifier.padding(start = 11.dp)
        )
    }
}

@Composable
fun CategoryComponent() {
    Column(
        modifier = Modifier
            .padding(top = 18.dp)
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Select Category")
            Text(text = "view all")
        }
        LazyRow(
            modifier = Modifier
                .padding(top = 7.dp)
        ) {
            items(count = 20) {
                OutlinedButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(end = 23.dp)
                        .size(71.dp),
                    shape = CircleShape
                ) {
                    Column(verticalArrangement = Arrangement.Center) {
                        Image(
                            painter = painterResource(
                                id = R.drawable.ic_geolocation
                            ),
                            contentScale = ContentScale.Crop,
                            contentDescription = "ic_geolocation"
                        )
                        Text(
                            modifier = Modifier
                                .padding(top = 7.dp),
                            text = "text"
                        )
                    }
                }
            }
        }
    }
}