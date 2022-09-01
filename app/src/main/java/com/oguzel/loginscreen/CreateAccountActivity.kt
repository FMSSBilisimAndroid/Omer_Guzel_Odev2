package com.oguzel.loginscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.oguzel.loginscreen.databinding.ActivityCreateAccountBinding

class CreateAccountActivity : AppCompatActivity() {

   private lateinit var binding : ActivityCreateAccountBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateAccountBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonBackToLogin.setOnClickListener {
            //Clicking button will open Login activity
            val intent4 = Intent(this,LoginActivity::class.java)
            startActivity(intent4)
        }

        binding.buttonSignUp.setOnClickListener {
            //Sign up functionality with Firebase wiil be implemented in future
            Toast.makeText(this,"Not Implemented Yet",Toast.LENGTH_SHORT).show()
        }

    }
}