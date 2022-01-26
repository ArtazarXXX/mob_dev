package com.example.lab3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.lab3.databinding.SecondNumberBinding

class SecondNumber : Fragment(){
    private lateinit var binding: SecondNumberBinding
    private var x :Int = 1

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?
    ): View? {
        binding = SecondNumberBinding.inflate(layoutInflater)
        val view = binding.root
        nextButtonClick()
        backButtonClick()
        return view
    }

    private fun nextButtonClick(){
        binding.next.setOnClickListener{
            val activityCollback = requireActivity() as ActivityCollback
            Calculator.number2 = binding.number2.text.toString().toInt()
            activityCollback.showNextFragment(x)
        }
    }

    private fun backButtonClick(){
        binding.back.setOnClickListener {
            val activityCollback = requireActivity() as ActivityCollback
            activityCollback.showBackFragment(x)
        }
    }
}