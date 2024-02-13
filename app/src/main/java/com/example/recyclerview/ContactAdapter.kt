package com.example.recyclerview

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(private val list: List<Contact>) :
    RecyclerView.Adapter<ContactAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view: View
        Log.d("op", viewType.toString())
        if (viewType % 2 == 0)
            view = LayoutInflater.from(parent.context)
                .inflate(R.layout.layout1, parent, false)
        else
            view = LayoutInflater.from(parent.context)
                .inflate(R.layout.layout2, parent, false)
        return ViewHolder(view, viewType)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun getItemViewType(position: Int): Int = position % 2
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contact = list[position]
        holder.imageView.setImageResource(contact.image)
        holder.textView.setText(contact.text)
    }

    class ViewHolder(ItemView: View, viewType: Int) : RecyclerView.ViewHolder(ItemView) {
        lateinit var imageView: ImageView
        lateinit var textView: TextView


        init {
            if (viewType % 2 == 0) {
                imageView = itemView.findViewById(R.id.imageview)
                textView = itemView.findViewById(R.id.textView)
            }
            else{
                imageView = itemView.findViewById(R.id.imageview1)
                textView = itemView.findViewById(R.id.textView1)
            }
        }
    }


}