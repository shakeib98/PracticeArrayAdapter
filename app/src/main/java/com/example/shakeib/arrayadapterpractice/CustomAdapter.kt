package com.example.shakeib.arrayadapterpractice

import android.content.Context
import android.os.TestLooperManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.TextView

class CustomAdapter(cont:Context,id:Int, var res:ArrayList<CustomMessage>):ArrayAdapter<CustomMessage>(cont,id,res) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
        var view = convertView
        if(convertView == null){
            view = LayoutInflater.from(context).inflate(R.layout.custom_view,parent,false)
        }

        var name = view?.findViewById<TextView>(R.id.nameTag)
        var msg = view?.findViewById<TextView>(R.id.msgTag)
        var time = view?.findViewById<TextView>(R.id.timeTag)

        name?.text = res[position].Name
        msg?.text = res[position].Message
        time?.text = res[position].time

        return view

    }
}