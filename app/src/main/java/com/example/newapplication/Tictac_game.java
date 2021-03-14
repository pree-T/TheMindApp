package com.example.newapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;

public class Tictac_game extends AppCompatActivity {
    boolean gameActive=true;
    //0-X
    //1-0
    int activePlayer=0;
    int[] gameState={2,2,2,2,2,2,2,2,2};
    //state meaning
    //0-x
    //1-0
    //2-null
    TextView status;
    int[][] winPositions={{0,1,2},{3,4,5},{6,7,8},{0,3,6},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
    @SuppressLint("SetTextI18n")
    public void Playertap(View view){
        ImageView img=(ImageView)view;
        int tappedImage=Integer.parseInt(img.getTag().toString());
        if(!gameActive){
            gameReset(view);
        }
        if(gameState[tappedImage]==2)
        {
            gameState[tappedImage]=activePlayer;
            img.setTranslationY(-1000f);
            if(activePlayer==0){
                img.setImageResource(R.drawable.cross);
                activePlayer=1;
                status=findViewById(R.id.status);
                status.setText("2nd Player's Turn");
            }
            else{
                img.setImageResource(R.drawable.circle);
                activePlayer=0;
                status.setText("1st Player's Turn");
            }

        img.animate().translationYBy(1000f).setDuration(300);}
        //Check if any player has won or not
        for(int [] winPosition:winPositions){
            if (gameState[winPosition[0]]==gameState[winPosition[1]] && gameState[winPosition[1]]==gameState[winPosition[2]] &&gameState[winPosition[0]]!=2)
            {
                //Someone has won-find out
                String winnerStr;
                gameActive=false;
                if(gameState[winPosition[0]]==0){
                    winnerStr="1st Player has won";
                }
                else{
                    winnerStr="2nd Player has won";
                }
                //Update the status bar for winner
                status.setText(winnerStr);

            }
        }

    }

    private void gameReset(View view) {
        gameActive=true;
        activePlayer=0;
        Arrays.fill(gameState, 2);
        ((ImageView)findViewById(R.id.imageView0)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView1)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView2)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView3)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView4)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView5)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView6)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView7)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView8)).setImageResource(0);
        TextView status= findViewById(R.id.status);
        status.setText("1st Player's turn -Tap to play");

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tictac_game);
    }
}