package aop.fastcampus.part6.chapter01.widget.adapter.listener.restaurant

import aop.fastcampus.part6.chapter01.model.restaurant.FriendModel

interface RestaurantLikeListListener: RestaurantListListener {

    fun onDislikeItem(model: FriendModel)

}
