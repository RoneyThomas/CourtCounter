package me.roney.courtcounter.repository;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ScoreDao {
    @Insert
    void insert(Score score);

    @Insert
    void insertAll(Score... scores);

    @Update
    void updateScore(Score score);

    @Delete
    void delete(Score score);

    @Query("DELETE FROM score")
    void deleteAll();

    @Query("SELECT * FROM score ORDER BY uid DESC")
    LiveData<List<Score>> getAll();

    @Query("SELECT * FROM score WHERE uid IN (:scoreIds)")
    LiveData<List<Score>> loadAllByIds(int[] scoreIds);

    @Query("SELECT * FROM score WHERE match_name LIKE :matchName")
    LiveData<Score> findByName(String matchName);
}
