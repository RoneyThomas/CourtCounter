package me.roney.courtcounter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
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
        mViewModel.scoreTeamA.observe(this, this::displayForTeamA);
        mViewModel.scoreTeamB.observe(this, this::displayForTeamB);
    }

    public void addThreeForTeamA(View view) {
        mViewModel.scoreTeamA.setValue(mViewModel.scoreTeamA.getValue() + 3);
    }

    public void addTwoForTeamA(View view) {
        mViewModel.scoreTeamA.setValue(mViewModel.scoreTeamA.getValue() + 2);
    }

    public void addOneForTeamA(View view) {
        mViewModel.scoreTeamA.setValue(mViewModel.scoreTeamA.getValue() + 1);
    }

    public void addThreeForTeamB(View view) {
        mViewModel.scoreTeamB.setValue(mViewModel.scoreTeamB.getValue() + 3);
//        displayForTeamB(mViewModel.scoreTeamB);
    }

    public void addTwoForTeamB(View view) {
        mViewModel.scoreTeamB.setValue(mViewModel.scoreTeamB.getValue() + 2);
//        displayForTeamB(mViewModel.scoreTeamB);
    }

    public void addOneForTeamB(View view) {
        mViewModel.scoreTeamB.setValue(mViewModel.scoreTeamB.getValue() + 1);
//        displayForTeamB(mViewModel.scoreTeamB);
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
        mViewModel.scoreTeamA.setValue(0);
        mViewModel.scoreTeamB.setValue(0);
    }
}