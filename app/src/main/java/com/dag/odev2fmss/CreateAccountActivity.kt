package com.dag.odev2fmss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.dag.odev2fmss.databinding.ActivityCreateAccountBinding

class CreateAccountActivity : AppCompatActivity() {

    private lateinit var binding : ActivityCreateAccountBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateAccountBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonBackToLogin.setOnClickListener {
            val intent4 = Intent(this,LoginActivity::class.java)
            startActivity(intent4)
        }

        binding.buttonSignUp.setOnClickListener {
            Toast.makeText(this,"Not Implemented Yet",Toast.LENGTH_SHORT).show()
        }

    }
}