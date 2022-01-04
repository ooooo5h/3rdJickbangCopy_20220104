package com.eunhyung.a3rdjickbangcopy_20220104.models

class RoomData(
    val price : Int,
    val address : String,
    val floor : Int,
    val description : String
) {

    fun getFormattedFloor() : String {

        if (this.floor > 0) {
            return "${this.floor}층"
        }
        else if (this.floor < 0) {
            return "지하 ${-this.floor}층"
        }
        else {
            return "반지하"
        }


    }
}