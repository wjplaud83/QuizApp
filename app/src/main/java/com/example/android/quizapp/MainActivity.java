package com.example.android.quizapp;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public MenuInflater getMenuInflater() {
        return super.getMenuInflater();
    }

    public void goToQuiz (View view)
        {
            if(view.getId() == R.id.quiz_button)
            {
                Intent i = new Intent(MainActivity.this, QuizActivity.class);
                startActivity(i);
            }
        }
    }

