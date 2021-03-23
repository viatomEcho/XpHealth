package com.lepucare.xphealth.mine.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.paging.PagingDataAdapter
import com.hi.dhl.jdatabinding.DataBindingViewHolder
import com.hi.dhl.jdatabinding.dowithTry
import com.lepucare.xphealth.mine.R
import com.lepucare.xphealth.mine.databinding.MineRecycleItemPokemonBinding
import com.lepucare.xphealth.mine.model.PokemonItemModel

class PokemonAdapter :
    PagingDataAdapter<PokemonItemModel, PokemonViewModel>(PokemonItemModel.diffCallback) {

    override fun onBindViewHolder(holder: PokemonViewModel, position: Int) {
        dowithTry {
            val data = getItem(position)
            data?.let {
                holder.bindData(data, position)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewModel {
        val view = inflateView(parent, R.layout.mine_recycle_item_pokemon)
        return PokemonViewModel(view)
    }

    private fun inflateView(viewGroup: ViewGroup, @LayoutRes viewType: Int): View {
        val layoutInflater = LayoutInflater.from(viewGroup.context)
        return layoutInflater.inflate(viewType, viewGroup, false)
    }
}

class PokemonViewModel(view: View) : DataBindingViewHolder<PokemonItemModel>(view) {
    private val mBinding: MineRecycleItemPokemonBinding by viewHolderBinding(view)

    override fun bindData(data: PokemonItemModel, position: Int) {
        mBinding.apply {
            data.id = "#${position + 1}"
            pokemon = data
            executePendingBindings()
        }
    }

}