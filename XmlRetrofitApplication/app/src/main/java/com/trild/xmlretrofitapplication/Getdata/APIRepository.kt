package com.trild.xmlretrofitapplication.Getdata

import android.telecom.Call
import com.trild.xmlretrofitapplication.Model.RSSFeed

interface APIRepository {
    suspend fun getRSSFeedDetail(detailName : String): retrofit2.Call<RSSFeed?>
}