package com.example.myapplication.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.myapplication.R;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private MutableLiveData<Integer> mImg;
    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");    //Name of message
        mImg = new MutableLiveData<>();
        mImg.setValue(R.drawable.wellbeingfinal_01);  //Name of image
    }

    public LiveData<String> getText() {
        return mText;
    }
    public LiveData<Integer> getDrawable() {return mImg; }
}