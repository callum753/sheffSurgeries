package com.ceast.model

class Surgery {
    String name 
    String address
    String postCode
    int telephone
    int numberOfPatients
    String description
    String openingTimes
    String closingTimes
    Boolean registeringNewPatients

    String toSring()
    {
        return name
    }


    static hasMany = [receptionists: Receptionist, nurses: Nurse, doctors: Doctor, patients: Patient, appointments: Appointment]

    static constraints = {
        name()
        address()
        postCode()
        telephone()
        numberOfPatients()
        description()
        openingTimes()
        closingTimes()
    }
}
