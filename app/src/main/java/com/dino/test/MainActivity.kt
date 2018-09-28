package com.dino.test

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("MainActivity",Utils.formatString2Json("20-2,21-0,22-0,23-6"))
        Log.e("MainActivity",Utils.splitTime().toString())
//        Utils.overlapping()
        Utils.method3()
    }
}
