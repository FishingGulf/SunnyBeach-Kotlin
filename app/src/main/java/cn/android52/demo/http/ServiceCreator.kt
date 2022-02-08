package cn.android52.demo.http

import cn.android52.demo.other.SUNNYBEACH_BASE_API_URL
import com.hjq.gson.factory.GsonFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * author : A Lonely Cat
 * github : https://github.com/anjiemo/SunnyBeach
 * time   : 2021/10/02
 * desc   : 网络请求服务创建者
 */
object ServiceCreator {

    private val gson = GsonFactory.getSingletonGson()
            .newBuilder()
            .setDateFormat("yyyy-MM-dd HH:mm:ss")
            .create()

    private val client by lazy {
        OkHttpClient.Builder()
                .addInterceptor(HttpLoggingInterceptor(HttpLoggingInterceptor.Logger.DEFAULT).apply {
                    level = HttpLoggingInterceptor.Level.BODY
                })
                .build()
    }

    val retrofit: Retrofit by lazy {
        Retrofit.Builder()
                .baseUrl(SUNNYBEACH_BASE_API_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(client)
                .build()
    }

    inline fun <reified T> create(): T = retrofit.create(T::class.java)
}