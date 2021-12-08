package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.logging.LogManager

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(
            TAG, "Уж небо осенью дышало\n" +
                    "Уж реже солнышко блистало,"
        )

    }

    override fun onStart() {
        super.onStart()
        Log.d(
            TAG, "Короче становился день,\n" +
                    "Лесов таинственная сень"
        )
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "С печальным шумом обнажалась,")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Ложился на поля туман,")
    }

    override fun onStop() {
        super.onStop()
        Log.d(
            TAG, "Гусей крикливых караван\n +" +
                    "Тянулся к югу: приближалась"
        )
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "Довольно скучная пора;")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Стоял ноябрь уж у двора.")
    }
}