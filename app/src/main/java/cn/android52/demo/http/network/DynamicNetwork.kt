package cn.android52.demo.http.network

import cn.android52.demo.http.ServiceCreator
import cn.android52.demo.http.api.DynamicApi

object DynamicNetwork {

    private val api = ServiceCreator.create<DynamicApi>()

    suspend fun getDynamicList(topicId: String, page: Int) = api.getDynamicList(topicId, page)

}