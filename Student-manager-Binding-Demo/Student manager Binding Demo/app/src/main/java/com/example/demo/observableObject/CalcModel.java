package com.example.demo.observableObject;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.demo.BR;

public class CalcModel extends BaseObservable {
    private String Amount;
    private int Percent;
    private int Tips;
    public CalcModel()
    {
        Amount = "0";
        Percent = 0;
        Tips = 0;
    }
    @Bindable
    public String getAmount()
    {
        return Amount;
    }
    @Bindable
    public int getPercent()
    {
        return Percent;
    }
    @Bindable
    public int getTips()
    {
        Tips = Integer.valueOf(getAmount()) * getPercent() / 100;
        return Tips;
    }
    public void setAmount(String amount) {
        if (amount.length() != 0)
        {
        Amount = amount;
        notifyPropertyChanged(BR.amount);
        notifyPropertyChanged(BR.tips);
        }
    }
    public void setPercent(int percent) {
        Percent = percent;
        notifyPropertyChanged(BR.percent);
        notifyPropertyChanged(BR.tips);
    }

    public void setTips(int tips) {
        Tips = tips;
        notifyPropertyChanged(BR.tips);
    }
}
