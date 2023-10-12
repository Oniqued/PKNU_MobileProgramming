package com.example.assignment01;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivitySample extends AppCompatActivity {
    MainFragment mainFragment;
    ViewFragment viewFragment;
    InputFragment inputFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainFragment = new MainFragment();
        viewFragment = new ViewFragment();
        inputFragment = new InputFragment();
    }

    public void onFragmentChanged(int index) {
        if(index == 0)
    }
}