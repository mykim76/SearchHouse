package com.example.searchhouse.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.searchhouse.R
import com.example.searchhouse.datas.Room

class RoomAdapter(context:Context,resId:Int, list: List<Room>):ArrayAdapter<Room>(context, resId,list) {

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if(tempRow==null){
            tempRow = inf.inflate(R.layout.room_list_item, null)
        }

        var row = tempRow!!

        val priceTxt = row.findViewById<TextView>(R.id.prictTxt)
        val addressTxt = row.findViewById<TextView>(R.id.addressTxt)
        val descTxt = row.findViewById<TextView>(R.id.decriptionTxt)

        //val data = mList.get(position)
        val data = mList[position]

        priceTxt.text = "${data.getPriceText()}"
        addressTxt.text = "${data.address}, ${data.getFlower()}"
        descTxt.text = data.description


        return row

    }
}