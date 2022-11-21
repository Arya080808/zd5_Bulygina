package com.example.zd2_bulygina

import android.app.Application

class CriminalIntentApplication : Application() {
    override fun onCreate(){
        super.onCreate()
        CrimeRepository.initialize(this)
    }
}