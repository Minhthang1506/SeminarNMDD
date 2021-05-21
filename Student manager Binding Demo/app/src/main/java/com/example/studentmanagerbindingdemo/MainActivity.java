package com.example.studentmanagerbindingdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import android.os.Bundle;


import com.example.studentmanagerbindingdemo.databinding.ActivityMainBinding;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
       //ActivityMainBinding binding =DataBindingUtil.setContentView(this,R.layout.activity_main);

    }
}