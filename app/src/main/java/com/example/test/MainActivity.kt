package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fun proiz(p: Double) {
            var a: Double = Edit1Text.text.toString().toInt() * p * 60
            Edit2Text.setText(a.toString())
        }

        /*fun checkp(): Double {
            var ch: Double = 0.0
            radio_group.setOnCheckedChangeListener(
                RadioGroup.OnCheckedChangeListener { group, checkedId ->
                    val radio: RadioButton = findViewById(checkedId)
                    Edit2Text.setText(radio.text)
                    when (radio.text) {
                        "Рубль" -> ch = 1.0
                        "Доллар" -> ch = 70.0
                        "Евро" -> ch = 80.0
                        "Фунт" -> ch = 100.0
                    }
                })
            return ch
        }*/

        /*button.setOnClickListener {
            var h: Double = 1 / checkp()
            proiz(h)
        }*/
    }


        fun radio22 (view: View) {
        var ch: Double = 0.0
        radio_group.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Edit2Text.setText(radio.text)})}}
               /* when (radio.text){
                    "Рубль" -> ch = 1.0
                    "Доллар" -> ch = 70.0
                    "Евро" -> ch = 80.0
                    "Фунт" -> ch = 100.0}})
        return ch 8/
    }
}*/