package com.example.zd2_bulygina

import androidx.lifecycle.ViewModel

class CrimeListViewModel : ViewModel() {
    /*val crimes= mutableListOf<Crime>()
    var i:Int=1
    val dateN = Date()
    init{
        while (i<=100){
            val criminal=Crime()
            criminal.title="Crime #$i"
            criminal.date=dateN
            criminal.isSolved=i%2==0
            crimes.add(criminal)
            i++
        }
    }*/
    private val crimeRepository=CrimeRepository.get()
    val crimeListLiveData=crimeRepository.getCrimes()
}
