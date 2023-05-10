package com.ceast.model

class Appointment {

    DateTime AppDateTime 
    Int AppDuration 
    String RoomNumber 

    String toString()
    {
        return RoomNumber
    }

    static belongTo



    static constraints = {
        Appdatatime()
        AppDuration(min:15,max:60)
        RoomNumber()


    }
}
