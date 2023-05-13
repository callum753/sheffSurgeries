package com.ceast.model

class Nurse {
    String nurseName
    String qualificaions 
    String nurseEmail
    String nurseOffice
    String nursePhone

    String toSring()
    {
        return nurseName
    }

    static belongTo = [Surgery: Surgery]
    static hasMany = [Appointments: Appointment]



    static constraints = {
        nurseName()
        qualificaions()
        nurseEmail()
        nurseOffice()
        nursePhone()

        nursePhone sizes:10..20
    }
}
