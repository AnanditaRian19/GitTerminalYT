package com.kotlin.gitterminalyt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("This is contained in my second commit")
        println("Local changes")
        println("Experimental")
        println("Changes 4")
        println("This line will be merge")
        println("Hello from your friend")
    }
}