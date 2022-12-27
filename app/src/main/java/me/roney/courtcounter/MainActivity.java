package me.roney.courtcounter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ScoreViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewModel = new ViewModelProvider(this).get(ScoreViewModel.class);
        displayForTeamA(mViewModel.scoreTeamA);
        displayForTeamB(mViewModel.scoreTeamB);
    }

    public void addThreeForTeamA(View view) {
        mViewModel.scoreTeamA += 3;
        displayForTeamA(mViewModel.scoreTeamA);
    }

    public void addTwoForTeamA(View view) {
        mViewModel.scoreTeamA += 2;
        displayForTeamA(mViewModel.scoreTeamA);
    }

    public void addOneForTeamA(View view) {
        mViewModel.scoreTeamA += 1;
        displayForTeamA(mViewModel.scoreTeamA);
    }

    public void addThreeForTeamB(View view) {
        mViewModel.scoreTeamB += 3;
        displayForTeamB(mViewModel.scoreTeamB);
    }

    public void addTwoForTeamB(View view) {
        mViewModel.scoreTeamB += 2;
        displayForTeamB(mViewModel.scoreTeamB);
    }

    public void addOneForTeamB(View view) {
        mViewModel.scoreTeamB += 1;
        displayForTeamB(mViewModel.scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScore(View view) {
        mViewModel.scoreTeamA = 0;
        mViewModel.scoreTeamB = 0;
        displayForTeamA(mViewModel.scoreTeamA);
        displayForTeamB(mViewModel.scoreTeamB);
    }
}