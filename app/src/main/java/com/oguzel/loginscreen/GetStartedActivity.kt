package com.oguzel.loginscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.oguzel.loginscreen.databinding.ActivityGetstartedBinding

class GetStartedActivity : AppCompatActivity() {

    private lateinit var binding : ActivityGetstartedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGetstartedBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonJoinNow.setOnClickListener {
            //Clicking this button will open login activity
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}