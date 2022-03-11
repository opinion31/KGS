package aop.fastcampus.part6.chapter01.screen.home.restaurant

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import aop.fastcampus.part6.chapter01.data.entity.locaion.LocationLatLngEntity
import aop.fastcampus.part6.chapter01.data.repository.friend.FriendRepository
import aop.fastcampus.part6.chapter01.model.friend.FriendModel
import aop.fastcampus.part6.chapter01.screen.base.BaseViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class RestaurantListViewModel(
    private var locationLatLngEntity: LocationLatLngEntity,
    private val friendRepository: FriendRepository,
    private var restaurantFilterOrder: RestautantFilterOrder = RestautantFilterOrder.DEFAULT
) : BaseViewModel() {

    private var _restaurantListLiveData = MutableLiveData<List<FriendModel>>()
    val restaurantListLiveData: LiveData<List<FriendModel>>
        get() = _restaurantListLiveData

    override fun fetchData(): Job = viewModelScope.launch {
        val restaurantList = friendRepository.getAroundFriend(locationLatLngEntity.latitude.toLong(),locationLatLngEntity.longitude.toLong())
        val sortedList = when (restaurantFilterOrder) {
            RestautantFilterOrder.DEFAULT -> {
                restaurantList
            }
            RestautantFilterOrder.LOW_DELIVERY_TIP -> {
                restaurantList
            }
            RestautantFilterOrder.FAST_DELIVERY -> {
                restaurantList
            }
            RestautantFilterOrder.TOP_RATE -> {
                restaurantList
            }
        }
        _restaurantListLiveData.value = sortedList.map {
            FriendModel(
                id = it.id,
                d = it.d,
                fuid = it.fuid,
                nickname = it.nickname,
                age = it.age,
                sex = it.sex,
                greetings = it.greetings,
                imagepath = it.imagepath,
                lastdate = it.lastdate
            )
        }
    }

    fun setLocationLatLng(locationLatLngEntity: LocationLatLngEntity) {
        this.locationLatLngEntity = locationLatLngEntity
        fetchData()
    }

    fun setRestaurantFilterOrder(order: RestautantFilterOrder) {
        this.restaurantFilterOrder = order
        fetchData()
    }

}
