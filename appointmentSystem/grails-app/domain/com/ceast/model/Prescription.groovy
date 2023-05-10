package com.ceast.model

class Prescription {

    int PrecriptionNumber
    String medicine
    int daysSuply
    BigDecimal totalCost
    Date dateIssued 
    Boolean patientPaying 

     String toSring()
    {
        return patientName
    }

    static belongTo = [Doctor: Doctor, Patient: Patient]

    static constraints = {
        PrecriptionNumber()
        medicine()
        daysSuply()
        totalCost()
        dateIssued()
        patientPaying()
    }
}
