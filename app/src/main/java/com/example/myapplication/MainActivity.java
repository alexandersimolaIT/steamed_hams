package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button buttonKick;
    private ImageView imageBall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonKick = findViewById(R.id.btnKick);
        imageBall = findViewById(R.id.imgBall);

        buttonKick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveBall();
            }
        });
    }

    private void moveBall() {
        // do stuff
    }
}
