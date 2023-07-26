package com.example.last_cal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    var showdisplay:TextView
    var enterfirstnumber:EditText
    var entersecondnumber:EditText
    var plusbutton:Button
    var minusbuton:Button
    var dividebutton:Button
    var multiplybutton:Button


        showdisplay=findViewById(R.id.answerview)
        enterfirstnumber=findViewById(R.id.EnterNumber1)
        entersecondnumber=findViewById(R.id.EnterNumber2)
        plusbutton=findViewById(R.id.btnplus)
        minusbuton=findViewById(R.id.btnminus)
        dividebutton=findViewById(R.id.btndivide)
        multiplybutton=findViewById(R.id.btnmultiply)

        plusbutton.setOnClickListener {
            val num1=enterfirstnumber.text.toString().toInt()
            val num2=entersecondnumber.text.toString().toInt()

            showdisplay.text=addition(num1,num2).toString()
        }

        minusbuton.setOnClickListener {
            val num1=enterfirstnumber.text.toString().toInt()
            val num2=entersecondnumber.text.toString().toInt()

            showdisplay.text=substract(num1,num2).toString()

        }
        dividebutton.setOnClickListener {
            val num1=enterfirstnumber.text.toString().toInt()
            val num2=entersecondnumber.text.toString().toInt()

            showdisplay.text=division(num1,num2).toString()

        }

        multiplybutton.setOnClickListener {
            val num1=enterfirstnumber.text.toString().toInt()
            val num2=entersecondnumber.text.toString().toInt()

            showdisplay.text=multi(num1,num2).toString()
        }





    }

    private fun multi(num1: Int, num2: Int): Int {

        val result=num1*num2
        return result

    }

    private fun division(num1: Int, num2: Int): Int {

        val result=num1/num2
        return result

    }

    private fun substract(num1: Int, num2: Int): Int {
        val result=num1-num2
        return result

    }

    private fun addition(num1: Int, num2: Int): Int {
        val result=num1+num2
        return result
    }


}