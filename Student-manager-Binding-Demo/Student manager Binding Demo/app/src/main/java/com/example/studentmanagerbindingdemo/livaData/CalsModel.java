package com.example.studentmanagerbindingdemo.livaData;

import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;

public class CalsModel {
    private MutableLiveData<String> Amount = new MutableLiveData<>();
    private MutableLiveData<Integer> Percent = new MutableLiveData<>();
    public CalsModel()
    {
        Amount.setValue("0");
        Percent.setValue(0);
    }
    public void setAmount(String amount)
    {
        Amount.setValue(amount);
    }
    public void setPercent(int percent)
    {
        Percent.setValue(percent);
    }
    public MutableLiveData<String> getAmount()
    {
        return Amount;
    }
    public MutableLiveData<Integer> getPercent()
    {
        return Percent;
    }
}
