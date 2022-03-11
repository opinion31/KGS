package aop.fastcampus.part6.chapter01.widget.adapter.listener.restaurant

import aop.fastcampus.part6.chapter01.model.restaurant.FriendModel
import aop.fastcampus.part6.chapter01.widget.adapter.listener.AdapterListener

interface RestaurantListListener: AdapterListener {

    fun onClickItem(model: aop.fastcampus.part6.chapter01.model.friend.FriendModel)

}
