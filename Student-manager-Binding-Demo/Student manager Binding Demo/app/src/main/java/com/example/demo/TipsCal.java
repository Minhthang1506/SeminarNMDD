package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.example.demo.R;
import com.example.demo.databinding.ActivityTipsCalBinding;

//import com.example.demo.observableField.CalcModel;
import com.example.demo.observableObject.CalcModel;
//import com.example.demo.livaData.CalcModel;
public class TipsCal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        ActivityTipsCalBinding binding
            = DataBindingUtil.setContentView(this, R.layout.activity_tips_cal);

        MyViewModel myViewModel = new ViewModelProvider(this).get(MyViewModel.class);
        binding.setMyViewModel(myViewModel);


        //MyViewModel myViewModel
        //        = new ViewModelProvider(this).get(MyViewModel.class);
        //binding.setMyViewModel(myViewModel);
    }
}