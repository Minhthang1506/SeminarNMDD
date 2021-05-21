package com.example.studentmanagerbindingdemo.observerbleField;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

import com.example.studentmanagerbindingdemo.BR;

public class CalsModel {
    private ObservableField<String> Amount = new ObservableField<>();
    private ObservableField<Integer> Percent = new ObservableField<>();
    public CalsModel()
    {
        Amount.set("0");
        Percent.set(0);
    }
    public void setAmount(String amount)
    {
        Amount.set(amount);
    }
    public void setPercent(int percent)
    {
        Percent.set(percent);
    }
    public ObservableField<String> getAmount()
    {
        return Amount;
    }
    public ObservableField<Integer> getPercent()
    {
        return Percent;
    }
}
