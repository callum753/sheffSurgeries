package com.ceast.model

class Appointment {

    Date appDateTime 
    int appDuration 
    String roomNumber 

    String toString()
    {
        return RoomNumber
    }

    static belongTo = [surgery: Surgery, doctor: Doctor, patient: Patient]
    static hasMany = [nurses:Nurse]
    



    static constraints = {
        Appdatatime()
        AppDuration(min:15,max:60)
        RoomNumber()


    }
}
