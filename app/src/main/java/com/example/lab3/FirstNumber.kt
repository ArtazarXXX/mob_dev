package com.example.lab3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.lab3.databinding.FirstNumberBinding

class FirstNumber : Fragment() {
    private lateinit var binding: FirstNumberBinding
    private var x :Int = 0

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FirstNumberBinding.inflate(layoutInflater)
        val view = binding.root
        nextButtonClick()
        return view
    }

    private fun nextButtonClick(){
        binding.next.setOnClickListener{
            val activityCollback = requireActivity() as ActivityCollback
            Calculator.number1 = binding.number1.text.toString().toInt()
            activityCollback.showNextFragment(x)
        }
    }

}