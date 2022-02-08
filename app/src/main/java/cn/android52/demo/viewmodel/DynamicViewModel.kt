package cn.android52.demo.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import cn.android52.demo.model.DynamicItem
import cn.android52.demo.paging.source.DynamicPagingSource
import kotlinx.coroutines.flow.Flow

/**
 *    author : A Lonely Cat
 *    github : https://github.com/anjiemo/SunnyBeach
 *    time   : 2022/01/21
 *    desc   : 动态 ViewModel
 */
class DynamicViewModel : ViewModel() {

    fun getDynamicList(topicId: String): Flow<PagingData<DynamicItem>> {
        return Pager(config = PagingConfig(30),
                pagingSourceFactory = {
                    DynamicPagingSource(topicId)
                }).flow.cachedIn(viewModelScope)
    }
}