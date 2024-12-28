package com.example.calculator

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var binding: ActivityMainBinding
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAdd.setOnClickListener{
            if(binding.firstNumber.text.toString() != "" && binding.secondNumber.text.toString() != "")
            {
               val firstNumber =  binding.firstNumber.text.toString().toInt()
               val secondNumber =  binding.secondNumber.text.toString().toInt()

               val sum = firstNumber + secondNumber

               binding.txtResult.text = "Result : $sum"
            }
        }

        binding.btnSub.setOnClickListener {
            if (binding.firstNumber.text.toString() != "" && binding.secondNumber.text.toString() != "") {
                val firstNumber = binding.firstNumber.text.toString().toInt()
                val secondNumber = binding.secondNumber.text.toString().toInt()

                val sum = firstNumber - secondNumber

                binding.txtResult.text = "Result : $sum"
            }
        }

        binding.btnMult.setOnClickListener {
            if (binding.firstNumber.text.toString() != "" && binding.secondNumber.text.toString() != "") {
                val firstNumber = binding.firstNumber.text.toString().toInt()
                val secondNumber = binding.secondNumber.text.toString().toInt()

                val mul = firstNumber * secondNumber

                binding.txtResult.text = "Result : $mul"
            }
        }

        binding.btnDiv.setOnClickListener {
            if (binding.firstNumber.text.toString() != "" && binding.secondNumber.text.toString() != "") {
                val firstNumber = binding.firstNumber.text.toString().toInt()
                val secondNumber = binding.secondNumber.text.toString().toInt()

                val div = firstNumber / secondNumber

                binding.txtResult.text = "Result : $div"
            }
        }

        binding.btnclear.setOnClickListener {
            if (binding.firstNumber.text.toString() != "" || binding.secondNumber.text.toString() != "") {
                binding.firstNumber.text.clear()
                binding.secondNumber.text.clear()
                binding.txtResult.text = ""
            }
        }

    }
}