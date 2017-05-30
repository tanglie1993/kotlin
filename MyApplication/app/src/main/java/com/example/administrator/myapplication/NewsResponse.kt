package com.example.administrator.myapplication

/**
 * Created by Administrator on 2017/5/30 0030.
 */
class NewsResponse {

    var reason: String? = null
    var result: ResultEntity? = null
    var error_code: Int = 0

    class ResultEntity {

        var stat: String? = null
        var data: List<DataEntity>? = null

        class DataEntity {

            var uniquekey: String? = null
            var title: String? = null
            var date: String? = null
            var category: String? = null
            var author_name: String? = null
            var url: String? = null
            var thumbnail_pic_s: String? = null
            var thumbnail_pic_s02: String? = null
            var thumbnail_pic_s03: String? = null
        }
    }
}
