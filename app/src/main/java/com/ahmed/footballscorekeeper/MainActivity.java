package com.ahmed.footballscorekeeper;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int teamAGoals;
    private int teamAYellowCards;
    private int teamARedCards;
    private int teamBGoals;
    private int teamBYellowCards;
    private int teamBRedCards;
    private TextView teamAGoalsTextView;
    private TextView teamAYellowCardsTextView;
    private TextView teamARedCardsTextView;
    private TextView teamBGoalsTextView;
    private TextView teamBYellowCardsTextView;
    private TextView teamBRedCardsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teamAGoalsTextView = findViewById(R.id.teamAGoals);
        teamAYellowCardsTextView = findViewById(R.id.teamAYellowCards);
        teamARedCardsTextView = findViewById(R.id.teamARedCards);
        teamBGoalsTextView = findViewById(R.id.teamBGoals);
        teamBYellowCardsTextView = findViewById(R.id.teamBYellowCards);
        teamBRedCardsTextView = findViewById(R.id.teamBRedCards);
        resetToDefaultValues();
    }

    private void resetToDefaultValues() {
        teamAGoals = 0;
        teamAYellowCards = 0;
        teamARedCards = 0;
        teamBGoals = 0;
        teamBYellowCards = 0;
        teamBRedCards = 0;
        setNewValueToTextView(teamAGoalsTextView, teamAGoals);
        setNewValueToTextView(teamAYellowCardsTextView, teamAYellowCards);
        setNewValueToTextView(teamARedCardsTextView, teamARedCards);
        setNewValueToTextView(teamBGoalsTextView, teamBGoals);
        setNewValueToTextView(teamBYellowCardsTextView, teamBYellowCards);
        setNewValueToTextView(teamBRedCardsTextView, teamBRedCards);
    }

    private void setNewValueToTextView(TextView textView, int value) {
        textView.setText(String.valueOf(value));
    }

    public void onButtonClick(View view) {
        switch (view.getId()) {
            case R.id.teamAGoalBtn: {
                teamAGoals += 1;
                setNewValueToTextView(teamAGoalsTextView, teamAGoals);
                break;
            }
            case R.id.teamAYellowCardsBtn: {
                teamAYellowCards += 1;
                setNewValueToTextView(teamAYellowCardsTextView, teamAYellowCards);
                break;
            }
            case R.id.teamARedCardsBtn: {
                teamARedCards += 1;
                setNewValueToTextView(teamARedCardsTextView, teamARedCards);
                break;
            }
            case R.id.teamBGoalBtn: {
                teamBGoals += 1;
                setNewValueToTextView(teamBGoalsTextView, teamBGoals);
                break;
            }
            case R.id.teamBYellowCardsBtn: {
                teamBYellowCards += 1;
                setNewValueToTextView(teamBYellowCardsTextView, teamBYellowCards);
                break;
            }
            case R.id.teamBRedCardsBtn: {
                teamBRedCards += 1;
                setNewValueToTextView(teamBRedCardsTextView, teamBRedCards);
                break;
            }
            case R.id.resetBtn: {
                resetToDefaultValues();
                break;
            }
        }
    }
}
