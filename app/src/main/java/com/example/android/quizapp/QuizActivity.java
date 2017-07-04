package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/*** Created by wjplaud83 on 7/10/16.*/
public class QuizActivity extends AppCompatActivity{

    /** score is zero*/
    int score = 0;
    int rightAnswer = 1;
    int wrongAnswer = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }
        public void rightAnswer(View view) {
            score = score + rightAnswer;
        }
    public void wrongAnswer(View view) {
        score = score + wrongAnswer;
    }
    /** Called when clicked to get quiz results*/
    public void getResult(View view) {
        /**called when EditText question 9 is written in**/
        EditText constellation_Question = (EditText)findViewById(R.id.constellation_Question);
        String constellationAnswer = constellation_Question.getText().toString().trim().toLowerCase();
        if (constellationAnswer.equals("stars")) {
            score = score + rightAnswer;
        } else
        {
            score = score + wrongAnswer;
        }
        /**called when EditText question 9 is written in**/
        EditText universe_Question = (EditText)findViewById(R.id.universe_Question);
        String universeAnswer = universe_Question.getText().toString().trim().toLowerCase();
        if (universeAnswer.equals("the big bang")) {
            score = score + rightAnswer;
        } else
        {
            score = score + wrongAnswer;
        }
        /**called when EditText question 10 is written in**/
        EditText ufo_Question = (EditText)findViewById(R.id.ufo_Question);
        String ufoAnswer = ufo_Question.getText().toString().trim().toLowerCase();
        if (ufoAnswer.equals("unidentified flying object")) {
            score = score + rightAnswer;
        } else
        {
            score = score + wrongAnswer;
        }
        if(view.getId() == R.id.calculate_score)
        {
            Toast.makeText(QuizActivity.this, "The score is " + score + " out of 15.", Toast.LENGTH_LONG).show();
        }
    }
}
