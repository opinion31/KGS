package aop.fastcampus.part6.chapter01.model.friend

import aop.fastcampus.part6.chapter01.data.entity.friend.FriendEntity
import aop.fastcampus.part6.chapter01.data.entity.restaurant.RestaurantEntity
import aop.fastcampus.part6.chapter01.model.CellType
import aop.fastcampus.part6.chapter01.model.Model
import aop.fastcampus.part6.chapter01.screen.home.restaurant.RestaurantCategory

data class FriendModel(
    override val id: Long,
    override val type: CellType = CellType.RESTAURANT_CELL,
    val d: String,
    val fuid: String,
    val nickname: String,
    val age: String,
    val sex: String,
    val greetings: String,
    val imagepath: String,
    val lastdate: String
) : Model(id, type) {

    fun toEntity() = FriendEntity(
        id,
        d,
        fuid,
        nickname,
        age,
        sex,
        greetings,
        imagepath,
        lastdate
    )

}
