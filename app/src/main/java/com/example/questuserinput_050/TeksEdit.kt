package com.example.questuserinput_050

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun FormDataDiri(modifier: Modifier
){
    //Variabel-variabel untuk mengingat nilai masukan dari keyboard
    var textNama by remember { mutableStateOf(value = "")}
    var textAlamat by remember { mutableStateOf(value = "")}
    var textJK by remember { mutableStateOf(value = "")}

    //Variabel-variabel untuk menyimpan data yang diperoleh dari komponen UI
    var nama by remember { mutableStateOf(value = "") }
    var alamat by remember { mutableStateOf(value = "") }
    var jenis by remember { mutableStateOf(value = "") }

    val gender: List<String> = listOf("Laki-laki","Perempuan")

}