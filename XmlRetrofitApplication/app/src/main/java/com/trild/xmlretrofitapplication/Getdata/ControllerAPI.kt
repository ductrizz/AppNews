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
import retrofit2.converter.simplexml.SimpleXmlConverterFactory
import java.util.function.Consumer

/*bỏ*/
class ControllerAPI { /*Callback<RSSFeed?>*/
  /*  val call : Call<RSSFeed>? = null
     fun start() {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://vnexpress.net/")
            .client(getOkHttp())
            .addConverterFactory(SimpleXmlConverterFactory.create()).build()
        val APIService: APIService = retrofit.create(APIService::class.java)
        val call: Call<RSSFeed?> = APIService.loadRSSFeed()
        call.enqueue(this)
    }
    private fun getOkHttp(): OkHttpClient {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level =  HttpLoggingInterceptor.Level.BODY
        val builder = OkHttpClient.Builder()
        builder.addInterceptor(interceptor)
        val OkHttpClient = builder.build()
        return OkHttpClient
    }

    override fun onResponse(call: Call<RSSFeed?>?, response: Response<RSSFeed?>) {
        if (response.isSuccessful()) {
            val rss: RSSFeed = response.body()!!
            println("Channel title: " + rss.channelTitle)
            Log.e("Channel title: ", "" + rss.channelTitle)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                rss.articleList!!.forEach(
                    Consumer { article: Article -> println("Title: " + article.title + " Link: " + article.link) })
            }
        } else {
            System.out.println(response.errorBody())
        }
    }
    fun getModelDetailAPI(returnUser: (RSSFeed?) -> Unit) {
        val rssAPI = call?.enqueue(this)
    }

    override fun onFailure(call: Call<RSSFeed?>?, t: Throwable) {
        t.printStackTrace()
    }*/
}