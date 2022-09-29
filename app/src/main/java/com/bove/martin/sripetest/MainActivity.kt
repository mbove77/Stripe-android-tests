package com.bove.martin.sripetest

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bove.martin.sripetest.databinding.ActivityMainBinding
import com.bove.martin.sripetest.payments.SinglePaymentActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.singlePayment.setOnClickListener {
            intent = Intent(this, SinglePaymentActivity::class.java)
            startActivity(intent)
        }
    }
}