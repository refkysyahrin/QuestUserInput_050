package com.example.questuserinput_050


import androidx.compose.foundation.Image

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Praktikum5(modifier: Modifier = Modifier){
    //Variabel-variabel untuk mengingat nilai masukan dari keyboard
    var textNama by remember { mutableStateOf(value = "") }
    var textKota by remember { mutableStateOf(value = "") }
    var textRT by remember { mutableStateOf(value = "") }
    var textRW by remember { mutableStateOf(value = "") }
    var textUmur by remember { mutableStateOf(value = "") }
    var textTanggal by remember { mutableStateOf(value = "") }
    var textJK by remember { mutableStateOf(value = "") }

    //Variabel-variabel untuk menyimpan data yang diperoleh dari komponen UI
    var nama by remember { mutableStateOf(value = "") }
    var kota by remember { mutableStateOf(value = "") }
    var rt by remember { mutableStateOf(value = "") }
    var rw by remember { mutableStateOf(value = "") }
    var umur by remember { mutableStateOf(value = "") }
    var tanggal by remember { mutableStateOf(value = "") }
    var jenisKelamin by remember { mutableStateOf(value = "") }

    val gender: List<String> = listOf("Laki-laki", "Perempuan")
    val validasi= remember { mutableStateOf(value = false) }

    var showDialog by remember { mutableStateOf(value = false) }
    Box(modifier = modifier.fillMaxSize()){
        Image(modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.backgroundandroidmerahputih),
            contentDescription = null,
            contentScale = ContentScale.FillHeight
        )
        Text(
            text = stringResource(id = R.string.registrasi),
            color = Color.Black,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
                .padding(top = 70.dp),
        )

        Card(
            modifier = Modifier
                .padding(top = 140.dp, start = 20.dp, end = 20.dp, bottom = 20.dp)
                .fillMaxWidth()
                .height(height = 650.dp),
            colors = CardDefaults.cardColors(containerColor = colorResource(id = R.color.white).copy(alpha = 0.6f)
            )
        ){
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                //.padding(bottom = 20.dp)
            ){
                OutlinedTextField(
                    value = textNama,
                    singleLine = true,
                    shape = MaterialTheme.shapes.large,
                    modifier = Modifier
                        .padding(top = 15.dp, start = 30.dp, end = 30.dp)
                        .fillMaxWidth()
                        .height(height = 70.dp),
                    label = { Text(text = "Nama Lengkap")},
                    onValueChange = {
                        textNama = it
                    }
                )

                //Spacer(modifier = Modifier.height(10.dp))

                OutlinedTextField(
                    value = textKota,
                    singleLine = true,
                    shape = MaterialTheme.shapes.large,
                    modifier = Modifier
                        .padding(top = 15.dp, start = 30.dp, end = 30.dp)
                        .fillMaxWidth()
                        .height(height = 70.dp),
                    label = { Text(text = "Asal Kota")},
                    onValueChange = {
                        textKota = it
                    }
                )

                Spacer(modifier = Modifier.height(15.dp))

                Row {
                    OutlinedTextField(
                        value = textTanggal,
                        singleLine = true,
                        shape = MaterialTheme.shapes.large,
                        modifier = Modifier
                            .padding(start = 30.dp)
                            .width(width = 150.dp)
                            .height(height = 70.dp),
                        label = { Text(text = "Tanggal Lahir") },
                        onValueChange = {
                            textTanggal = it
                        }
                    )

                    OutlinedTextField(
                        value = textRW,
                        singleLine = true,
                        shape = MaterialTheme.shapes.large,
                        modifier = Modifier
                            .padding(start = 20.dp)
                            .width(width = 70.dp)
                            .height(height = 70.dp),
                        label = { Text(text = "RW") },
                        onValueChange = {
                            textRW = it
                        }
                    )

                    //Spacer(modifier = Modifier.width(width = 20.dp))

                    OutlinedTextField(
                        value = textRT,
                        singleLine = true,
                        shape = MaterialTheme.shapes.large,
                        modifier = Modifier
                            .padding(start = 20.dp)
                            .width(width = 70.dp)
                            .height(height = 70.dp),
                        label = { Text(text = "RT") },
                        onValueChange = {
                            textRT = it
                        }
                    )
                }

                Spacer(modifier = Modifier.height(height = 10.dp))

                OutlinedTextField(
                    value = textUmur,
                    singleLine = true,
                    shape = MaterialTheme.shapes.large,
                    modifier = Modifier
                        .padding(top = 3.dp, start = 30.dp, end = 30.dp)
                        .fillMaxWidth()
                        .height(height = 70.dp),
                    label = {Text(text = "Umur")},
                    onValueChange = {
                        textUmur = it
                    }
                )

                Spacer(modifier = Modifier.height(height = 10.dp))

                Text(
                    text = stringResource(id = R.string.jenis_kelamin),
                    color = Color.Black,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(top = 10.dp, start = 30.dp),
                )
                Row {
                    gender.forEach { item ->
                        Row(
                            modifier = Modifier
                                .padding(start = 20.dp)
                                .selectable(
                                    selected = textJK == item,
                                    onClick = {textJK = item}
                                ), verticalAlignment = Alignment.CenterVertically
                        ){
                            RadioButton(
                                selected = textJK == item,
                                onClick = {
                                    textJK = item
                                }
                            )
                            Text(text = item)
                        }
                    }
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Checkbox(
                        modifier = Modifier.padding(start = 65.dp),
                        checked = validasi.value,
                        onCheckedChange = {
                                newValue -> validasi.value = newValue
                        }
                    )
                    Text(modifier = Modifier.padding(end = 40.dp),
                        text = "Saya setuju dengan syarat dan ketentuan yang berlaku",
                        fontSize = 15.sp,
                        color = Color.Black
                    )
                }

                Spacer(modifier = Modifier.height(height = 40.dp))

                Button(
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .padding(top = 10.dp, start = 100.dp, end = 100.dp)
                        .height(height = 60.dp),

                    enabled = validasi.value,
                    onClick = {
                        nama = textNama
                        kota = textKota
                        tanggal = textTanggal
                        rt = textRT
                        rw = textRW
                        umur = textUmur
                        jenisKelamin = textJK

                        showDialog = true
                    }
                ) {
                    Text(text = stringResource(id = R.string.submit))
                }
            }
        }
        if(showDialog){
            AlertDialog(
                onDismissRequest = {showDialog = false},
                title = {Text(text = "Data Pendaftaran")},
                text = {
                    Column {
                        Text(text = "Nama       :$nama")
                        Text(text = "Asal Kota  :$kota")
                        Text(text = "Tgl Lahir  :$tanggal")
                        Text(text = "Alamat     : RT $rt / RW $rw")
                        Text(text = "Umur       :$umur")
                        Text(text = "Kelamin    :$jenisKelamin")
                    }
                },
                confirmButton = {
                    Button(
                        onClick = {
                            showDialog = false
                            // Opsional: Kosongkan kembali form setelah dialog ditutup
                            textNama= ""
                            textKota= ""
                            textTanggal= ""
                            textRT= ""
                            textRW= ""
                            textUmur= ""
                            textJK= ""
                            validasi.value= false
                        }
                    ) {
                        Text("OK")
                    }
                }
            )
        }
    }
}