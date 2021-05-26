package com.example.demo;

import androidx.lifecycle.ViewModel;

import com.example.demo.observableObject.CalcModel;

public class MyViewModel extends ViewModel {
    private CalcModel calcModel = new CalcModel();
    // Or orther Observable data
    public CalcModel getCalcModel() {
        return calcModel;
    }
}
