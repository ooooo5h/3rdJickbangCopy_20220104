package com.eunhyung.a3rdjickbangcopy_20220104

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eunhyung.a3rdjickbangcopy_20220104.models.RoomData
import kotlinx.android.synthetic.main.activity_view_room_detail.*

class ViewRoomDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

        val roomData = intent.getSerializableExtra("room") as RoomData

        txtPrice.text = roomData.getFormattedPrice()
        txtAddress.text = roomData.address
        txtFloor.text = roomData.getFormattedFloor()
        txtDescription.text = roomData.description


    }
}