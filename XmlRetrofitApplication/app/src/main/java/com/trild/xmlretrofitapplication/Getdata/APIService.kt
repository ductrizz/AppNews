package com.trild.xmlretrofitapplication.Getdata


import com.trild.xmlretrofitapplication.Model.RSSFeed
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


interface APIService {
    @GET("{detailName}")
    fun getRSSFeed(@Path("detailName") detailName : String?): Call<RSSFeed?>
   /* @GET("rss/tin-moi-nhat.rss")
    fun loadRSSFeed(): Call<RSSFeed?>*/
}
/*Xác định REST API cho Retrofit qua giao diện sau.*/