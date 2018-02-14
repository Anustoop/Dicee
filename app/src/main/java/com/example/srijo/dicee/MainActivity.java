
package com.example.srijo.dicee;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import static com.example.srijo.dicee.R.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
         Button rollButton;
         rollButton=(Button) findViewById(id.rollbutton );
     final   ImageView leftDice=(ImageView) findViewById(id.image_leftDice);
    final     ImageView rightDice=(ImageView)findViewById(id.image_rightDice);
     final   int[] diceArray={drawable.dice1,
                drawable.dice2,
                drawable.dice3, drawable.dice4, drawable.dice5, drawable.dice6};
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee","Fuck you too!!");
                Random randomNumberGenerator = new Random();
                int number1= randomNumberGenerator.nextInt(6);
                int number2= randomNumberGenerator.nextInt(6);
                Log.d("Dicee","Random Number is "+number1);
                leftDice.setImageResource(diceArray[number1]);
                rightDice.setImageResource(diceArray[number2]);
            }
        });
    }
}
