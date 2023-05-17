package com.example.chatoto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_new_messanger.*


class NewMessangerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_messanger)

        supportActionBar?.title = "Вибір користувача"     //Перейменування назви вікна

//        val adapter = GroupAdapter<RecyclerView.ViewHolder>()

//        recyclerview_newmessanger.adapter = adapter
//        recyclerview_newmessanger.layoutManager = LinearLayoutManager(this)
    }

//    class GroupAdapter<T> : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
//
//    }
}