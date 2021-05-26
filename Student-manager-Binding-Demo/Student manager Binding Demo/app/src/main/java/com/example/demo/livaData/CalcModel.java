package com.example.demo.livaData;

import android.view.View;
import android.widget.EditText;

import androidx.databinding.BindingAdapter;
import androidx.databinding.InverseBindingAdapter;
import androidx.databinding.InverseMethod;
import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;

import com.google.android.material.textfield.TextInputEditText;

public class CalcModel {

    private MutableLiveData<String> Amount = new MutableLiveData<>();
    private MutableLiveData<Integer> Percent = new MutableLiveData<>();
    private MutableLiveData<Integer> Tips = new MutableLiveData<>();
    public CalcModel()
    {
        Amount.setValue("0");
        Percent.setValue(0);
        Tips.setValue(0);
    }

    public MutableLiveData<String> getAmount()
    {
        if(Amount.getValue().length() == 0)
            Amount.setValue("0");
        return Amount;
    }
    public MutableLiveData<Integer> getPercent()
    {
        return Percent;
    }

    public MutableLiveData<Integer> getTips() {
        Tips.setValue(Integer.valueOf(getAmount().getValue()) * Percent.getValue() /100);
        return Tips;
    }
}
