package com.michaelbond.helpmeout.ui.states;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class StatesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public StatesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("New Helpline Page");
    }

    public LiveData<String> getText() {
        return mText;
    }
}