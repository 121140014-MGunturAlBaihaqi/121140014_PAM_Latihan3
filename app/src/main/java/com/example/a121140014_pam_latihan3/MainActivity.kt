package com.example.a121140014_pam_latihan3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.a121140014_pam_latihan3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding // View Binding
    private lateinit var dialogExample: DialogExample

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Menginisialisasi binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Mengakses elemen UI melalui variabel binding
        binding.textView.text = "Hello, View Binding!"
        binding.button.setOnClickListener {
            Log.d("MainActivity", "Button clicked")
            dialogExample.show()
        }

        dialogExample = DialogExample(this)

        // Menambahkan FragmentExample ke dalam fragment_container
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container, FragmentExample())
        fragmentTransaction.commit()
    }
}
