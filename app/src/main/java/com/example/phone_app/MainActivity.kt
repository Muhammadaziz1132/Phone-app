package com.example.phone_app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.phone_app.ui.PhoneListActivity
import com.example.phone_app.utils.MyData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadData()

        btn_menu.setOnClickListener {
            startActivity(Intent(this, MenuGridActivity::class.java))
        }

        btn_add.setOnClickListener {
            startActivity(Intent(this, PhoneListActivity::class.java))
        }


    }
    private fun loadData() {
        MyData.typeListName.add("iPhone")
        MyData.typeListName.add("Samsung")
        MyData.typeListName.add("Mi")
        MyData.typeListName.add("Sony")
        MyData.typeListName.add("Yuawei")
        MyData.typeListName.add("Artel")
    }
}