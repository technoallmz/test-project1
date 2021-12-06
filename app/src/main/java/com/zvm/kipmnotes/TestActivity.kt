package com.zvm.kipmnotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        print("testing...")
        print("from test branch 2")
        print("from test branch 1")

    }
}
