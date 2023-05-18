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

    static belongTo = [surgery: Surgery]
    static hasMany = [prescription: Prescription, appointment: Appointment]

    
    

    static constraints = {
        doctorName()
        qualification()
        position()
        doctorEmail()
        password()
        doctorPhone()
        bio()
    }
}
