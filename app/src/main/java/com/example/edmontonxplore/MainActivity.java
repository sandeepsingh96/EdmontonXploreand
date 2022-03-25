package com.example.edmontonxplore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goToNext(android.view.View view){
        Intent i = new Intent(MainActivity.this, ContentList.class);
        startActivity(i);
    }
}