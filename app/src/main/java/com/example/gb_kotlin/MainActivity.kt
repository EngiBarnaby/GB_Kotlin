package com.example.gb_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myBtn = findViewById<Button>(R.id.my_btn)
        myBtn.setOnClickListener( object : View.OnClickListener{
            override fun onClick(p0: View?) {
                Log.d("Button", "Button has clicked!")
            }

        })

        val test = TestClass("title", 1)
        Log.d("TestClass", "${test.title}, ${test.id}, ${test.testField}")

        ClassObject.printObjectField()

        val data1 = DataClass("Tile", 1)
        val data2 = data1.copy()
        Log.d("DataClass", "$data2")

        val listOfString = listOf("String 1", "String 2", "String 3", "String 4")

        Log.d("list", "--------------")
        listOfString.forEach {
            Log.d("list", "$it")
        }
        Log.d("list", "--------------")
        repeat(listOfString.size){
            Log.d("list", "${listOfString[it]}")
        }
        Log.d("list", "--------------")
        for(i in listOfString){
            Log.d("list", "$i")
        }
        Log.d("list", "--------------")
        for(i in listOfString.size -1  downTo 0){
            Log.d("list", "${listOfString[i]}")
        }

    }
}

data class DataClass(val title : String, val id : Int)

class TestClass(val title : String,val id : Int){
    var testField = "Test"
    get(){
        return "$field get"
    }
    set(value){
        field = "$value set"
    }
}

object ClassObject {
    val objectField = "Test object field"

    fun printObjectField(){
        Log.d("Object", "$objectField")
    }
}