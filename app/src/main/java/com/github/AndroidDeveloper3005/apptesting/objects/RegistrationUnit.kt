package com.github.AndroidDeveloper3005.apptesting.objects

object RegistrationUnit {
    private val  exitingUsers = listOf<String>("Himel","Shova")
    /*
    * input is not valid if
    * username // password is empty
    * username is already taken
    * confirmed password is not as real password
    * password contain less than 2 digit
     */



    fun validateRegistrationInput(
        userName : String,
        password : String,
        confirmPassword : String
    ) : Boolean{
        if (userName.isEmpty() || password.isEmpty()){
            return false
        }
        if (userName in  exitingUsers){
            return false
        }
        if (password != confirmPassword){
            return false
        }
        if (password.count { it.isDigit() } < 2){
            return false
        }
        return true
    }
}