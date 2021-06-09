package com.example.dialoghomework

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dialoghomework.databinding.ActivityMainBinding
import com.example.dialoghomework.databinding.DialogItemBinding
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }
    private fun init() {
        binding.turnOffButton.setOnClickListener {
            val dialog = Dialog(this)
            val bindingDialog = DialogItemBinding.inflate(layoutInflater)
            dialog.showDialog(android.R.color.transparent, bindingDialog)
            bindingDialog.yesButton.setOnClickListener {
                exitProcess(-1)
            }
            bindingDialog.noButton.setOnClickListener {
                dialog.cancel()
            }
        }
    }
}