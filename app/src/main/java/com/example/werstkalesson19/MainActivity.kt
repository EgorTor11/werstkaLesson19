package com.example.werstkalesson19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tvNapoli :TextView
    lateinit var tvLazio :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvNapoli=findViewById(R.id.tvNapoli)
        tvLazio=findViewById(R.id.tvLazio)
        var txtNapoli:String=tvNapoli.text.toString()
        if(txtNapoli.length>10){
            tvNapoli.setText(txtNapoli.substring(0,8)+"...")
        }
        var txtLazio:String=tvLazio.text.toString()
        if(txtLazio.length>10){
            tvLazio.text=txtLazio.substring(0,8)+"..."
        }
    }
}