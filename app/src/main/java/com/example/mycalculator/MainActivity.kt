package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var tvInput : TextView? = null
    var textNum : Boolean = false // 첨에는 숫자가 없음
    var lastDot : Boolean = false // 첨에는 dot도 없음

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvInput = findViewById(R.id.tvinput)
    }

    fun onDigit(view : View) { // view는 실제 버튼을 의미
        tvInput?.append((view as Button).text)
        textNum = true // 숫자가 입력되면 textNum은 ture로 변환
    }

    fun onClick(view: View) {
        tvInput?.text = ""
    }

    fun onDecimalPoint(view : View) {
        if (textNum == true && lastDot == false) {
            tvInput?.append(".")
            lastDot = true // dot이 존재하는지 저장하는 변수
        }
    }
}