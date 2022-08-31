package com.dag.odev2fmss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.dag.odev2fmss.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonBackToGetStarted.setOnClickListener {
            val intent2 = Intent(this, GetStartedActivity::class.java)
            startActivity(intent2)
        }

        binding.textViewOrCreateANew.setOnClickListener {
            val intent3 = Intent(this,CreateAccountActivity::class.java)
            startActivity(intent3)
        }

        binding.buttonLogin.setOnClickListener {
            if(binding.editTextUserName.text.toString() == "admin" && binding.editTextPassword.text.toString() == "admin") {
                //Login Successful
                Toast.makeText(this,"Login Successful",Toast.LENGTH_SHORT).show()
            } else {
                //Login Failed
                Toast.makeText(this,"Login Failed",Toast.LENGTH_SHORT).show()
            }
        }
    }
}