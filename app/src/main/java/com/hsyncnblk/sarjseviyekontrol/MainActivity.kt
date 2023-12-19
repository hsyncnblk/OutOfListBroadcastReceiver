package com.hsyncnblk.sarjseviyekontrol

import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var sarjSeviyesiAlgilama: SarjSeviyesiAlgilama
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // android liste dışı uygulama örneği

        sarjSeviyesiAlgilama= SarjSeviyesiAlgilama()


    }

    override fun onResume() {
        super.onResume()
        val filter = IntentFilter()
        filter.addAction("android.intent.action.BATTERY_LOW")
        registerReceiver(sarjSeviyesiAlgilama,filter)

    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(sarjSeviyesiAlgilama)

    }
}