package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

public class MainActivity extends AppCompatActivity {
    private int scoreTeamA = 0;
    private int scoreTeamB = 0;
    private int timeoutTeamA = 3;
    private int timeoutTeamB = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA();
        displayForTeamB();
        displayTimeoutForTeamA();
        displayTimeoutForTeamB();
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA() {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB() {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayTimeoutForTeamA() {
        if (timeoutTeamA >= 1) {
            ((View)findViewById(R.id.team_a_timeout1)).setBackgroundColor(getResources().getColor(R.color.timeout));
        } else {
            ((View)findViewById(R.id.team_a_timeout1)).setBackgroundColor(getResources().getColor(R.color.timeoutSpent));
        }
        if (timeoutTeamA >= 2) {
            ((View)findViewById(R.id.team_a_timeout2)).setBackgroundColor(getResources().getColor(R.color.timeout));
        } else {
            ((View)findViewById(R.id.team_a_timeout2)).setBackgroundColor(getResources().getColor(R.color.timeoutSpent));
        }
        if (timeoutTeamA >= 3) {
            ((View)findViewById(R.id.team_a_timeout3)).setBackgroundColor(getResources().getColor(R.color.timeout));
        } else {
            ((View)findViewById(R.id.team_a_timeout3)).setBackgroundColor(getResources().getColor(R.color.timeoutSpent));
        }
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayTimeoutForTeamB() {
        if (timeoutTeamB >= 1) {
            ((View)findViewById(R.id.team_b_timeout1)).setBackgroundColor(getResources().getColor(R.color.timeout));
        } else {
            ((View)findViewById(R.id.team_b_timeout1)).setBackgroundColor(getResources().getColor(R.color.timeoutSpent));
        }
        if (timeoutTeamB >= 2) {
            ((View)findViewById(R.id.team_b_timeout2)).setBackgroundColor(getResources().getColor(R.color.timeout));
        } else {
            ((View)findViewById(R.id.team_b_timeout2)).setBackgroundColor(getResources().getColor(R.color.timeoutSpent));
        }
        if (timeoutTeamB >= 3) {
            ((View)findViewById(R.id.team_b_timeout3)).setBackgroundColor(getResources().getColor(R.color.timeout));
        } else {
            ((View)findViewById(R.id.team_b_timeout3)).setBackgroundColor(getResources().getColor(R.color.timeoutSpent));
        }
    }

    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA();
        displayForTeamB();
        timeoutTeamA = 3;
        timeoutTeamB = 3;
        displayTimeoutForTeamA();
        displayTimeoutForTeamB();
    }

    public void setHalfTime(View view) {
        timeoutTeamA = 3;
        timeoutTeamB = 3;
        displayTimeoutForTeamA();
        displayTimeoutForTeamB();
    }

    public void touchdownTeamA(View view) {
        scoreTeamA += 6;
        displayForTeamA();
    }

    public void touchdownTeamB(View view) {
        scoreTeamB += 6;
        displayForTeamB();
    }

    public void fieldGoalTeamA(View view) {
        scoreTeamA += 3;
        displayForTeamA();
    }

    public void fieldGoalTeamB(View view) {
        scoreTeamB += 3;
        displayForTeamB();
    }

    public void safetyTeamA(View view) {
        scoreTeamA += 2;
        displayForTeamA();
    }

    public void safetyTeamB(View view) {
        scoreTeamB += 2;
        displayForTeamB();
    }

    public void bonus1TeamA(View view) {
        scoreTeamA++;
        displayForTeamA();
    }

    public void bonus1TeamB(View view) {
        scoreTeamB++;
        displayForTeamB();
    }

    public void bonus2TeamA(View view) {
        scoreTeamA += 2;
        displayForTeamA();
    }

    public void bonus2TeamB(View view) {
        scoreTeamB += 2;
        displayForTeamB();
    }

    public void timeoutTeamA(View view) {
        timeoutTeamA--;
        displayTimeoutForTeamA();
    }

    public void timeoutTeamB(View view) {
        timeoutTeamB--;
        displayTimeoutForTeamB();
    }
}
