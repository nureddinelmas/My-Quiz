package com.nureddinelmas.myquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class QuizActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        var QuizList = ArrayList<Quiz>()

        var q1 = Quiz(1,"Baba adi", "Hanifi", "Seyma", "Nureddin", "Murat","c")
        var q2 = Quiz(1,"Baba adi", "Hanifi", "Seyma", "Nureddin", "Murat","c")
        var q3 = Quiz(1,"Baba adi", "Hanifi", "Seyma", "Nureddin", "Murat","c")

        QuizList.add(q1)
        QuizList.add(q2)
        QuizList.add(q3)


    }
}