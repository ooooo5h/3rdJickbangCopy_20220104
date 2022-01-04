package com.eunhyung.a3rdjickbangcopy_20220104

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eunhyung.a3rdjickbangcopy_20220104.models.RoomData

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<RoomData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add( RoomData(9522, "서울시 중랑구", -1, "1번쨰 방"))
        mRoomList.add( RoomData(12345, "서울시 광진구", -2, "2번쨰 방"))
        mRoomList.add( RoomData(8000, "서울시 노원구", 0, "3번쨰 방"))
        mRoomList.add( RoomData(35000, "서울시 동대문구", 3, "4번쨰 방"))
        mRoomList.add( RoomData(44000, "서울시 서대문구", 1, "5번쨰 방"))
        mRoomList.add( RoomData(39652, "서울시 송파구", 7, "6번쨰 방"))
        mRoomList.add( RoomData(25333, "서울시 강남구", -1, "7번쨰 방"))
        mRoomList.add( RoomData(70000, "서울시 영등포구", 24, "8번쨰 방"))
        mRoomList.add( RoomData(85000, "서울시 강동구", 15, "9번쨰 방"))


    }
}