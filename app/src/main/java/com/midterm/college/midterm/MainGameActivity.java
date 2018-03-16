package com.midterm.college.midterm;

import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainGameActivity extends AppCompatActivity {

    TextView n_score, n_timer;
    //ImageButton B_01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_game);

        n_score= (TextView) findViewById(R.id.N_Score);
        n_timer= (TextView) findViewById(R.id.N_Timer);

        //CountDown Timer
        new CountDownTimer(30000,1000){
            @Override
            public void onTick(long millisUnitFinished)
            {
                n_timer.setText(" " +millisUnitFinished/1000);
            }

            @Override
            public void onFinish() {
                n_timer.setTextColor(Color.RED);
                n_timer.setText("TimeUp!!");
            }
        }.start();
    }
}
