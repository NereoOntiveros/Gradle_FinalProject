package com.example.jokesandroidlib;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        setTitle("Random Joke");

        String aJoke = getIntent().getStringExtra("randomJoke");

        TextView jokeDisplayTv = findViewById(R.id.joke_display_tv);
        jokeDisplayTv.setText(aJoke);
    }
}