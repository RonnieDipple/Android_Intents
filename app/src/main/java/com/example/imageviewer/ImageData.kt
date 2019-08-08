package com.example.imageviewer

import android.net.Uri
import java.io.Serializable

class ImageData(myUri: Uri) : Serializable {
    private val mySetterStringUri =  myUri.toString()

    private val myGetterUri: Uri = Uri.parse(mySetterStringUri)




}