package com.ceast.model

class Patient {
    String patientName
    String patientAddress 
    String patientResidence
    Date patientDob
    String patientID
    Date dateRegisted 
    int patientPhone 

     String toSring()
    {
        return patientName
    }

    static belongTo = [surgery: Surgery]
    static hasMany = [Appointments: Appointment, Prescriptions: Prescription]

    static constraints = {
        patientName()
        patientAddress()
        patientResidence()
        patientDob()
        patientID()
        dateRegisted()
        patientPhone()
    }
}
