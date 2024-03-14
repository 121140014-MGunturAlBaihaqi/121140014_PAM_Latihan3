package com.example.a121140014_pam_latihan3

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import com.example.a121140014_pam_latihan3.databinding.DialogLayoutBinding

class DialogExample(context: Context) : Dialog(context) {

    private lateinit var binding: DialogLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DialogLayoutBinding.inflate(LayoutInflater.from(context))
        setContentView(binding.root)

        binding.dialogTextView.text = "This is a dialog"
        binding.dialogButton.setOnClickListener {
            dismiss()
        }
    }
}
