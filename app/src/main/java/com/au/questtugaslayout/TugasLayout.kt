package com.au.questtugaslayout

import android.text.method.TextKeyListener
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.annotations.TestOnly

@Composable
fun TugasLayout(){
    Box(
        modifier = Modifier.fillMaxSize()
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(
                    start = 12.dp,
                    end = 12.dp,
                    top = 70.dp,
                    bottom = 70.dp
                ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(R.string.prodi),
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(R.color.teks_utama),
                textAlign = TextAlign.Center
            )

            Text(
                text = stringResource(R.string.univ),
                fontSize = 16.sp,
                color = colorResource(R.color.teks_utama),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(25.dp))

            CardMahasiswa(
                nama = R.string.nama_1,
                alamat = R.string.alamat_1,
                warna = R.color.card_1
            )

            CardMahasiswa(
                nama = R.string.nama_2,
                alamat = R.string.alamat_2,
                warna = R.color.card_2
            )

            CardMahasiswa(
                nama = R.string.nama_3,
                alamat = R.string.alamat_3,
                warna = R.color.card_3
            )

            CardMahasiswa(
                nama = R.string.nama_4,
                alamat = R.string.alamat_4,
                warna = R.color.card_4
            )
        }

        Text(
            text = stringResource(R.string.copy),
            modifier = Modifier
                .align (Alignment.BottomCenter)
                .padding(bottom = 20.dp),
            color = colorResource(R.color.teks_utama),
            fontSize = 12.sp
        )
    }
}



@Composable
fun CardMahasiswa(
    nama : Int,
    alamat : Int,
    warna : Int
){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 12.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(warna)
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.logo_umy),
                contentDescription = null,
                modifier = Modifier.size(65.dp)
            )
            Spacer(modifier = Modifier.width(15.dp))

            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = stringResource(nama),
                    fontSize = 21.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(R.color.teks_card)
                )
                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = stringResource(alamat),
                    fontSize = 16.sp,
                    color = colorResource(R.color.teks_detail)

                )
            }
        }
    }
}
