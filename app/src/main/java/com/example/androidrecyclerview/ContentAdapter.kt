package com.example.androidrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*
import java.util.jar.Attributes


class ContentAdapter(val mylist: List<ListItem>) : RecyclerView.Adapter<ContentAdapter.ContentView>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentView {
        return  ContentView(LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return mylist.size
    }

    override fun onBindViewHolder(holder: ContentView, position: Int) {
        val item = mylist[position]

        holder.itemview.headingTextView.text = item.head
        holder.itemview.contentTextView.text = item.desc
    }

    class ContentView(val itemview: View) : RecyclerView.ViewHolder(itemview)
}