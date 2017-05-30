package com.example.administrator.myapplication

import com.google.gson.Gson

/**
 * Created by Administrator on 2017/5/30 0030.
 */
class gfg {

    private fun dfdd(content: String) {
        Gson().fromJson(content, NewsResponse::class.java)
    }
}
