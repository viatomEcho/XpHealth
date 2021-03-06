package com.lepucare.xphealth.mine.model

import android.os.Parcelable
import androidx.recyclerview.widget.DiffUtil
import kotlinx.android.parcel.Parcelize


@Parcelize
data class PokemonItemModel(
    var id: String = "",
    val name: String,
    val url: String
) : Parcelable {
    companion object {
        val diffCallback = object : DiffUtil.ItemCallback<PokemonItemModel>() {
            override fun areItemsTheSame(
                oldItem: PokemonItemModel,
                newItem: PokemonItemModel
            ): Boolean =
                oldItem.name == newItem.name

            override fun areContentsTheSame(
                oldItem: PokemonItemModel,
                newItem: PokemonItemModel
            ): Boolean =
                oldItem == newItem
        }
    }
}