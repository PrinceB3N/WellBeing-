package com.example.myapplication.ui.nutrition;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.myapplication.R;

public class EOPViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private MutableLiveData<Integer> mImg;
    public EOPViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is EOP fragment");    //Name of message
        mImg = new MutableLiveData<>();
        mImg.setValue(R.drawable.unnamed);  //Name of image
    }

    public LiveData<String> getText() {
        return mText;
    }
    public LiveData<Integer> getDrawable() {return mImg; }
}