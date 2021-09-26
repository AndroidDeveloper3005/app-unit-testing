package com.github.AndroidDeveloper3005.apptesting.classes

import android.content.Context
import java.security.AccessControlContext

class ResourceComparer {

    fun isEquel(context: Context , resId : Int , string : String ) : Boolean{
        return context.getString(resId) == string
    }
}