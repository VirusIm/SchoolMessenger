package com.example.chatoto

import android.content.Intent
import android.graphics.drawable.BitmapDrawable
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.storage.FirebaseStorage
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_register.*
import java.util.*

class LoginActivity: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        enter_button_login.setOnClickListener {       //код відтворюється після натискання кнопки
            performLogin()
        }
        back_to_register_textView.setOnClickListener {
            Log.d("LoginActivity", "Перехід на реєстраційне вікно")

            val intent = Intent(this, RegisterActivity::class.java)    //змінна, що приймає класс RegisterAvtivity
            startActivity(intent)   //запускає activity по зміннії в якої записан клас
        }
    }

    private fun  performLogin() {
        Log.d("LoginActivity", "Проверка")
        /*val email = email_login.text.toString()
        val password = password_login.text.toString()

        //Перевірка на пусте поле та повідомлення
        if (email.isEmpty() || password.isEmpty()){
            Toast.makeText(this, "Будь-ласка, заповнить email/пароль", Toast.LENGTH_SHORT).show()
            return
        }

        Log.d("LoginActivity", "Email is: $email")       //Запис пошти
        Log.d("LoginActivity", "Password: $password")        //Запис пароля

        // Вход в систему с использованием email и password
        FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    // Вход выполнен успешно, переход к MessangerActivity
                    Log.d("LoginActivity", "Вход выполнен успешно! uid: ${task.result?.user?.uid}")
                    val intent = Intent(this, MessangerActivity::class.java)
                    intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK.or(Intent.FLAG_ACTIVITY_NEW_TASK)
                    startActivity(intent)
                } else {
                    // Ошибка входа, вывод сообщения об ошибке
                    Log.d("LoginActivity", "Ошибка входа: ${task.exception?.message}")
                    Toast.makeText(this, "Ошибка входа", Toast.LENGTH_SHORT).show()
                }
            }*/
    }

}