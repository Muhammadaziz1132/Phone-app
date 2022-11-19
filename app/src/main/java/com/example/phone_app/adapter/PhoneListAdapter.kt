package com.example.phone_app.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.phone_app.R
import com.example.phone_app.models.Phone
import kotlinx.android.synthetic.main.item_phoe_list.view.*

class PhoneListAdapter(
    context: Context,
    private val list: List<Phone>,
    private val itemClickListPhones: ItemClickListPhones
) : ArrayAdapter<Phone>(context, R.layout.item_phoe_list, list) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val itemView: View = convertView ?: LayoutInflater.from(parent.context)
            .inflate(R.layout.item_phoe_list, parent, false)

        itemView.txt_item_phone.text = list[position].name

        itemView.card_item_phone.setOnClickListener {
            itemClickListPhones.onClick(list[position], position)
        }

        return itemView
    }
}

interface ItemClickListPhones {
    fun onClick(phone: Phone, position: Int)
}