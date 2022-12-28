package me.roney.courtcounter;

import android.app.Application;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import me.roney.courtcounter.repository.Score;
import me.roney.courtcounter.repository.ScoreRepository;

public class ScoreViewModel extends AndroidViewModel {
    public MutableLiveData<Integer> scoreTeamA = new MutableLiveData<>(0);
    public MutableLiveData<Integer> scoreTeamB = new MutableLiveData<>(0);
    public LiveData<List<Score>> scoreList;

    private ScoreRepository mScoreRepository;

    public ScoreViewModel(@NonNull Application application) {
        super(application);
        mScoreRepository = new ScoreRepository(application);
        scoreList = mScoreRepository.getAllScore();
    }

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
