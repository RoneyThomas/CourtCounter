package me.roney.courtcounter;

import android.view.View;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ScoreViewModel extends ViewModel {
    public MutableLiveData<Integer> scoreTeamA = new MutableLiveData<>(0);
    public MutableLiveData<Integer> scoreTeamB = new MutableLiveData<>(0);

    public void resetScore() {
        scoreTeamA.setValue(0);
        scoreTeamB.setValue(0);
    }

    public void addPoint(String team, int score) {
        switch (team) {
            case "Team A":
                scoreTeamA.setValue(scoreTeamA.getValue() + score);
                break;
            case "Team B":
                scoreTeamB.setValue(scoreTeamB.getValue() + score);
                break;
        }
    }
}
