package com.example.jhankar.tictactoe;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
   //int[] myGameState = {3,3,3,3,3,3,3,3,3};

    int myActive = 0;


    public void imageTapped(View view) {
        ImageView myTapped = (ImageView) view;
        myTapped.setClickable(false);


            if (myActive == 0) {
                myTapped.setImageResource(R.drawable.cross);
                myTapped.animate().rotation(360).setDuration(1000);
                myActive = 1;

            } else {
                myTapped.setImageResource(R.drawable.circle);

                myActive = 0;
            }

        }


   public void playAgain(View view){

       myActive =0;

       recreate();


    }







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
