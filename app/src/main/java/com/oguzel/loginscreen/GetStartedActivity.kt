package com.oguzel.loginscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.oguzel.loginscreen.databinding.ActivityGetstartedBinding

class GetStartedActivity : AppCompatActivity() {

    private lateinit var binding : ActivityGetstartedBinding
    private lateinit var intentToLogin : Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGetstartedBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonJoinNow.setOnClickListener {
            //Clicking this button will open login activity
            intentToLogin = Intent(this,LoginActivity::class.java)
            startActivity(intentToLogin)
        }
    }
}