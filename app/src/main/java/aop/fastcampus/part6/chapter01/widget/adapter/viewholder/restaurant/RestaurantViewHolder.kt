package aop.fastcampus.part6.chapter01.widget.adapter.viewholder.restaurant

import aop.fastcampus.part6.chapter01.R
import aop.fastcampus.part6.chapter01.databinding.ViewholderFriendBinding
import aop.fastcampus.part6.chapter01.databinding.ViewholderRestaurantBinding
import aop.fastcampus.part6.chapter01.model.restaurant.FriendModel
import aop.fastcampus.part6.chapter01.screen.base.BaseViewModel
import aop.fastcampus.part6.chapter01.util.provider.ResourcesProvider
import aop.fastcampus.part6.chapter01.widget.adapter.listener.AdapterListener
import aop.fastcampus.part6.chapter01.widget.adapter.listener.restaurant.RestaurantListListener
import aop.fastcampus.part6.chapter01.widget.adapter.viewholder.ModelViewHolder

class RestaurantViewHolder(
    private val binding: ViewholderFriendBinding,
    viewModel: BaseViewModel,
    resourcesProvider: ResourcesProvider
): ModelViewHolder<FriendModel>(binding, viewModel, resourcesProvider) {

    override fun reset() = with(binding) {
//        restaurantImage.clear()
    }

    override fun bindData(model: FriendModel) {
        super.bindData(model)
        with(binding) {
//            restaurantImage.load(model.restaurantImageUrl, 24f)
//            restaurantTitleText.text = model.restaurantTitle
//            gradeText.text = resourcesProvider.getString(R.string.grade_format, model.grade)
//            reviewCountText.text = resourcesProvider.getString(R.string.review_count, model.reviewCount)
//            val (minTime, maxTime) = model.deliveryTimeRange
//            deliveryTimeText.text = resourcesProvider.getString(R.string.delivery_time, minTime, maxTime)
//
//            val (minTip, maxTip) = model.deliveryTipRange
//            deliveryTipText.text = resourcesProvider.getString(R.string.delivery_tip, minTip, maxTip)
        }
    }

    override fun bindViews(model: FriendModel, adapterListener: AdapterListener) = with(binding) {
        if (adapterListener is RestaurantListListener) {
            root.setOnClickListener {
//                adapterListener.onClickItem(model)
            }
        }
    }

}
