package com.demirli.a18keyvalueexample

import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var key: String

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        key = ""


        button.setOnClickListener {
            editText.setBackgroundColor(Color.WHITE)
            key = editText.text.toString()
            if(key != ""){
                var binary = ""
                key.toCharArray().forEach {
                    binary = Integer.toString(it.toInt(),2)
                }
                textView.setText(Integer.parseInt(binary).toString())
            }else{
                editText.setBackgroundColor(Color.YELLOW)
            }
        }
    }
}
