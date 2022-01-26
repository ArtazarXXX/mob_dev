package com.example.lab3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.lab3.databinding.MathOperationBinding

class MathOperation : Fragment(){
    private lateinit var binding: MathOperationBinding
    private var x :Int = 2

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?
    ): View {
        binding = MathOperationBinding.inflate(layoutInflater)
        val view = binding.root
        nextButtonClick()
        backButtonClick()
        return view
    }

    private fun nextButtonClick(){
        binding.next.setOnClickListener{
            val activityCollback = requireActivity() as ActivityCollback
            Calculator.math_operation = binding.operation.text.toString()
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