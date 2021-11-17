package com.example.diceroler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttomJogar: Button = findViewById(R.id.buttomJogar)

        buttomJogar.setOnClickListener {

            jogarDado()
        }
    }

    private fun jogarDado (){
        Toast.makeText( this,"botão clicado", Toast.LENGTH_SHORT).show()
        val numSorteado = (1..6).random()
        val imagemDado = findViewById<ImageView>(R.id.imagemDado)
        val imagemMostrada = when (numSorteado) {
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else-> R.drawable.dice_6
        }
        imagemDado.setImageResource(imagemMostrada)
    }
}