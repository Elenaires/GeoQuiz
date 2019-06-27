package com.bignerdranch.android.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class QuizActivity extends AppCompatActivity {

    private Button mTrueButton;
    private Button mFalseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // inflates a layout and puts it on screen
        setContentView(R.layout.activity_quiz);

        // casting to Button is redundant
        mTrueButton = findViewById(R.id.true_button);

        // takes a listener object that implements View.onClickListener interface as argument
        // listener is implemented as an anonymous inner class
        // View.OnClickListener is the name of an interface
        // an object without a name is created and pass to setOnClickListener
        // https://www.geeksforgeeks.org/anonymous-inner-class-java/
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(QuizActivity.this, R.string.incorrect_toast, Toast.LENGTH_SHORT).show();
            }
        });
        mFalseButton = findViewById(R.id.false_button);
        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(QuizActivity.this, R.string.correct_toast, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
