package com.ceast.model

class Receptionist {

    String recepName
    String recepEmail
    String recepUsername
    String recepPassword
    int recepPhone

     String toSring()
    {
        return recepName
    }

    static belongTo = [surgery : Surgery]

    static constraints = {
        recepName()
        recepEmail()
        recepUsername()
        recepUsername()
        recepPhone()
    }
}
