package com.example.myapplication.ui.Profile;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.myapplication.R;

public class ProfileViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private MutableLiveData<Integer> mImg;
    public ProfileViewModel() {
        //mText = new MutableLiveData<>();
        //mText.setValue("This is CalFresh fragment");    //Name of message
        mImg = new MutableLiveData<>();
        mImg.setValue(R.drawable.profile);  //Name of image
    }

    public LiveData<String> getText() {
        return mText;
    }
    public LiveData<Integer> getDrawable() {return mImg; }
}