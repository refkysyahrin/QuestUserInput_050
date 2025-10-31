package com.example.questuserinput_050

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import kotlinx.coroutines.sync.Mutex
import java.util.Date

@Composable
fun FormRegistrasi() {
    // Variabel untuk menampung input user dari user
    var namaLengkap by remember { mutableStateOf("") }
    var kotaAsal by remember { mutableStateOf("") }
    var tanggalLahir by remember { mutableStateOf<Date?>(null) }
    var rt by remember { mutableStateOf("") }
    var rw by remember { mutableStateOf("") }
    var jenisKelamin by remember { mutableStateOf("") }
    var setujuSyarat by remember { mutableStateOf("") }

}