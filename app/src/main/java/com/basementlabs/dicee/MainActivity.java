package com.basementlabs.dicee;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button rollButton;
    ImageView leftDice;
    ImageView rightDice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollButton = (Button)findViewById(R.id.rollButton);
        leftDice = (ImageView)findViewById(R.id.image_leftdice);
        rightDice = (ImageView)findViewById(R.id.image_rightdice);


    }
}
