package com.example.aplikasikalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi view Button berdasarkan id
        val btnTambah : Button = findViewById(R.id.btn_tambah)
        val btnKurang : Button = findViewById(R.id.btn_kurang)
        val btnKali : Button = findViewById(R.id.btn_kali)
        val btnBagi : Button = findViewById(R.id.btn_bagi)
        val btnClear : Button = findViewById(R.id.btn_clear)

        // Menambahkan aksi ketika button di klik
        btnTambah.setOnClickListener { hitungTambah() }
        btnKurang.setOnClickListener { hitungKurang() }
        btnKali.setOnClickListener { hitungKali() }
        btnBagi.setOnClickListener { hitungBagi() }
        btnClear.setOnClickListener { Clear() }
    }

    private fun hitungTambah() {
        // Inisialisasi view EditText dan TextView
        val bilanganPertama : EditText = findViewById(R.id.bil1)
        val bilanganKedua : EditText = findViewById(R.id.bil2)
        val tvHasil : TextView = findViewById(R.id.tv_hasil)

        // mengambil hasil inputan dari user kemudian di konversi menjadi tipe data Double
        var bilangan1 = 0
        var bilangan2 = 0
        if (bilanganPertama.text.toString().isNotEmpty() ){
            bilangan1 = bilanganPertama.text.toString().toInt()
        }
        if(bilanganKedua.text.toString().isNotEmpty()){
            bilangan2 = bilanganKedua.text.toString().toInt()
        }

        // Membuat variable hasil yang bernilai hasil dari bilangan1 dan bilangan2
        val hasil = bilangan1 + bilangan2

        // hasil dari konversi ke tipe data string kemudian di tampilkan pada tvhasil
        tvHasil.text = hasil.toString()
    }

    private fun hitungKurang() {
        // Inisialisasi view EditText dan TextView
        val bilanganPertama : EditText = findViewById(R.id.bil1)
        val bilanganKedua : EditText = findViewById(R.id.bil2)
        val tvHasil : TextView = findViewById(R.id.tv_hasil)

        // mengambil hasil inputan dari user kemudian di konversi menjadi tipe data Double
        var bilangan1 = 0
        var bilangan2 = 0
        if (bilanganPertama.text.toString().isNotEmpty() ){
            bilangan1 = bilanganPertama.text.toString().toInt()
        }
        if(bilanganKedua.text.toString().isNotEmpty()){
            bilangan2 = bilanganKedua.text.toString().toInt()
        }


        // Membuat variable hasil yang bernilai hasil dari bilangan1 dan bilangan2
        val hasil = bilangan1 - bilangan2

        // hasil dari konversi ke tipe data string kemudian di tampilkan pada tvhasil
        tvHasil.text = hasil.toString()
    }

    private fun hitungKali() {
        // Inisialisasi view EditText dan TextView
        val bilanganPertama : EditText = findViewById(R.id.bil1)
        val bilanganKedua : EditText = findViewById(R.id.bil2)
        val tvHasil : TextView = findViewById(R.id.tv_hasil)

        // mengambil hasil inputan dari user kemudian di konversi menjadi tipe data Double
        var bilangan1 = 0
        var bilangan2 = 0
        if (bilanganPertama.text.toString().isNotEmpty() ){
            bilangan1 = bilanganPertama.text.toString().toInt()
        }
        if(bilanganKedua.text.toString().isNotEmpty()){
            bilangan2 = bilanganKedua.text.toString().toInt()
        }

        // Membuat variable hasil yang bernilai hasil dari bilangan1 dan bilangan2
        val hasil = bilangan1 * bilangan2

        // hasil dari konversi ke tipe data string kemudian di tampilkan pada tvhasil
        tvHasil.text = hasil.toString()
    }

    private fun hitungBagi() {
        // Inisialisasi view EditText dan TextView
        val bilanganPertama : EditText = findViewById(R.id.bil1)
        val bilanganKedua : EditText = findViewById(R.id.bil2)
        val tvHasil : TextView = findViewById(R.id.tv_hasil)

        // mengambil hasil inputan dari user kemudian di konversi menjadi tipe data Double
        var bilangan1 = 0.0
        var bilangan2 = 0.0
        if (bilanganPertama.text.toString().isNotEmpty() ){
            bilangan1 = bilanganPertama.text.toString().toDouble()
        }
        if(bilanganKedua.text.toString().isNotEmpty()){
            bilangan2 = bilanganKedua.text.toString().toDouble()
        }

        // Membuat variable hasil yang bernilai hasil dari bilangan1 dan bilangan2
        val hasil = bilangan1 / bilangan2

        // hasil dari konversi ke tipe data string kemudian di tampilkan pada tvhasil
        tvHasil.text = hasil.toString()
    }

    private fun Clear() {
        // Inisialisasi view EditText dan TextView
        val bilanganPertama : EditText = findViewById(R.id.bil1)
        val bilanganKedua : EditText = findViewById(R.id.bil2)
        val tvHasil : TextView = findViewById(R.id.tv_hasil)

        bilanganPertama.text.clear()
        bilanganKedua.text.clear()
        tvHasil.text = ""
    }
}