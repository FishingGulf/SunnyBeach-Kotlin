package cn.android52.demo.paging.source

import androidx.paging.PagingSource
import androidx.paging.PagingState
import cn.android52.demo.http.network.DynamicNetwork
import cn.android52.demo.model.DynamicItem
import timber.log.Timber

/**
 *    author : A Lonely Cat
 *    github : https://github.com/anjiemo/SunnyBeach
 *    time   : 2022/01/21
 *    desc   : 动态 PagingSource
 */
class DynamicPagingSource(private val topicId: String) : PagingSource<Int, DynamicItem>() {

    override fun getRefreshKey(state: PagingState<Int, DynamicItem>): Int? {
        return null
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, DynamicItem> {
        return try {
            val page = params.key ?: FIRST_PAGE_INDEX
            Timber.d("load：===> page is $page")
            val response = DynamicNetwork.getDynamicList(topicId = topicId, page = page)
            val responseData = response.data
            val prevKey = if (responseData.hasPre) page - 1 else null
            val nextKey = if (responseData.hasNext) page + 1 else null
            if (response.success) LoadResult.Page(
                    data = responseData.list,
                    prevKey = prevKey,
                    nextKey = nextKey
            )
            else LoadResult.Error(RuntimeException())
        } catch (t: Throwable) {
            t.printStackTrace()
            LoadResult.Error(t)
        }
    }

    companion object {
        private const val FIRST_PAGE_INDEX = 1
    }
}