package com.ceast.model

class Appointment {

    DateTime appDateTime 
    int appDuration 
    String roomNumber 

    String toString()
    {
        return RoomNumber
    }

    static belongTo = [Surgery: Surgery, Doctor: Doctor, Patient: Patient]
    static hasMany = [Nurse: Nurse]



    static constraints = {
        Appdatatime()
        AppDuration(min:15,max:60)
        RoomNumber()


    }
}
