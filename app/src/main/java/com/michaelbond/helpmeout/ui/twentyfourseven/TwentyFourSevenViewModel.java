package com.michaelbond.helpmeout.ui.twentyfourseven;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TwentyFourSevenViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TwentyFourSevenViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("24Hour Helpline page");
    }

    public LiveData<String> getText() {
        return mText;
    }
}