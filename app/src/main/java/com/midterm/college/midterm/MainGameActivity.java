package com.midterm.college.midterm;

import android.graphics.Color;
import android.icu.util.IslamicCalendar;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MainGameActivity extends AppCompatActivity {

    TextView            n_score, n_timer;
    ImageButton           B_01, B_02, B_03, B_04, B_11, B_12, B_13, B_14, B_21, B_22, B_23, B_24, B_31, B_32, B_33, B_34;
    //Array for Images
    Integer []          CardArray = { 101,102,103,104,111, 112, 113, 114, 121, 122, 123, 124, 131, 132, 133, 134 };
    //Image Holders
    int                 i001, i002, i003, i004, i101, i102, i103, i104, i201, i202, i203, i204, i301, i302, i303, i304;

    int                 FirstCard, SecondCard;
    int                 ClickedFirst, ClickedSecond;
    int                 CardNumber = 1;
    int                 Score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_game);

        n_score= (TextView) findViewById(R.id.N_Score);
        n_timer= (TextView) findViewById(R.id.N_Timer);

        B_01 = (ImageButton) findViewById(R.id.I01);
        B_02 = (ImageButton) findViewById(R.id.I02);
        B_03 = (ImageButton) findViewById(R.id.I03);
        B_04 = (ImageButton) findViewById(R.id.I04);
        B_11 = (ImageButton) findViewById(R.id.I11);
        B_12 = (ImageButton) findViewById(R.id.I12);
        B_13 = (ImageButton) findViewById(R.id.I13);
        B_14 = (ImageButton) findViewById(R.id.I14);
        B_21 = (ImageButton) findViewById(R.id.I21);
        B_22 = (ImageButton) findViewById(R.id.I22);
        B_23 = (ImageButton) findViewById(R.id.I23);
        B_24 = (ImageButton) findViewById(R.id.I24);
        B_31 = (ImageButton) findViewById(R.id.I31);
        B_32 = (ImageButton) findViewById(R.id.I32);
        B_33 = (ImageButton) findViewById(R.id.I33);
        B_34 = (ImageButton) findViewById(R.id.I34);

        B_01.setTag("0");
        B_02.setTag("1");
        B_03.setTag("2");
        B_04.setTag("3");
        B_11.setTag("4");
        B_12.setTag("5");
        B_13.setTag("6");
        B_14.setTag("7");
        B_21.setTag("8");
        B_22.setTag("9");
        B_23.setTag("10");
        B_24.setTag("11");
        B_31.setTag("12");
        B_32.setTag("13");
        B_33.setTag("14");
        B_34.setTag("15");

        //Loading Images
        frontOfCardResources();
        //Shuffle
        Collections.shuffle(Arrays.asList(CardArray));

        B_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(B_01, theCard);
            }
        });

        B_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(B_02, theCard);
            }
        });

        B_03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(B_03, theCard);
            }
        });

        B_04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(B_04, theCard);
            }
        });

        B_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(B_11, theCard);
            }
        });

        B_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(B_12, theCard);
            }
        });

        B_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(B_13, theCard);
            }
        });

        B_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(B_14, theCard);
            }
        });

        B_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(B_21, theCard);
            }
        });

        B_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(B_22, theCard);
            }
        });

        B_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(B_23, theCard);
            }
        });
        B_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(B_24, theCard);
            }
        });

        B_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(B_31, theCard);
            }
        });

        B_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(B_32, theCard);
            }
        });

        B_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(B_33, theCard);
            }
        });

        B_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(B_34, theCard);
            }
        });



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

    private void doStuff(ImageButton b_01, int Card) {
        //Set the correct images
        if(CardArray[Card] == 101)
        {
            b_01.setImageResource(i001);
        }
        else if(CardArray[Card] == 102)
        {
            b_01.setImageResource(i002);
        }
        else if(CardArray[Card] == 103)
        {
            b_01.setImageResource(i003);
        }
        else if(CardArray[Card] == 104)
        {
            b_01.setImageResource(i004);
        }
        else if(CardArray[Card] == 111)
        {
            b_01.setImageResource(i101);
        }
        else if(CardArray[Card] == 112)
        {
            b_01.setImageResource(i102);
        }
        else if(CardArray[Card] == 113)
        {
            b_01.setImageResource(i103);
        }
        else if(CardArray[Card] == 114)
        {
            b_01.setImageResource(i104);
        }
        else if(CardArray[Card] == 121)
        {
            b_01.setImageResource(i201);
        }
        else if(CardArray[Card] == 122)
        {
            b_01.setImageResource(i202);
        }
        else if(CardArray[Card] == 123)
        {
            b_01.setImageResource(i203);
        }
        else if(CardArray[Card] == 124)
        {
            b_01.setImageResource(i204);
        }
        else if(CardArray[Card] == 131)
        {
            b_01.setImageResource(i301);
        }
        else if(CardArray[Card] == 132)
        {
            b_01.setImageResource(i302);
        }
        else if(CardArray[Card] == 133)
        {
            b_01.setImageResource(i303);
        }
        else if(CardArray[Card] == 134)
        {
            b_01.setImageResource(i304);
        }

        //Check which image is selected
        if (CardNumber==1)
        {
            FirstCard = CardArray[Card];
            if (FirstCard>200)
            {
                FirstCard=FirstCard -100;
            }
            CardNumber = 2;
            ClickedFirst = Card;

            B_01.setEnabled(false);

        }
        else if (CardNumber ==2)
        {
            SecondCard = CardArray[Card];
            if (SecondCard>200)
            {
                SecondCard=SecondCard -100;
            }
            CardNumber = 1;
            ClickedSecond = Card;

            B_01.setEnabled(false);
            B_02.setEnabled(false);
            B_03.setEnabled(false);
            B_04.setEnabled(false);
            B_11.setEnabled(false);
            B_12.setEnabled(false);
            B_13.setEnabled(false);
            B_14.setEnabled(false);
            B_21.setEnabled(false);
            B_22.setEnabled(false);
            B_23.setEnabled(false);
            B_24.setEnabled(false);
            B_31.setEnabled(false);
            B_32.setEnabled(false);
            B_33.setEnabled(false);
            B_34.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //Checking if selected images are equal
                    calculate();
                }
            }, 1000);

        }

    }

    private void calculate() {
        //If images are equal -> remove them
        if (FirstCard==SecondCard)
        {
            if (ClickedFirst==0)
            {
                B_01.setVisibility(View.INVISIBLE);
            }
            else if (ClickedFirst==1)
            {
                B_02.setVisibility(View.INVISIBLE);
            }
            else if (ClickedFirst==2)
            {
                B_03.setVisibility(View.INVISIBLE);
            }
            else if (ClickedFirst==3)
            {
                B_04.setVisibility(View.INVISIBLE);
            }
            else if (ClickedFirst==4)
            {
                B_11.setVisibility(View.INVISIBLE);
            }
            else if (ClickedFirst==5)
            {
                B_12.setVisibility(View.INVISIBLE);
            }
            else if (ClickedFirst==6)
            {
                B_13.setVisibility(View.INVISIBLE);
            }
            else if (ClickedFirst==7)
            {
                B_14.setVisibility(View.INVISIBLE);
            }
            else if (ClickedFirst==8)
            {
                B_21.setVisibility(View.INVISIBLE);
            }
            else if (ClickedFirst==9)
            {
                B_22.setVisibility(View.INVISIBLE);
            }else if (ClickedFirst==10)
            {
                B_23.setVisibility(View.INVISIBLE);
            }
            else if (ClickedFirst==11)
            {
                B_24.setVisibility(View.INVISIBLE);
            }
            else if (ClickedFirst==12)
            {
                B_31.setVisibility(View.INVISIBLE);
            }
            else if (ClickedFirst==13)
            {
                B_32.setVisibility(View.INVISIBLE);
            }
            else if (ClickedFirst==14)
            {
                B_33.setVisibility(View.INVISIBLE);
            }
            else if (ClickedFirst==15)
            {
                B_34.setVisibility(View.INVISIBLE);
            }

            if (ClickedSecond==0)
            {
                B_01.setVisibility(View.INVISIBLE);
            }
            else if (ClickedSecond==1)
            {
                B_02.setVisibility(View.INVISIBLE);
            }
            else if (ClickedSecond==2)
            {
                B_03.setVisibility(View.INVISIBLE);
            }
            else if (ClickedSecond==3)
            {
                B_04.setVisibility(View.INVISIBLE);
            }
            else if (ClickedSecond==4)
            {
                B_11.setVisibility(View.INVISIBLE);
            }
            else if (ClickedSecond==5)
            {
                B_12.setVisibility(View.INVISIBLE);
            }
            else if (ClickedSecond==6)
            {
                B_13.setVisibility(View.INVISIBLE);
            }
            else if (ClickedSecond==7)
            {
                B_14.setVisibility(View.INVISIBLE);
            }
            else if (ClickedSecond==8)
            {
                B_21.setVisibility(View.INVISIBLE);
            }
            else if (ClickedSecond==9)
            {
                B_22.setVisibility(View.INVISIBLE);
            }else if (ClickedSecond==10)
            {
                B_23.setVisibility(View.INVISIBLE);
            }
            else if (ClickedSecond==11)
            {
                B_24.setVisibility(View.INVISIBLE);
            }
            else if (ClickedSecond==12)
            {
                B_31.setVisibility(View.INVISIBLE);
            }
            else if (ClickedSecond==13)
            {
                B_32.setVisibility(View.INVISIBLE);
            }
            else if (ClickedSecond==14)
            {
                B_33.setVisibility(View.INVISIBLE);
            }
            else if (ClickedSecond==15)
            {
                B_34.setVisibility(View.INVISIBLE);
            }
            Score++;
            n_score.setText(" " + Score);

        }
        else
        {
            B_01.setImageResource(R.drawable.cardback);
            B_02.setImageResource(R.drawable.cardback);
            B_03.setImageResource(R.drawable.cardback);
            B_04.setImageResource(R.drawable.cardback);
            B_11.setImageResource(R.drawable.cardback);
            B_12.setImageResource(R.drawable.cardback);
            B_13.setImageResource(R.drawable.cardback);
            B_14.setImageResource(R.drawable.cardback);
            B_21.setImageResource(R.drawable.cardback);
            B_22.setImageResource(R.drawable.cardback);
            B_23.setImageResource(R.drawable.cardback);
            B_24.setImageResource(R.drawable.cardback);
            B_31.setImageResource(R.drawable.cardback);
            B_32.setImageResource(R.drawable.cardback);
            B_33.setImageResource(R.drawable.cardback);
            B_34.setImageResource(R.drawable.cardback);

        }

        B_01.setEnabled(true);
        B_02.setEnabled(true);
        B_03.setEnabled(true);
        B_04.setEnabled(true);

        B_11.setEnabled(true);
        B_12.setEnabled(true);
        B_13.setEnabled(true);
        B_14.setEnabled(true);

        B_21.setEnabled(true);
        B_22.setEnabled(true);
        B_23.setEnabled(true);
        B_24.setEnabled(true);

        B_31.setEnabled(true);
        B_32.setEnabled(true);
        B_33.setEnabled(true);
        B_34.setEnabled(true);

        //Check if Game is Over
        CheckEnd();
    }

    private void CheckEnd() {
        if(B_01.getVisibility()==View.INVISIBLE &&
                B_02.getVisibility()==View.INVISIBLE &&
                B_03.getVisibility()==View.INVISIBLE &&
                B_04.getVisibility()==View.INVISIBLE &&
                B_11.getVisibility()==View.INVISIBLE &&
                B_12.getVisibility()==View.INVISIBLE &&
                B_13.getVisibility()==View.INVISIBLE &&
                B_14.getVisibility()==View.INVISIBLE &&
                B_21.getVisibility()==View.INVISIBLE &&
                B_22.getVisibility()==View.INVISIBLE &&
                B_23.getVisibility()==View.INVISIBLE &&
                B_24.getVisibility()==View.INVISIBLE &&
                B_31.getVisibility()==View.INVISIBLE &&
                B_32.getVisibility()==View.INVISIBLE &&
                B_33.getVisibility()==View.INVISIBLE &&
                B_34.getVisibility()==View.INVISIBLE )
        {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainGameActivity.this);
            alertDialogBuilder.setMessage("Game Over");
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
    }


    private void frontOfCardResources() {
        i001 = R.drawable.card_1c;
        i002 = R.drawable.card_1d;
        i003 = R.drawable.card_1h;
        i004 = R.drawable.card_1s;

        i101 = R.drawable.card_2c;
        i102 = R.drawable.card_2d;
        i103 = R.drawable.card_2h;
        i104 = R.drawable.card_2s;

        i201 = R.drawable.card_3c;
        i202 = R.drawable.card_3d;
        i203 = R.drawable.card_3h;
        i204 = R.drawable.card_3s;

        i301 = R.drawable.card_4c;
        i302 = R.drawable.card_4d;
        i303 = R.drawable.card_4h;
        i304 = R.drawable.card_4s;

    }

}
