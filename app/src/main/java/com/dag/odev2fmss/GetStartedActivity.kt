package com.dag.odev2fmss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dag.odev2fmss.databinding.ActivityGetstartedBinding

class GetStartedActivity : AppCompatActivity() {

    private lateinit var binding : ActivityGetstartedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGetstartedBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonJoinNow.setOnClickListener {
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}