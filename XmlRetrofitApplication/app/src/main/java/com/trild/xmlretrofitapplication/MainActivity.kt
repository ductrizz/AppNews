package com.trild.xmlretrofitapplication

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.trild.xmlretrofitapplication.Getdata.ApiRssControl
import com.trild.xmlretrofitapplication.Getdata.ControllerAPI
import com.trild.xmlretrofitapplication.Model.RSSFeed
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
   /*     val ctrl = ControllerAPI()
        ctrl.start()*/
        val btnEnter = findViewById<Button>(R.id.buttonEnter)
        btnEnter.setOnClickListener {
            CoroutineScope(Dispatchers.IO).launch {
                val rssFeed = ApiRssControl().getRSSFeedDetail(detailName = "rss/tin-moi-nhat.rss")
                Log.e("Channell" , "")
                CoroutineScope(Dispatchers.Main).launch {
                }
            }
        }
    }

}
