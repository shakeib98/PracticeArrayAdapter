package com.example.shakeib.arrayadapterpractice

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_list_view.*

class ListView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        var arrayList = arrayListOf("Shakeib","abc","Hahahah","Shakeib","abc","Hahahah","Shakeib","abc","Hahahah","Shakeib","abc","Hahahah","Shakeib","abc","Hahahah")

        var arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList)

        listView.adapter = arrayAdapter

        customButton.setOnClickListener {
            var i = Intent(this,CutomAdapterView::class.java)
            startActivity(i)
        }
    }
}
