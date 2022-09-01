package com.oguzel.loginscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.oguzel.loginscreen.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.buttonBackToGetStarted.setOnClickListener {
            //Clicking this button will open Get Started Activity
            val intent2 = Intent(this, GetStartedActivity::class.java)
            startActivity(intent2)
        }

        binding.textViewOrCreateANew.setOnClickListener {
            //Clickin this text will open Create Account Activity
            val intent3 = Intent(this,CreateAccountActivity::class.java)
            startActivity(intent3)
        }

        binding.buttonLogin.setOnClickListener {
            //Only 1 username and password defined right now. There may be Firebase implementation for this login page.
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