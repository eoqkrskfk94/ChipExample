package com.mobinity.chipexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.datepicker.MaterialDatePicker
import com.mobinity.chipexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.choiceChipGroup.setOnCheckedChangeListener { group, checkedId ->

            println(checkedId)

            when(checkedId){
                R.id.choice_chip -> Toast.makeText(this, "cars", Toast.LENGTH_SHORT).show()
                R.id.choice_chip2 -> Toast.makeText(this, "trucks", Toast.LENGTH_SHORT).show()
            }
        }

        binding.tvDate.setOnClickListener {
            val builder = MaterialDatePicker.Builder.dateRangePicker()
            val picker = builder.build()
            picker.show(supportFragmentManager, picker.toString())
            //picker.show(activity?.supportFragmentManager!!, picker.toString())
        }

        //test1
        //test2
        //test3


    }
}