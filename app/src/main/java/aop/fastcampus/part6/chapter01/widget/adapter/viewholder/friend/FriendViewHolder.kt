package aop.fastcampus.part6.chapter01.widget.adapter.viewholder.friend

import aop.fastcampus.part6.chapter01.databinding.ViewholderFriendBinding
import aop.fastcampus.part6.chapter01.extensions.clear
import aop.fastcampus.part6.chapter01.extensions.load
import aop.fastcampus.part6.chapter01.model.friend.FriendModel
import aop.fastcampus.part6.chapter01.screen.base.BaseViewModel
import aop.fastcampus.part6.chapter01.util.provider.ResourcesProvider
import aop.fastcampus.part6.chapter01.widget.adapter.listener.AdapterListener
import aop.fastcampus.part6.chapter01.widget.adapter.listener.restaurant.RestaurantListListener
import aop.fastcampus.part6.chapter01.widget.adapter.viewholder.ModelViewHolder

class FriendViewHolder(
    private val binding: ViewholderFriendBinding,
    viewModel: BaseViewModel,
    resourcesProvider: ResourcesProvider
): ModelViewHolder<FriendModel>(binding, viewModel, resourcesProvider) {

    override fun reset() = with(binding) {
        ImagePath.clear()
    }

    override fun bindData(model: FriendModel) {
        super.bindData(model)
        with(binding) {
            ImagePath.load(model.imagepath, 24f)
            nickname.text = model.nickname
            lastdate.text = model.lastdate
            age.text = model.age
            sex.text = model.sex
            greeting.text = model.greetings

        }
    }

    override fun bindViews(model: FriendModel, adapterListener: AdapterListener) = with(binding) {
        if (adapterListener is RestaurantListListener) {
            root.setOnClickListener {
                adapterListener.onClickItem(model)
            }
        }
    }

}
