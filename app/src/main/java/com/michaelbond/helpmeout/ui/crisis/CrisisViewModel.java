package com.michaelbond.helpmeout.ui.crisis;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CrisisViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CrisisViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("New Helpline Page");
    }

    public LiveData<String> getText() {
        return mText;
    }
}