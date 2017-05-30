package com.example.administrator.myapplication

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

/**
 * Created by Administrator on 2017/5/30 0030.
 */
public class RecyclerAdapter(val data: List<NewsResponse.ResultEntity.DataEntity>?, val context: Context?) : RecyclerView.Adapter<ViewHolder>() {
    override fun getItemCount(): Int {
        return data?.size ?: 0
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder? {
        var view = LayoutInflater.from(context).inflate(R.layout.list_item_layout, null);
        var holder = ViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        var data : NewsResponse.ResultEntity.DataEntity = data?.get(position) ?: NewsResponse.ResultEntity.DataEntity()
        holder!!.titleTextView.text = data.title
        Glide.with(context)
                .load(data.thumbnail_pic_s)
                .into(holder.imageView);
        holder.imageView.setOnClickListener {
            context?.startActivity(Intent(context, WebViewActivity::class.java))
        }
    }

}

public class ViewHolder : RecyclerView.ViewHolder {

    var titleTextView: TextView
    var imageView: ImageView

    constructor(itemView: View?) : super(itemView){
        titleTextView = itemView!!.findViewById(R.id.title) as TextView
        imageView = itemView.findViewById(R.id.imageView) as ImageView
    }
}