package com.example.firstapplication

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etOtp = findViewById<EditText>(R.id.etOtp)

        val otp1 = findViewById<TextView>(R.id.tv1)
        val otp2 = findViewById<TextView>(R.id.tv2)
        val otp3 = findViewById<TextView>(R.id.tv3)
        val otp4 = findViewById<TextView>(R.id.tv4)
        val otp5 = findViewById<TextView>(R.id.tv5)
        val otp6 = findViewById<TextView>(R.id.tv6)

        val otpTvArrayList = ArrayList<TextView>()

        otpTvArrayList.add(otp1)
        otpTvArrayList.add(otp2)
        otpTvArrayList.add(otp3)
        otpTvArrayList.add(otp4)
        otpTvArrayList.add(otp5)
        otpTvArrayList.add(otp6)

        etOtp.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(p0: Editable?) {
                for(i in 0 until otpTvArrayList.size)
                    otpTvArrayList[i].text = ""
                for(i in p0!!.indices)
                    otpTvArrayList[i].text = p0[i].toString()
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

        })

    }
}