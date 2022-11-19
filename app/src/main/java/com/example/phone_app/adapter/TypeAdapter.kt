package com.example.phone_app.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.phone_app.R
import kotlinx.android.synthetic.main.item_grid.view.*


class TypeAdapter(context: Context, val list: List<String>, val itemGridOnClick: Any):ArrayAdapter<String>(context, R.layout.item_grid,list) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var itemView:View
        if (convertView!=null){
            itemView = convertView
        }else{
            itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_grid,parent,false)
        }

        itemView.txt_item_grid.text = list[position]
        itemView.card_item.setOnClickListener{

            itemGridOnClick.onCLick(list[position],position)
        }

        return itemView
    }
}

private fun Any.onCLick(s: String, position: Int) {

}

interface itemGridOnClick{
    fun onCLick(type:String, position: Int)
}