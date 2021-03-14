package com.example.newapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tictac extends AppCompatActivity {
    Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tictac);
        start=findViewById(R.id.button);
        start.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),Tictac_game.class);
            startActivity(intent);
        });
    }
}