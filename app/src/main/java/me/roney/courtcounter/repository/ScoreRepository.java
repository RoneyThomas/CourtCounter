package me.roney.courtcounter.repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;
import java.util.concurrent.Executors;

import me.roney.courtcounter.AppDatabase;

public class ScoreRepository {

    private ScoreDao mScoreDao;
    private LiveData<List<Score>> mAllScore;

    public ScoreRepository(Application application) {
        AppDatabase db = AppDatabase.getDatabase(application);
        mScoreDao = db.scoreDao();
        mAllScore = mScoreDao.getAll();
    }

    public LiveData<List<Score>> getAllScore() {
        return mAllScore;
    }

    public void insert(Score score) {
        Executors.newSingleThreadExecutor().execute(() -> mScoreDao.insert(score));
    }

    public void update(Score score) {
        Executors.newSingleThreadExecutor().execute(() -> mScoreDao.updateScore(score));
    }

    public void delete(Score score) {
        Executors.newSingleThreadExecutor().execute(() -> mScoreDao.delete(score));
    }
}
