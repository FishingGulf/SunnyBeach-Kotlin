package cn.android52.demo.model

import com.google.gson.annotations.SerializedName

/**
 *    author : A Lonely Cat
 *    github : https://github.com/anjiemo/SunnyBeach
 *    time   : 2022/01/21
 *    desc   : 阳光沙滩 api 接口通用返回格式
 */
data class ApiResponse<T>(@SerializedName("code")
                          val code: Int,
                          @SerializedName("data")
                          val `data`: T,
                          @SerializedName("message")
                          val message: String,
                          @SerializedName("success")
                          val success: Boolean) {
}