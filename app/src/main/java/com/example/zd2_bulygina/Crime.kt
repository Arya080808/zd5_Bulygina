package com.example.zd2_bulygina

import android.provider.ContactsContract
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*
import  java.util.Date

@Entity
data class Crime (@PrimaryKey var id: UUID = UUID.randomUUID()){
    var title:String =""
    var date: Date=Date()
    var dt: Date = Date();
    var isSolved: Boolean= false
    //var requiresPolice: Int?=0
    constructor(id: UUID, title: String, date: Date, isSolved: Boolean, requiresPolice:Int):this(id){
        this.title=title
        this.date=date
        this.id=id
        this.isSolved=isSolved
        //this.requiresPolice=requiresPolice
    }
}