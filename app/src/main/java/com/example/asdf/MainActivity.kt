package com.example.asdf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.view.get
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.Zatwierdz).setOnClickListener{
            findViewById<TextView>(R.id.Wynik).text =
                (findViewById<TextInputEditText>(R.id.Imie).text.toString()) + (findViewById<TextInputEditText>(R.id.Nazwisko).text.toString())

        }
    }
}