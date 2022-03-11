package aop.fastcampus.part6.chapter01.data.repository.friend

import aop.fastcampus.part6.chapter01.data.entity.friend.FriendEntity

interface FriendRepository {
    suspend fun getAroundFriend(lat: Long, lon: Long): List<FriendEntity>

}
