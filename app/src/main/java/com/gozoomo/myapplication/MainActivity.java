package com.gozoomo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gozoomo.mylibrary.MyView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyView(this));
    }
}
