package com.example.studentmanagerbindingdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.studentmanagerbindingdemo.databinding.ActivityTipsCalBinding;
//import com.example.studentmanagerbindingdemo.observerbleField.CalsModel;
//import com.example.studentmanagerbindingdemo.observerbleObject.CalsModel;
import com.example.studentmanagerbindingdemo.livaData.CalsModel;
public class TipsCal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityTipsCalBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_tips_cal);
//live data
        binding.setLifecycleOwner(this);
//
        CalsModel calsModel = new CalsModel();
        binding.setCalc(calsModel);
    }
}