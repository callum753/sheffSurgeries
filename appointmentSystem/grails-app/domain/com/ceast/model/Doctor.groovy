package com.ceast.model

class Doctor {
    String doctorName
    String qualification
    String position 
    String doctorEmail
    String password
    String doctorPhone
    String bio

    String toString()
    {
        return doctorName
    }

    static belongTo = [Surgery: Surgery]
    static hasMany = [prescription: Prescription, appointment: Appointment]

    
    

    static constraints = {
        doctorName()
        qualificaions()
        position()
        doctorEmail()
        password()
        doctorPhone()
        bio()
    }
}
