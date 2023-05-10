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

    static belongTo = [surgery: Surgery]
    static hasMany = [Appointment: Appointment]



    static constraints = {
        nurseName()
        qualificaions()
        nurseEmail()
        nurseOffice()
        nursePhone()

        nursePhone sizes:10..20
    }
}
