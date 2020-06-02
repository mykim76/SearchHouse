package com.example.searchhouse.datas

class Room(val price: Int, val address: String, val floor: Int, val description: String) {

    fun getPriceText(): String
    {
        //price // 2억 5,000 => 25000, 8천 => 8,000 : Int
        var priceTxt = ""
        val portion = price / 10000
        val remainder = price % 10000
        if(portion>0)
        {
            priceTxt ="${portion} 억 ${remainder}"
        }
        else if(portion==0)
        {
            priceTxt ="${remainder}"
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
            floorTxt = "지하 ${floor}층"
        }
        return floorTxt
    }
}