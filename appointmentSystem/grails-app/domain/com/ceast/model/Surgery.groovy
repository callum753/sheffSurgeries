package com.ceast.model

class Surgery {
    Name string
    Address string
    Postcode string 
    Telphone string 
    NumberofPatients character
    Description string
    OpeningTimes string
    NewPatient Boolean 


    static constraints = {
        Name()
        Address()
        Postcode()
        Telphone ()
        NumberofPatients()
        Description()
        OpeningTimes()
        NewPatient()
    }
}
