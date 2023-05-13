package com.ceast.model

class Prescription {

    int prescriptionNumber
    String medicine
    int daysSuply
    BigDecimal totalCost
    Date dateIssued 
    Boolean patientPaying 

     String toSring()
    {
        return patientName
    }

    static belongTo = [doctor: Doctor, patient: Patient]

    static constraints = {
        prescriptionNumber()
        medicine()
        daysSuply()
        totalCost()
        dateIssued()
        patientPaying()
    }
}
