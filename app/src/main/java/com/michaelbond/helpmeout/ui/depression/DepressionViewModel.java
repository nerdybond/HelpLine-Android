package com.michaelbond.helpmeout.ui.depression;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DepressionViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DepressionViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("New Helpline Page");
    }

    public LiveData<String> getText() {
        return mText;
    }
}