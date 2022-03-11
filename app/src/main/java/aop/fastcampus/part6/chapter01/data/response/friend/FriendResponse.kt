package aop.fastcampus.part6.chapter01.data.response.friend

import aop.fastcampus.part6.chapter01.data.entity.friend.FriendEntity
import aop.fastcampus.part6.chapter01.data.entity.restaurant.RestaurantFoodEntity

data class FriendResponse(
    val id : Long,
    val d: String,
    val fuid: String,
    val nickname: String,
    val age: String,
    val sex: String,
    val greetings: String,
    val imagepath: String,
    val lastdate: String
) {

    fun toEntity() = FriendEntity(
        id = id,
        d = d,
        fuid = fuid,
        nickname = nickname,
        age = age,
        sex = sex,
        greetings = greetings,
        imagepath = imagepath,
        lastdate = lastdate
    )

}
