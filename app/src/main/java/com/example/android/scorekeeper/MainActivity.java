package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int ScoreTeamA=0;
    int FoulTeamA=0;
    int ScoreTeamB=0;
    int FoulTeamB=0;

    public void setScoreTeamA(View v){
        ScoreTeamA = ScoreTeamA + 1 ;
        displayScoreForTeamA(ScoreTeamA);
    }

    public void setScoreTeamB(View v){
        ScoreTeamB = ScoreTeamB + 1 ;
        displayScoreForTeamB(ScoreTeamB);
    }

    public void setFoulTeamA(View v){
        FoulTeamA = FoulTeamA + 1 ;
        displayFoulForTeamA(FoulTeamA);
    }

    public void setFoulTeamB(View v){
        FoulTeamB = FoulTeamB + 1 ;
        displayFoulForTeamB(FoulTeamB);
    }

    public void Reset(View v){
        ScoreTeamA = 0;
        ScoreTeamB = 0;
        FoulTeamA = 0;
        FoulTeamB = 0;
        displayScoreForTeamA(ScoreTeamA);
        displayFoulForTeamA(FoulTeamA);
        displayScoreForTeamB(ScoreTeamB);
        displayFoulForTeamB(FoulTeamB);
    }

    public void displayScoreForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_team_a);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foul_team_a);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foul_team_b);
        scoreView.setText(String.valueOf(score));
    }

    public void displayScoreForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_team_b);
        scoreView.setText(String.valueOf(score));
    }
}
