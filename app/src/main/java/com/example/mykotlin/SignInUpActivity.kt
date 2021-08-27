package com.example.mykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.example.mykotlin.databinding.ActivitySignInUpBinding

class SignInUpActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivitySignInUpBinding
    private var signState = "empty"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivitySignInUpBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        signState = intent.getStringExtra(Constance.Sign_state)!!

        if (signState == Constance.Sign_in_state) {
            bindingClass.edName.visibility = View.GONE
            bindingClass.edName2.visibility = View.GONE
            bindingClass.edName3.visibility = View.GONE
            bindingClass.bAvatar.visibility = View.INVISIBLE
            bindingClass.bAvatar.visibility = View.INVISIBLE
        }
        }
    fun onClickDone(view: View) {
        if (signState == Constance.Sign_in_state) {

        }
    }
    fun onClickAvatar(view: View) {
                bindingClass.imAvatar.visibility = View.VISIBLE
            }


}