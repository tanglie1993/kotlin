package com.example.administrator.myapplication

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.util.SparseArray
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by Administrator on 2017/5/30 0030.
 */
public class RecyclerAdapter<T>(val data: List<T>?, val context: Context?) : RecyclerView.Adapter<BaseViewHolder>() {
    override fun getItemCount(): Int {
        return data?.size ?: 0
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): BaseViewHolder? {
        var view = getViewResource(viewType)
        var holder = BaseViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: BaseViewHolder?, position: Int) {

    }

    /**
     * 添加item布局
     */
    fun getViewResource(viewType: Int): View{
        return LayoutInflater.from(context).inflate(R.layout.list_item_layout, null);
    }

}

public class BaseViewHolder : RecyclerView.ViewHolder {

    constructor(itemView: View?) : super(itemView){
        var textView = itemView!!.findViewById(R.id.textView) as TextView
        textView.text = "sssss"
    }
}