package com.example.praktikum3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@Composable
fun TugasPraktikum (modifier: Modifier){
    Column (
        modifier = androidx.compose.ui.Modifier
            .background(color = Color.Black)
            .padding(top = 60.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = painterResource(id = R.drawable.gibb),
            contentDescription = "Profile Picture",
            modifier = Modifier
                .size(size = 120.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.height(height = 12.dp))
        Row (
            modifier = Modifier
                .padding(vertical = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(space = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            SocialIcon(iconRes = R.drawable.facebook)
            SocialIcon(iconRes = R.drawable.instagram)
            SocialIcon(iconRes = R.drawable.github)
            SocialIcon(iconRes = R.drawable.linkedin)
        }
        Spacer(modifier = Modifier.height(height = 16.dp))

        Text(
            text = "Gibran Rafi Pratama",
            color = Color.White,
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "@gibranrafii",
            color = Color.Gray,
            fontSize = 14.sp
        )

        Spacer(modifier = Modifier.height(height = 8.dp))

        Text(
            text = "Saya adalah Mahasiswa Teknologi Informasi UMY",
            color = Color.White,
            fontSize = 14.sp,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(32.dp))

        CardMenuItem(iconRes = R.drawable.privacy, title = "Privacy")
        Spacer(modifier = Modifier.height(height = 12.dp))
        CardMenuItem(iconRes = R.drawable.transaksi, title = "Riwayat Transaksi")
        Spacer(modifier = Modifier.height(height = 12.dp))
        CardMenuItem(iconRes = R.drawable.pengaturan, title = "Pengaturan")
        Spacer(modifier = Modifier.height(height = 130.dp))
    }
}

// Fungsi untuk icon logo sosmed
@Composable
fun SocialIcon(iconRes: Int) {
    Card(
        shape = CircleShape,
        colors = CardDefaults.cardColors(containerColor = Color(color = 0xFF1E1E1E)),
        modifier = Modifier.size(36.dp)
    ) {
        Image(
            painter = painterResource(id = iconRes),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .clip(CircleShape)
        )
    }
}

@Composable
fun CardMenuItem(iconRes: Int, title: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(height = 60.dp),
        shape = RoundedCornerShape(size = 16.dp),
        colors = CardDefaults.cardColors(containerColor = Color(color = 0xFF2A2A2A))
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = iconRes),
                contentDescription = null,
                modifier = Modifier.size(size = 24.dp)
            )
            Spacer(modifier = Modifier.width(width = 16.dp))
            Text(
                text = title,
                color = Color.White,
                style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Medium)
            )
        }
    }
}