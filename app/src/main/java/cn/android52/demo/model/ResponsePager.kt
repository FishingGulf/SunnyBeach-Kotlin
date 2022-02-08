package cn.android52.demo.model

import com.google.gson.annotations.SerializedName

data class ResponsePager<out T>(
        @SerializedName("currentPage")
        val currentPage: Int,
        @SerializedName("hasNext")
        val hasNext: Boolean,
        @SerializedName("hasPre")
        val hasPre: Boolean,
        @SerializedName("list")
        val list: List<T>,
        @SerializedName("pageSize")
        val pageSize: Int,
        @SerializedName("total")
        val total: Int,
        @SerializedName("totalPage")
        val totalPage: Int
)