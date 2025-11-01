package com.example.questuserinput_050

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import kotlinx.coroutines.sync.Mutex
import java.util.Date

@Composable
fun FormRegistrasi(modifier: Modifier){
    Box{
        //Variabel-variabel untuk mengingat nilai masukan dari keyboard
        var textNama by remember { mutableStateOf("") }
        var textKota by remember { mutableStateOf("") }
        var textRT by remember { mutableStateOf("") }
        var textRW by remember { mutableStateOf("") }
        var textUmur by remember { mutableStateOf("") }
        var textTanggal by remember { mutableStateOf("") }
        var textJK by remember { mutableStateOf("") }

        //Variabel-variabel untuk menyimpan data yang diperoleh dari komponen UI
        var Nama by remember { mutableStateOf("") }
        var Kota by remember { mutableStateOf("") }
        var RT by remember { mutableStateOf("") }
        var RW by remember { mutableStateOf("") }
        var Umur by remember { mutableStateOf("") }
        var Tanggal by remember { mutableStateOf("") }

        val gender: List<String> = listOf("Laki-laki", "Perempuan")
        val validasi= remember { mutableStateOf(false) }

        Image(modifier = Modifier.fillMaxSize(), painter = painterResource(id = R.drawable.eky_bg),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
    }

}