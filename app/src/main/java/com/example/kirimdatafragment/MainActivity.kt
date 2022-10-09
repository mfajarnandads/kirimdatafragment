package com.example.kirimdatafragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNim = findViewById<EditText>(R.id.etNim)
        val etNama = findViewById<EditText>(R.id.etNama)
        val spnProdi = findViewById<Spinner>(R.id.spnProdi)
        val btnKirim = findViewById<Button>(R.id.btnKirim)

        val arrProdi = arrayOf("Teknik Informatika", "Sistem Informasi", "Bisnis Digital")
        val adpProdi = ArrayAdapter(
            this@MainActivity,
            android.R.layout.simple_spinner_dropdown_item,
            arrProdi
        )
        spnProdi.adapter = adpProdi

        btnKirim.setOnClickListener{
            val nim = "${etNim.text}"
            val nama = "${etNama.text}"
            val prodi = "${spnProdi.selectedItem}"

            val fm = supportFragmentManager
            val ft = fm.beginTransaction()
            val fragment = datafragment()
            val b = Bundle()
            b.putString("nim", nim)
            b.putString("nama", nama)
            b.putString("prodi",prodi)
            fragment.arguments = b
            ft.replace(R.id.fragData, fragment).commit()
        }
    }
}