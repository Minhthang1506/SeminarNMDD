package com.example.studentmanagerbindingdemo.observerbleObject;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.BindingAdapter;

import com.example.studentmanagerbindingdemo.BR;

public class CalsModel extends BaseObservable {
    private String Amount;
    private int Percent;
    public CalsModel()
    {
        Amount = "0";
        Percent = 0;
    }
    @Bindable
    public String getAmount()
    {
        if (Amount == "")
            return "0";
        else
            return Amount;
    }
    @Bindable
    public int getPercent()
    {
        return Percent;
    }

    public void setAmount(String amount) {
        Amount = amount;
        notifyPropertyChanged(BR.amount);
    }
    public void setPercent(int percent) {
        Percent = percent;
        notifyPropertyChanged(BR.percent);
    }
}
