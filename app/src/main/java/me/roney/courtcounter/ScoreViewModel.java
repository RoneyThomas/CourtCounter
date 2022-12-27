package me.roney.courtcounter;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ScoreViewModel extends ViewModel {
    public MutableLiveData<Integer> scoreTeamA = new MutableLiveData<>(0);
    public MutableLiveData<Integer> scoreTeamB = new MutableLiveData<>(0);
}
