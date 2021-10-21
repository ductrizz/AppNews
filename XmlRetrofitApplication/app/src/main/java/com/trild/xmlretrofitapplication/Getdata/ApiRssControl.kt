package com.trild.xmlretrofitapplication.Getdata

import android.os.Build
import android.util.Log
import com.trild.xmlretrofitapplication.Model.Article
import com.trild.xmlretrofitapplication.Model.RSSFeed
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.simplexml.SimpleXmlConverterFactory
import java.util.function.Consumer

class ApiRssControl : APIRepository, Callback<RSSFeed?> {
    private var apiService : APIService? = null

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://vnexpress.net/")
            .client(getOkHttp())
            .addConverterFactory(SimpleXmlConverterFactory.create())
            .build()
        apiService = retrofit.create(APIService::class.java)
   /*     val call: Call<RSSFeed?> = APIService.loadRSSFeed()
        call.enqueue(this)*/
    }

    private fun getOkHttp(): OkHttpClient {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level =  HttpLoggingInterceptor.Level.BODY
        val builder = OkHttpClient.Builder()
        builder.addInterceptor(interceptor)
        val OkHttpClient = builder.build()
        return OkHttpClient
    }
    override suspend fun getRSSFeedDetail(detailName: String): Call<RSSFeed?> {
        val apiRequest = apiService?.getRSSFeed(detailName = detailName)!!
        val call: Call<RSSFeed?> = apiService!!.getRSSFeed(detailName = detailName)
        call.enqueue(this)
        return apiRequest
    }

    override fun onResponse(call: Call<RSSFeed?>, response: Response<RSSFeed?>) {
            val rss: RSSFeed = response.body()!!
            println("Channel title: " + rss.channelTitle)
            Log.e("Channel title: ", "" + rss.channelTitle)
    }

    override fun onFailure(call: Call<RSSFeed?>, t: Throwable) {
        Log.e("Error",""+t.message)
    }
}