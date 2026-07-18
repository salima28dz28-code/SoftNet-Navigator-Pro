package com.softnet.navigator.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Navigation
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.softnet.navigator.ui.theme.NeonBlue
import com.softnet.navigator.ui.theme.NeonGreen
import com.softnet.navigator.ui.theme.SurfaceDark

@Composable
fun DashboardOverlay(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        // Bottom Left: Speedometer
        Box(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .size(120.dp)
                .clip(CircleShape)
                .background(SurfaceDark.copy(alpha = 0.9f))
                .border(2.dp, NeonBlue.copy(alpha = 0.5f), CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "85",
                    color = Color.White,
                    fontSize = 48.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "كم/س",
                    color = NeonBlue,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium
                )
            }
            
            // Speed Limit Badge
            Box(
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .offset(x = (-10).dp, y = 10.dp)
                    .size(40.dp)
                    .clip(CircleShape)
                    .background(Color.White)
                    .border(3.dp, Color.Red, CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "80",
                    color = Color.Black,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        // Bottom Right: Navigation Instructions
        Row(
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .clip(RoundedCornerShape(16.dp))
                .background(SurfaceDark.copy(alpha = 0.9f))
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(48.dp)
                    .clip(CircleShape)
                    .background(NeonGreen.copy(alpha = 0.2f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.Navigation,
                    contentDescription = "انعطف",
                    tint = NeonGreen,
                    modifier = Modifier.size(32.dp)
                )
            }
            
            Column {
                Text(
                    text = "بعد 200 متر",
                    color = Color.White,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "انعطف يميناً نحو الطريق الوطني رقم 5",
                    color = Color.Gray,
                    fontSize = 16.sp
                )
            }
        }
    }
}
