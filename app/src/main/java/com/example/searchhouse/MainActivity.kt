package com.example.searchhouse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.searchhouse.adapters.RoomAdapter
import com.example.searchhouse.datas.Room
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    val roomArryList = ArrayList<Room>()

    lateinit var roomAdapter:RoomAdapter //선언만 우선 하고 형은 나중에 알려주겠어

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setValues()
    }

    override fun setValues() {

        addRooms()
        roomAdapter = RoomAdapter(mContext, R.layout.room_list_item,roomArryList)
        roomListView.adapter = roomAdapter
    }

    override fun setupEvents() {
    }
    fun addRooms(){
        roomArryList.add(Room(25000,"마포구 서교동",3,"마포구 서교동 입니다."))
        roomArryList.add(Room(75000,"송파구 잠원동",5,"송파구 잠원동 입니다."))
        roomArryList.add(Room(8000,"마포구 서교동",0,"마포구 서교동 입니다."))
        roomArryList.add(Room(125000,"강남구 역삼동",17,"강남구 역삼동 입니다."))
        roomArryList.add(Room(59000,"송파구 풍납동",7,"송파구 풍납동 3층입니다."))
        roomArryList.add(Room(8000,"영등포구 여의도동",-1,"영등포구 여의도동 3층입니다."))
        roomArryList.add(Room(37000,"송파구 방이동",4,"송파구 방이동3층입니다."))
        roomArryList.add(Room(9900,"남양주 호평동",0,"남양주 호평동 3층입니다."))
        roomArryList.add(Room(10000,"서초구 서초동",3,"서초구 서초동 3층입니다."))
        roomArryList.add(Room(7600,"화도읍 마석동",-1,"화도읍 마석동 3층입니다."))
        roomArryList.add(Room(3100,"관악구 봉천동",-2,"관악구 봉천 3층입니다."))
        roomArryList.add(Room(71000,"마포구 서교동",0,"마포구 서교동 3층입니다."))
        roomArryList.add(Room(116000,"강남구 서교동",17,"강남구 서교동 3층입니다."))
        roomArryList.add(Room(25900,"관악구 신림동",-1,"관악구 신림동 3층입니다."))
    }
}
