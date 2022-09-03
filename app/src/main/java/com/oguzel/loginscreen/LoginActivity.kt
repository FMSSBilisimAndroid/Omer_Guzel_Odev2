package com.oguzel.loginscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.oguzel.loginscreen.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var intentToGetStarted: Intent
    private lateinit var intentToCreateAccount: Intent
    private lateinit var username: EditText
    private lateinit var password: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        username = binding.editTextUserName
        password = binding.editTextPassword

        binding.buttonBackToGetStarted.setOnClickListener {
            //Clicking this button will open Get Started Activity
            intentToGetStarted = Intent(this, GetStartedActivity::class.java)
            startActivity(intentToGetStarted)
        }
        binding.textViewOrCreateANew.setOnClickListener {
            //Clicking this text will open Create Account Activity
            intentToCreateAccount = Intent(this, CreateAccountActivity::class.java)
            startActivity(intentToCreateAccount)
        }
        binding.buttonLogin.setOnClickListener {
            loginAuth(username, password)
        }
    }

    /**
     * "admin" for both as username and password verifies login
     * @param username Username from LoginActivity EditText
     * @param password Password from Login Activity EditText
     */
    private fun loginAuth(username: EditText, password: EditText) {
        if (username.text.toString() == "admin" && password.text.toString() == "admin") {
            //Login Successful
            Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
        } else {
            //Login Failed
            Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show()
        }
    }
}
