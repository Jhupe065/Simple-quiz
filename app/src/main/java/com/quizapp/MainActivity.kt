package com.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_start.setOnClickListener {
            val intent = Intent(this@MainActivity, QuizQuestionsActivity::class.java)
                startActivity(intent)
                finish()
        }
    }
}