package com.mayank.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    //var dot:Button =
    var operations = arrayOfNulls<Button>(6)
    var numbers = arrayOfNulls<Button>(10)

    lateinit var result: TextView
    lateinit var editor: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numbers[0] = findViewById(R.id.zero)
        numbers[1] = findViewById(R.id.one)
        numbers[2] = findViewById(R.id.two)
        numbers[3] = findViewById(R.id.three)
        numbers[4] = findViewById(R.id.four)
        numbers[5] = findViewById(R.id.five)
        numbers[6] = findViewById(R.id.six)
        numbers[7] = findViewById(R.id.seven)
        numbers[8] = findViewById(R.id.eight)
        numbers[9] = findViewById(R.id.nine)

//        dot = findViewById(R.id.dot)

        operations[0] = findViewById(R.id.add)
        operations[1] = findViewById(R.id.subtract)
        operations[2] = findViewById(R.id.multiply)
        operations[3] = findViewById(R.id.divide)
        operations[4] = findViewById(R.id.equal)
        operations[5] = findViewById(R.id.delete)

        result = findViewById(R.id.result)
        editor = findViewById(R.id.editor)

        for (i in 0..9) {
            numbers[i]?.setOnClickListener(this)
        }
        for (i in 0..5) {
            operations[i]?.setOnClickListener(this)
        }

        //dot.setOnClickListener(this)
    }

    override fun onClick(v: View) {

    }
}
