package com.github.AndroidDeveloper3005.apptesting.classes

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.github.AndroidDeveloper3005.apptesting.R
import com.google.common.truth.Truth
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test


class ResourceComparerTest{
   private lateinit var resourceComparer : ResourceComparer


   @Before
   fun setup(){
       resourceComparer = ResourceComparer()
   }
    @After // when we use room databse we need to close our database
    fun tearDown(){

    }

    @Test
    fun stringResourceSameAsGivenString_returnTrue(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result =  resourceComparer.isEquel(context , R.string.app_name , "AppTesting")
        assertThat(result).isTrue()
    }

    @Test
    fun stringResourceDifferentAsGivenString_returnFalse(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result =  resourceComparer.isEquel(context , R.string.app_name , "UnitTesting")
        assertThat(result).isFalse()
    }

}