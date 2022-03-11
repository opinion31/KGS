package aop.fastcampus.part6.chapter01.data.repository.friend

import aop.fastcampus.part6.chapter01.data.entity.friend.FriendEntity
import aop.fastcampus.part6.chapter01.data.entity.restaurant.RestaurantFoodEntity
import aop.fastcampus.part6.chapter01.data.network.FoodApiService
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

class DefaultFriendRepository(
    private val foodApiService: FoodApiService,
    private val ioDispatcher: CoroutineDispatcher
): FriendRepository {

    override suspend fun getAroundFriend(lat: Long, lon: Long): List<FriendEntity> = withContext(ioDispatcher){
        val response = foodApiService.getAroubdFriends(lat,lon)
        if (response.isSuccessful) {
            response.body()?.map { it.toEntity() } ?: listOf()
        } else {
            listOf()
        }
    }

}
