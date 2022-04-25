package com.varefree.tasker

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.varefree.tasker.databinding.TodoViewerBinding

class TodoViewerActivity: AppCompatActivity(){

    private lateinit var viewBinding :TodoViewerBinding

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        viewBinding = TodoViewerBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)


    }
}