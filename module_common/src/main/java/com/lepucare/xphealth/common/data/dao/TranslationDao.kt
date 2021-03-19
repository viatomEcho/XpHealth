package com.lepucare.xphealth.common.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.lepucare.xphealth.common.data.bean.Translation
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.distinctUntilChanged

@Dao
interface TranslationDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTranslation(translation: Translation)

    @Query("SELECT * FROM Translation")
    fun loadAll(): LiveData<List<Translation>>//  Flow::只要表中的任何数据发生变化，返回的 Flow 对象就会再次触发查询并重新发出整个结果集。


    /**
     * 确保仅在实际查询结果发生更改时通知界面：
     * @return Flow<List<Device>>
     */
//     fun loadAllTranslationDUC() =
//            loadAll().distinctUntilChanged()


}