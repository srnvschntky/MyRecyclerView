package com.example.myrecyclerview

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager

import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.activity_appending_.view.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.card_items.view.*
import java.sql.Array

class MainActivity : AppCompatActivity() {


    var count:Int =0

    var list = ArrayList<CardList>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val addButton = findViewById<FloatingActionButton>(R.id.floatingActionButton)

       //
//
//        count = intent.getIntExtra("key",0)
//        if(count<si) {
//
//                    var name = intent.getStringExtra("name")
//                    var phone = intent.getStringExtra("phone")
//                    var address = intent.getStringExtra("city")
//                        var nm=name.toString()
//        var ph=phone.toString()
//        var city=address.toString()
//                    fun bind() {
//                        var obj= Array() { CardList(nm, ph, city) }
//                        list.add(obj[i])
//                    }
//        list.addAll(bind())


        var obj = Array(10){CardList()}





        var grid = GridLayoutManager(applicationContext,3,LinearLayoutManager.HORIZONTAL,false)
        recyclerView.layoutManager = grid
        recyclerView.setHasFixedSize(true)

        var adapter = MyAdapter(list)
        adapter.notifyDataSetChanged()
        recyclerView.adapter = adapter

//        swipeRefresh.setOnRefreshListener{
//
//            list.addAll(listOf(obj[count]))
//
//        }
        addButton.setOnClickListener{

            val diaView = LayoutInflater.from(this).inflate(R.layout.activity_appending_,null)
            val dia_builder = AlertDialog.Builder(this).setView(diaView).setTitle("Details")
            val diaAlert = dia_builder.show()
            diaView.ok.setOnClickListener{
                diaAlert.dismiss()
                if(count<10) {
                obj[count].name = diaView.AppendName.text.toString()
                obj[count].phone = diaView.AppendMobile.text.toString()
                obj[count].address = diaView.AppendAddress.text.toString()
                    list.add(obj[count])
                    count++
                }

            }
            diaView.cancel.setOnClickListener{
                diaAlert.dismiss()
            }



//
//            count+=1
//            var intent = Intent(this,Appending_Activity::class.java)
//            intent.putExtra("key",count)
//            startActivity(intent)
//            finish()
        }

    }

}