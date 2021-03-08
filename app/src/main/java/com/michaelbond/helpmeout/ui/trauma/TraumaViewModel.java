package com.michaelbond.helpmeout.ui.trauma;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TraumaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TraumaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("New Helpline Page");
    }

    public LiveData<String> getText() {
        return mText;
    }
}