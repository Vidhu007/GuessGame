package com.example.guessgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;
    public void makeToast(String s)
    {
        Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
    }
    public void onCLK(View view)
    {
        EditText guessedText= (EditText) findViewById(R.id.editTextNumber);
        int guessedInt= Integer.parseInt(guessedText.getText().toString());
        if(guessedInt > randomNumber)
        {
            makeToast("Lower !!");
        }
        else if(guessedInt < randomNumber)
        {
            makeToast("Higher !!");
        }
        else {
            makeToast("Correct !! Let's try again !!");
            Random rand =new Random();
            randomNumber=rand.nextInt(20) + 1;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Random rand=new Random();
        randomNumber=rand.nextInt(20) +1;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}