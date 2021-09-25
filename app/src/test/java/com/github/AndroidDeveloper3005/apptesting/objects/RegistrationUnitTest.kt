package com.github.AndroidDeveloper3005.apptesting.objects

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUnitTest {

    @Test
    fun `empty username return false`(){
        val result = RegistrationUnit.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()

    }



    @Test
    fun `valid username and correctly repeated password return true`(){
        val result = RegistrationUnit.validateRegistrationInput(
            "Annona",
            "123",
            "123"
        )
        assertThat(result).isTrue()

    }




    @Test
    fun `username already exits return false`(){
        val result = RegistrationUnit.validateRegistrationInput(
            "Himel",
            "123",
            "123"
        )
        assertThat(result).isFalse()

    }


    @Test
    fun `confirm password is not = real password return false`(){
        val result = RegistrationUnit.validateRegistrationInput(
            "Himel",
            "123",
            "12"
        )
        assertThat(result).isFalse()

    }


    @Test
    fun `empty password return false`(){
        val result = RegistrationUnit.validateRegistrationInput(
            "Himel",
            "",
            ""
        )
        assertThat(result).isFalse()

    }


    @Test
    fun `password length is less then 2 return false`(){
        val result = RegistrationUnit.validateRegistrationInput(
            "Himel",
            "1",
            "1"
        )
        assertThat(result).isFalse()

    }
}