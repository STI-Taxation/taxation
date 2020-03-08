package com.uz.taxation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    val manager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Will Show the login layout
        showLogin()

    }

    //function to show Login layout
    fun showLogin(){
        val transaction = manager.beginTransaction()
        val fragment = LoginFragment()
        transaction.replace(R.id.container, fragment)
        transaction.commit()
    }

}
