package com.example.belajaredittext2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Initialitation By ID
        val nilaiA = findViewById<EditText>(R.id.edt_a)
        val nilaiB = findViewById<EditText>(R.id.edt_b)
        val value = findViewById<TextView>(R.id.tv_value)
        val add = findViewById<Button>(R.id.btn_add)
        val sub = findViewById<Button>(R.id.btn_sub)
        val mul = findViewById<Button>(R.id.btn_mul)
        val div = findViewById<Button>(R.id.btn_div)

        //Button Function When Click For Addiction
        add.setOnClickListener {
            val numberA = nilaiA.text.toString().toInt()
            val numberB = nilaiB.text.toString().toInt()
            val addiction = numberA + numberB
            value.text = addiction.toString()
        }
        //Button Function When Click For Subtraction
        sub.setOnClickListener {
            val numberA = nilaiA.text.toString().toInt()
            val numberB = nilaiB.text.toString().toInt()
            val addiction = numberA - numberB
            value.text = addiction.toString()
        }
        //Button Function When Click For Multiplication
        mul.setOnClickListener {
            val numberA = nilaiA.text.toString().toInt()
            val numberB = nilaiB.text.toString().toInt()
            val addiction = numberA * numberB
            value.text = addiction.toString()
        }
        //Button Function When Click For Division
        div.setOnClickListener {
            val numberA = nilaiA.text.toString().toInt()
            val numberB = nilaiB.text.toString().toInt()
            val addiction = numberA / numberB
            value.text = addiction.toString()
        }
    }
}