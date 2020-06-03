package com.example.searchhouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.searchhouse.datas.Room
import kotlinx.android.synthetic.main.activity_view_room_detail.*

class ViewRoomDetailActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

        setupEvents()
        setValues()
    }

    override fun setValues() {
        //val myRoom = intent.getParcelableExtra<Room>("room")
        val myRoom = intent.getSerializableExtra("room") as Room
        val resourceId = mContext.resources.getIdentifier(myRoom.src,"drawable",mContext.packageName)

        imgHouse.setImageResource(resourceId)
        txtPrice.text = myRoom.getPriceText()
        txtAddress.text = "${myRoom.address}, ${myRoom.getFlower()}"
        txtDesc.text = myRoom.description
    }

    override fun setupEvents() {
    }
}

