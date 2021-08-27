package com.example.mykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.mykotlin.databinding.ActivitySignInUpBinding

class SignInUpActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivitySignInUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivitySignInUpBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }
}