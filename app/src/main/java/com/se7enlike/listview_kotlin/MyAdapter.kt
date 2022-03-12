package com.se7enlike.listview_kotlin

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import java.security.AccessControlContext

class MyAdapter(private val context:Activity, private val arrayList: ArrayList<User>): ArrayAdapter<User>(context,
                R.layout.list_item,arrayList ){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater: LayoutInflater = LayoutInflater.from(context)
        val view: View = inflater.inflate(R.layout.list_item, null)

        val imageView: ImageView = view.findViewById(R.id.imageView)
        val numPeople: TextView = view.findViewById(R.id.num_people)
        val area: TextView = view.findViewById(R.id.area)
        val channel: TextView = view.findViewById(R.id.channel)

        imageView.setImageResource(arrayList[position].imageId)
        numPeople.text = arrayList[position].numPeople
        area.text = arrayList[position].area
        channel.text = arrayList[position].channel

        return view
    }
}