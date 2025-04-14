package com.vharya.assignment5

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.vharya.assignment5.data.MataKuliah

class ClassListAdapter(
    private val context: Context,
    private val dataSource: ArrayList<MataKuliah>
): BaseAdapter() {
    override fun getCount(): Int {
        return dataSource.size;
    }

    override fun getItem(position: Int): Any {
        return dataSource.get(position)
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var itemView = convertView
        val currentMataKuliah = dataSource[position]

        if (convertView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)

            val iconView = itemView.findViewById<ImageView>(R.id.icon)
            val titleView = itemView.findViewById<TextView>(R.id.title)
            val descriptionView = itemView.findViewById<TextView>(R.id.description)

            Glide.with(context)
                .load(currentMataKuliah.icon)
                .centerInside()
                .into(iconView)

            titleView.text = currentMataKuliah.name

            if (currentMataKuliah.description.isBlank()) {
                descriptionView.text = "No Description"
            }
            else {
                descriptionView.text = currentMataKuliah.description
            }
        }

        return itemView!!
    }
}