package com.example.administrator.myapplication

import android.net.sip.SipSession
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.ListView
import android.widget.TextView
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.gson.Gson

class Main2Activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val tx = findViewById(R.id.textView) as TextView
        tx.text = "ffdddhhhfff"
        Volley.newRequestQueue(this).add(StringRequest("http://v.juhe.cn/toutiao/index?type=&key=89e70bbc8b7bf349e28f6446f3e7a1fc", Response.Listener {
            var response = Gson().fromJson(it, NewsResponse::class.java)
            tx.text = response.reason
            var adapter = RecyclerAdapter<NewsResponse.ResultEntity.DataEntity>(response.result?.data, this)
            val list = findViewById(R.id.recyclerView) as RecyclerView
            list.layoutManager = LinearLayoutManager(this)
            list.adapter = adapter
        }, Response.ErrorListener {
            tx.text = "failure"
        }))
    }
}