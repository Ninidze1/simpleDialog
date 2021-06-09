package com.example.dialoghomework

import android.app.Dialog
import android.renderscript.ScriptGroup
import android.view.Window
import android.view.WindowManager
import androidx.annotation.NonNull
import androidx.viewbinding.ViewBinding
import com.example.dialoghomework.databinding.DialogItemBinding
import kotlin.system.exitProcess

fun Dialog.showDialog(color: Int, binding: ViewBinding) {

    window!!.setBackgroundDrawableResource(color)
    window!!.requestFeature(Window.FEATURE_NO_TITLE)

    val parameters = window!!.attributes
    parameters.width = WindowManager.LayoutParams.MATCH_PARENT
    parameters.height = WindowManager.LayoutParams.WRAP_CONTENT
    show()
    window!!.setContentView(binding.root)

}