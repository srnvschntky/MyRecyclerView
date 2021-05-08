//package com.example.myrecyclerview
//
//import android.content.Intent
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.Button
//import android.widget.EditText
//
//class Appending_Activity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_appending_)
//        var name =findViewById<EditText>(R.id.AppendName)
//        var phone = findViewById<EditText>(R.id.AppendMobile)
//        var address = findViewById<EditText>(R.id.AppendAddress)
//        var ok = findViewById<Button>(R.id.ok)
//        var key = intent.getIntExtra("key",0)
//
//
//        ok.setOnClickListener{
//
//            var nm = name.text.toString()
//            var ph = phone.text.toString()
//            var city = address.text.toString()
//
//
//
//            var intent = Intent(this,MainActivity::class.java)
//            intent.putExtra("name",nm)
//            intent.putExtra("phone",ph)
//            intent.putExtra("city",city)
//            intent.putExtra("key",key)
//            startActivity(intent)
//            finish()
//
//        }
//    }
//}