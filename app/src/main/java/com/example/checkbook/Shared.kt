package com.example.checkbook

import android.content.Context
import android.content.SharedPreferences

class Shared {
    companion object

    fun setValue(context: Context,value:Int){
        val sharedPreferences:SharedPreferences = context.getSharedPreferences("test",Context.MODE_PRIVATE)
        val editor:SharedPreferences.Editor = sharedPreferences.edit()
        editor.putInt("saveText",value)
        editor.apply()

    }
    fun getValue(context: Context): Int? {
        val sharedPreferences:SharedPreferences = context.getSharedPreferences("test",Context.MODE_PRIVATE)
        return sharedPreferences.getInt("saveText", 0)

    }
}