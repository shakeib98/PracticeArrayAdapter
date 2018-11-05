package com.example.shakeib.arrayadapterpractice

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var arrayList = arrayListOf("1","2","3","4")

        var arrayAdapter = ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,arrayList)
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner.adapter = arrayAdapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
               T(arrayList[position])
            }
        }

        buttonAdd.setOnClickListener {
            if(editText.text.toString() != "") {
                T("elemet is nulll")
                arrayList.add(editText.text.toString())
                editText.text = null
            }
        }

        nextButton.setOnClickListener {
            var i = Intent(this,ListView::class.java)
            startActivity(i)
        }
    }

}

fun Context.T(msg:String){
    Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
}