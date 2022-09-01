package com.oguzel.loginscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.oguzel.loginscreen.databinding.ActivityCreateAccountBinding

class CreateAccountActivity : AppCompatActivity() {

   private lateinit var binding : ActivityCreateAccountBinding
   private lateinit var intentBackToLogin : Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateAccountBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonBackToLogin.setOnClickListener {
            //Clicking button will open Login activity
            intentBackToLogin = Intent(this,LoginActivity::class.java)
            startActivity(intentBackToLogin)
        }

        binding.buttonSignUp.setOnClickListener {
            //TODO Sign up functionality with Firebase will be implemented in the future.
            Toast.makeText(this,"Not Implemented Yet",Toast.LENGTH_SHORT).show()
        }

    }
}