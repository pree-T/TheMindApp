package com.example.newapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        ArrayList<StaticRvModel> item=new ArrayList<>();
        item.add(new StaticRvModel(R.drawable.tictac,"TicTac"));
        item.add(new StaticRvModel(R.drawable.pastime,"Sudoku"));
        RecyclerView recyclerView = findViewById(R.id.rv1);
        StaticRvAdapter staticRvAdapter = new StaticRvAdapter(item);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(staticRvAdapter);


    }
}