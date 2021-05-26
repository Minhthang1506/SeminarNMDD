package com.example.demo.observableField;

import androidx.databinding.ObservableField;

public class CalcModel {
    private ObservableField<String> Amount = new ObservableField<>();
    private ObservableField<Integer> Percent = new ObservableField<>();
    private ObservableField<Integer> Tips = new ObservableField<>();

    public CalcModel()
    {
        Amount.set("0");
        Percent.set(0);
        Tips.set(0);
    }
    public ObservableField<String> getAmount()
    {
        if(Amount.get().length() == 0)
            Amount.set("0");
        return Amount;
    }
    public ObservableField<Integer> getPercent()
    {
        return Percent;
    }
    public ObservableField<Integer> getTips()
    {
        Tips.set(Integer.valueOf(getAmount().get()) * Percent.get() / 100);
        return Tips;
    }
}

