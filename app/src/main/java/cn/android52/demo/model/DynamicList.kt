package cn.android52.demo.model

import com.google.gson.annotations.SerializedName

/**
 *    author : A Lonely Cat
 *    github : https://github.com/anjiemo/SunnyBeach
 *    time   : 2022/01/21
 *    desc   : 动态
 */
data class DynamicItem(
        @SerializedName("avatar")
        val avatar: String,
        @SerializedName("commentCount")
        val commentCount: Int,
        @SerializedName("company")
        val company: String,
        @SerializedName("content")
        val content: String,
        @SerializedName("createTime")
        val createTime: String,
        @SerializedName("hasThumbUp")
        val hasThumbUp: Boolean,
        @SerializedName("id")
        val id: String,
        @SerializedName("images")
        val images: List<Any>,
        @SerializedName("linkCover")
        val linkCover: String,
        @SerializedName("linkTitle")
        val linkTitle: String,
        @SerializedName("linkUrl")
        val linkUrl: String,
        @SerializedName("nickname")
        val nickname: String,
        @SerializedName("position")
        val position: String,
        @SerializedName("thumbUpCount")
        val thumbUpCount: Int,
        @SerializedName("thumbUpList")
        val thumbUpList: List<String>,
        @SerializedName("topicId")
        val topicId: String,
        @SerializedName("topicName")
        val topicName: String,
        @SerializedName("userId")
        val userId: String,
        @SerializedName("vip")
        val vip: Boolean
)