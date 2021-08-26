package com.example.birthdaycard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun CreateBirthdayCard(view: View) {
        val n = findViewById<EditText>(R.id.nameInput)
        val name = n.editableText.toString()
//        Toast.makeText(this,"Name is $name", Toast.LENGTH_SHORT).show()
        val intent = Intent(this,BirthdayGreetingActivity::class.java)
        Toast.makeText(this, "card created", Toast.LENGTH_SHORT).show()
        intent.putExtra("name_extra",name)
        startActivity(intent)
    }


}