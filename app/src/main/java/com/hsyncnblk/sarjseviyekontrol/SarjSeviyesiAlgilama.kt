package com.hsyncnblk.sarjseviyekontrol

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class SarjSeviyesiAlgilama : BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent?) {
        Toast.makeText(p0,"şarjınız bitmek üzere",Toast.LENGTH_SHORT).show()

    }
}