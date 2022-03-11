package aop.fastcampus.part6.chapter01.data.entity.friend

import android.os.Parcelable
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import aop.fastcampus.part6.chapter01.data.entity.Entity
import aop.fastcampus.part6.chapter01.screen.home.restaurant.RestaurantCategory
import aop.fastcampus.part6.chapter01.util.convertor.RoomTypeConverters
import kotlinx.parcelize.Parcelize

@Parcelize
@androidx.room.Entity
@TypeConverters(RoomTypeConverters::class)
data class FriendEntity(
    override val id: Long,
    val d: String,
    val fuid: String,
    val nickname: String,
    val age: String,
    val sex: String,
    val greetings: String,
    val imagepath: String,
    val lastdate: String
): Entity, Parcelable
