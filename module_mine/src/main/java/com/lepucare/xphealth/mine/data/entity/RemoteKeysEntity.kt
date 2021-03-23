package com.lepucare.xphealth.mine.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
供 RemoteMediator 实现用来告知后端服务下一步要加载哪些数据。
在最简单的场景下，每一项分页数据都包含一个可供您轻松引用的远程键。
不过，如果远程键不与单个项对应，则必须单独存储它们，并通过 load() 方法管理它们。*
 */
@Entity
data class RemoteKeysEntity(
    @PrimaryKey
    val remoteName: String,
    val nextKey: Int?
)