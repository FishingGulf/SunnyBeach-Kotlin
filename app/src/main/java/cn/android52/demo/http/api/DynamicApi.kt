package cn.android52.demo.http.api

import cn.android52.demo.model.ApiResponse
import cn.android52.demo.model.DynamicItem
import cn.android52.demo.model.ResponsePager
import retrofit2.http.GET
import retrofit2.http.Path

interface DynamicApi {

    @GET("ct/moyu/list/{topicId}/{page}")
    suspend fun getDynamicList(@Path("topicId") topicId: String, @Path("page") page: Int): ApiResponse<ResponsePager<DynamicItem>>
}