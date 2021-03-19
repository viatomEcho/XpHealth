package com.lepucare.xphealth.common.data.bean

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Translation(
        val from: String,
        val to: String,
       @Embedded val trans_result: List<TransResult>
    ){
        @PrimaryKey(autoGenerate = true)
        var id: Long = 0

}
data class TransResult(
        val dst: String,
        val src: String
)
