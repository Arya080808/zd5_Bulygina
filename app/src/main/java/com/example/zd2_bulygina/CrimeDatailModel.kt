package com.example.zd2_bulygina

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import java.util.*

class CrimeDatailModel(): ViewModel() {
    private val crimeRepository=CrimeRepository.get()
    private val crimeIdLiveData= MutableLiveData<UUID>()
    /*var crimeLiveData: LiveData<Crime?>=Transformations.switchMap(crimeIdLiveData){
        crimeId -> crimeRepository.getCrime(crimeId)
    }
    fun loadCrime(crimeId: UUID){
        crimeIdLiveData.value=crimeId
    }
    fun saveCrime(crime: Crime){
        crimeRepository.updateCrime(crime)
    }*/
    var crimeLiveData: LiveData<Crime?> =
        Transformations.switchMap(crimeIdLiveData){
            crimeRepository.getCrime(it)
        }

    fun loadCrime(crimeId: UUID) {
        crimeIdLiveData.value = crimeId
    }

    fun saveCrime(crime: Crime) {
        crimeRepository.updateCrime(crime)
    }
}