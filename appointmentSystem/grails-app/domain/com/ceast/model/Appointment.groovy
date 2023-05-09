package com.ceast.model

class Appointment {

    AppDateTime dateTime
    AppDuration int 
    RoomNumber string



    static constraints = {
        Class_()
        Appdatatime()
        AppDuration(min:15,max:60)
        RoomNumber()


    }
}
