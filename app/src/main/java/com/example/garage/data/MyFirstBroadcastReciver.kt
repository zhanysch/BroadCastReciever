package com.example.garage.data

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class MyFirstBroadcastReciver : BroadcastReceiver() {  //для BroadCastRecie er
    override fun onReceive(p0: Context?, p1: Intent?) {
        Log.d("fsfsdfsdf","blabla")
    }
}