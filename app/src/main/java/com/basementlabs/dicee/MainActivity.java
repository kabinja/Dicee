package com.basementlabs.dicee;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button rollButton;
    ImageView leftDice;
    ImageView rightDice;

    final int[] diceArray = {
            R.drawable.dice1,
            R.drawable.dice2,
            R.drawable.dice3,
            R.drawable.dice4,
            R.drawable.dice5,
            R.drawable.dice6
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollButton = (Button)findViewById(R.id.rollButton);
        leftDice = (ImageView)findViewById(R.id.image_leftdice);
        rightDice = (ImageView)findViewById(R.id.image_rightdice);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumberGenerator = new Random();

                int right = randomNumberGenerator.nextInt(6);
                int left = randomNumberGenerator.nextInt(6);

                leftDice.setImageResource(diceArray[right]);
                rightDice.setImageResource(diceArray[left]);
            }
        });
    }
}
