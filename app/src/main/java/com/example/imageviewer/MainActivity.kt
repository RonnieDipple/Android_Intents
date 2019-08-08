package com.example.imageviewer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
   var indexNum = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       Main_ScrollView_LL.addView(createTextView("text", indexNum++))


      button_add_image.setOnClickListener {
           val intent = Intent(Intent.ACTION_GET_CONTENT)
            intent.type = "image/*"
            startActivityForResult(intent, indexNum)



        }


    }


    fun createTextView(stringText: String, index: Int ) : TextView{
        val view = TextView(this)

        view.text = "$stringText"
        view.textSize = 24f

        return view

    }

}


