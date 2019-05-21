package com.example.android.scorekeeperforwordsgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int scoreForPlayerOne;
    int scoreForPlayerTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // Code for player One Buttons

    /*
     *This method is triggered when the add 10 button is touched
     */
    public void addTenForPlayerOne(View view) {
        scoreForPlayerOne += 10;
        displayPlayerOne(scoreForPlayerOne);
    }

    /*
     *This method is triggered when the add 5 button is touched
     */
    public void addFiveForPlayerOne(View view) {
        scoreForPlayerOne += 5;
        displayPlayerOne(scoreForPlayerOne);
    }

    /*
     *This method displays the given score to the textview of player One
     */
    public void displayPlayerOne(int score) {
        TextView textView = findViewById(R.id.player_one_score_text_view);
        textView.setText(String.valueOf(score));
    }


    /*
     ************************************************
     * code for player two buttons
     */

    /*
     *This method is triggered when the add 10 button is touched
     */
    public void addTenForPlayerTwo(View view) {
        scoreForPlayerTwo += 10;
        displayPlayerTwo(scoreForPlayerTwo);
    }

    /*
     *This method is triggered when the add 5 button is touched
     */
    public void addFiveForPlayerTwo(View view) {
        scoreForPlayerTwo += 5;
        displayPlayerTwo(scoreForPlayerTwo);
    }

    /*
     *This method displays the given score to the textview of player two
     */
    public void displayPlayerTwo(int score) {
        TextView textView = findViewById(R.id.player_two_score_text_view);
        textView.setText(String.valueOf(score));
    }

    /*
    *This method is triggered when the reset button is touched
    * resets score for both players to zero
     */
    public void resetScore(View view){
        scoreForPlayerOne = 0;
        displayPlayerOne(scoreForPlayerOne);
        scoreForPlayerTwo = 0;
        displayPlayerTwo(scoreForPlayerTwo);
    }
}
