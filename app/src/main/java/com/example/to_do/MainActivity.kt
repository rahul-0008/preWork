package com.example.to_do

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val button = findViewById<Button>(R.id.intro_sayHellobutton)
    button.setOnClickListener{

        Log.v("Hello", "button clicked!")
        Toast.makeText(this,"Hello to you too!",Toast.LENGTH_SHORT).show()
      }
    }

}
