package aop.fastcampus.part6.chapter01.data.network

import aop.fastcampus.part6.chapter01.data.response.friend.FriendResponse
import aop.fastcampus.part6.chapter01.data.response.friend.FrindResponseResponse
import aop.fastcampus.part6.chapter01.data.response.restaurant.RestaurantFoodResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface FoodApiService {

    @GET("test.php")
    suspend fun getRestaurantFoods(
        @Query("restaurantId") restaurantId: Long
    ): Response<List<RestaurantFoodResponse>>
    @GET("friend_an.php")
    suspend fun getAroubdFriends(
        @Query("lat") lat:Long,
        @Query("lon") lon:Long,
    ): Response<List<FriendResponse>>
}
