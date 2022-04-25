package com.varefree.tasker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.varefree.tasker.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var acBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //initlilizing the value of the binding value
        acBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(acBinding.root)

        Handler().postDelayed({
            val inte :Intent = Intent(this, TodoViewerActivity::class.java)
                              startActivity(inte)}, 1500)



    }
}