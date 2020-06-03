package com.example.searchhouse.datas

import android.os.Parcel
import android.os.Parcelable
import java.io.Serializable
import java.text.NumberFormat

//class Room(val src: String, val price: Int, val address: String, val floor: Int, val description: String)
class Room(val src: String, val price: Int, val address: String, val floor: Int, val description: String) : Serializable
{
//class Room constructor(val src: String?, val price: Int, val address: String?, val floor: Int, val description: String?):
//    Parcelable {
    // added start for godingDetailActivity with this room
//    constructor(parcel: Parcel) : this(
//        parcel.readString(),
//        parcel.readInt(),
//        parcel.readString(),
//        parcel.readInt(),
//        parcel.readString()
//    )
//        {
//    }
//    override fun writeToParcel(parcel: Parcel, flags: Int) {
//        parcel.writeString(src)
//        parcel.writeInt(price)
//        parcel.writeString(address)
//        parcel.writeInt(floor)
//        parcel.writeString(description)
//    }
//    companion object CREATOR : Parcelable.Creator<Room> {
//        override fun createFromParcel(parcel: Parcel): Room {
//            return Room(parcel)
//        }
//
//        override fun newArray(size: Int): Array<Room?> {
//            return arrayOfNulls(size)
//        }
//    }
//
//    override fun describeContents(): Int {
//        return 0
//    }
    // added end

    fun getPriceText(): String //getFormmatedPrice
    {
        //price // 2억 5,000 => 25000, 8천 => 8,000 : Int
        var priceTxt = ""
        val portion = price / 10000
        val remainder = price % 10000
        //int i = 35634646;
        //    String s = NumberFormat.getIntegerInstance().format(i);

        if(portion>0)
        {
            priceTxt ="${portion}억 ${NumberFormat.getIntegerInstance().format(remainder)}"
        }
        else if(portion==0)
        {
            priceTxt ="${NumberFormat.getIntegerInstance().format(remainder) }"
        }

        return priceTxt
    }

    fun getFlower():String
    {
        //floor // Int:1 이상=> 1층,2층, 0층: 반지하, -1이하: 지하1층, 지하 3층
        var floorTxt = ""
        if(floor==0){
            floorTxt = "반지하"
        }
        else if(floor>0){
            floorTxt = "${floor} 층"
        }
        else if(floor<0){
            //floorTxt = "지하 ${floor*-1}층"
            floorTxt = "지하 ${-floor}층"
        }
        return floorTxt
    }
}