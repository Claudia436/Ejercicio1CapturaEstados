package com.example.ejercicio1capturaestados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private var onCreate = 0
    private var onStart = 1
    private var onResume = 2
    private var onPause = 3
    private var onRestart = 4
    private var onStop = 5
    private var onDestroy = 6
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("onCreate $onCreate")
    }
    override fun onStart() {
        super.onStart()
        setContentView(R.layout.activity_main)
        println("onStart $onStart")
    }
    override fun onResume() {
        super.onResume()
        setContentView(R.layout.activity_main)
        println("onResume $onResume")
    }
    override fun onPause() {
        super.onPause()
        setContentView(R.layout.activity_main)
        println("onPause $onPause")
    }
    override fun onRestart() {
        super.onRestart()
        setContentView(R.layout.activity_main)
        println("onRestart $onRestart")
    }
    override fun onStop() {
        super.onStop()
        setContentView(R.layout.activity_main)
        println("onStop $onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        setContentView(R.layout.activity_main)
        println("onDestroy $onDestroy")
    }
}