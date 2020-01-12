package com.example.myapplication.ui.nutrition;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.myapplication.R;

public class FoodBankViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private MutableLiveData<Integer> mImg;
    public FoodBankViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is FoodBank fragment");    //Name of message
        mImg = new MutableLiveData<>();
        mImg.setValue(R.drawable.wellbeingfinal_06);  //Name of image
    }

    public LiveData<String> getText() {
        return mText;
    }
    public LiveData<Integer> getDrawable() {return mImg; }
}