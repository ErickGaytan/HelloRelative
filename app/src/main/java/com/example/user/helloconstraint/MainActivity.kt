package com.example.user.helloconstraint

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun countUp(view: View) {
        count++
        if (show_count != null)
            show_count!!.text = Integer.toString(count)
    }

  
    fun showToast(view: View) {
        val toast = Toast.makeText(this, R.string.toast_button_toast, Toast.LENGTH_LONG)
        toast.show()
    }
}