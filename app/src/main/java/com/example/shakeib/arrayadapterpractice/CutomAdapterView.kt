package com.example.shakeib.arrayadapterpractice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_cutom_adapter_view.*
import kotlinx.android.synthetic.main.activity_list_view.*

class CutomAdapterView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cutom_adapter_view)

        var arrayList = ArrayList<CustomMessage>()
        arrayList.add(CustomMessage("Shakeib","Hi","00:00"))
        arrayList.add(CustomMessage("Shakeib","Hi","00:00"))
        arrayList.add(CustomMessage("Shakeib","Hi","00:00"))
        arrayList.add(CustomMessage("Shakeib","Hi","00:00"))
        arrayList.add(CustomMessage("Shakeib","Hi","00:00"))
        arrayList.add(CustomMessage("Shakeib","Hi","00:00"))
        arrayList.add(CustomMessage("Shakeib","Hi","00:00"))
        arrayList.add(CustomMessage("Shakeib","Hi","00:00"))
        arrayList.add(CustomMessage("Shakeib","Hi","00:00"))
        arrayList.add(CustomMessage("Shakeib","Hi","00:00"))
        arrayList.add(CustomMessage("Shakeib","Hi","00:00"))
        arrayList.add(CustomMessage("Shakeib","Hi","00:00"))
        arrayList.add(CustomMessage("Shakeib","Hi","00:00"))
        arrayList.add(CustomMessage("Shakeib","Hi","00:00"))
        arrayList.add(CustomMessage("Shakeib","Hi","00:00"))
        arrayList.add(CustomMessage("Shakeib","Hi","00:00"))
        arrayList.add(CustomMessage("Shakeib","Hi","00:00"))

        var custArrayAdapter = CustomAdapter(this,R.layout.custom_view,arrayList)

        listViewCustom.adapter = custArrayAdapter

    }
}
