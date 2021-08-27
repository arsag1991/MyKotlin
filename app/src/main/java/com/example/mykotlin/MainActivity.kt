package com.example.mykotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mykotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding
    private var login: String = "empty"
    private var password: String = "empty"
    private var name: String = "empty"
    private var name2: String = "empty"
    private var name3: String = "empty"
    private var avatarImageId: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == Constance.Request_code_sign_in) {

        } else if (requestCode == Constance.Request_code_sign_up){

            }

    }

    fun onClickSignIn (view: View){
        val intent = Intent (this, SignInUpActivity::class.java)
        intent.putExtra(Constance.Sign_state, Constance.Sign_in_state)
        startActivityForResult(intent, Constance.Request_code_sign_in)
    }

    fun onClickSignUp (view: View){
        val intent = Intent (this, SignInUpActivity::class.java)
        intent.putExtra(Constance.Sign_state, Constance.Sign_up_state)
        startActivityForResult(intent, Constance.Request_code_sign_up)
    }





}