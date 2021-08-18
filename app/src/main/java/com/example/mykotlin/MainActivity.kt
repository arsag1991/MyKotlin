package com.example.mykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mykotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.button.setOnClickListener {
            val textFromET = bindingClass.fio.text.toString()
            when (textFromET) {

                Constance.buh -> {
                    val tempText = "Ваша зарплата: ${Constance.zpBuh}"
                    if (bindingClass.password.text.toString() == Constance.passBuh)
                    {bindingClass.resault.text = tempText }
                    else {bindingClass.resault.text = "Неверный пароль"}
                }

                Constance.it -> {
                    val tempText = "Ваша зарплата: ${Constance.zpIt}"
                    if (bindingClass.password.text.toString() == Constance.passIt)
                    {bindingClass.resault.text = tempText}
                     else {bindingClass.resault.text = "Неверный пароль"}
                }

                Constance.kadri -> {
                    val tempText = "Ваша зарплата: ${Constance.zpKadri}"
                if (bindingClass.resault.text.toString() == Constance.passKadri)
                    {bindingClass.resault.text = tempText}
                    else {bindingClass.resault.text = "Неверный пароль"}
                }

                else ->{bindingClass.resault.text = "Нет такого работника"}



            }


        }



    }


}