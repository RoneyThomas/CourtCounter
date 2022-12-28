package me.roney.courtcounter.repository;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "score")
public class Score {
    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name = "match_name")
    public String matchName;

//    @ColumnInfo(name = "match_date")
//    public Date matchDate;

    @ColumnInfo(name = "team_a_name")
    public String teamAName;

    @ColumnInfo(name = "team_b_name")
    public String teamBName;

    @ColumnInfo(name = "team_a_score")
    public int teamAScore = 0;

    @ColumnInfo(name = "team_b_score")
    public int teamBScore = 0;
}
