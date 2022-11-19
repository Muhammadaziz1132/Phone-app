package com.example.phone_app.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.phone_app.ItemGridOnClick
import com.example.phone_app.R
import com.example.phone_app.adapter.TypeAdapter
import com.example.phone_app.utils.MyData
import kotlinx.android.synthetic.main.activity_phone_list.*

class PhoneListActivity : AppCompatActivity() {
    private lateinit var phoneListAdapter: TypeAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_list)

        phoneListAdapter = TypeAdapter(this, MyData.typeListName, object : ItemGridOnClick {
            override fun onClick(type: String, position: Int) {

            }
        })

        list_phones.adapter = phoneListAdapter

    }
}