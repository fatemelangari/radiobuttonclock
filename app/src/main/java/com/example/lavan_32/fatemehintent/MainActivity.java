package com.example.lavan_32.fatemehintent;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Date;
public class MainActivity extends AppCompatActivity implements MediaPlayer.OnCompletionListener {

    private TextView hours, minute;
    private Button but1;
    private Button but2;
    private int[] sot = {R.raw.saat, R.raw.doO, R.raw.panjah, R.raw.daghigheh, 0};
    private int loc = 0;

    int[] sot1 = {
    R.raw.yek, R.raw.do, R.raw.se, R.raw.chahar,
    R.raw.panj, R.raw.shesh, R.raw.haft, R.raw.hasht,
    R.raw.noh, R.raw.dah, R.raw.yazdah, R.raw.davazdah,
    R.raw.sizdah, R.raw.chahardah, R.raw.panzdah, R.raw.shanzdah,
    R.raw.hefdah, R.raw.hejdah, R.raw.nozdah, R.raw.bist,0

};

int[] sot1o = {
        R.raw.yeko, R.raw.doO, R.raw.seo, R.raw.chaharo,
        R.raw.panjo, R.raw.shesho, R.raw.hafto, R.raw.hashto,
        R.raw.noho, R.raw.daho, R.raw.yazdaho, R.raw.davazdaho,
        R.raw.sizdaho, R.raw.chahardaho, R.raw.panzdaho, R.raw.shanzdaho,
        R.raw.hefdaho, R.raw.hejdaho, R.raw.nozdaho, R.raw.bisto,0


        };

        int[] sot10o ={
        R.raw.daho, R.raw.bisto, R.raw.co, R.raw.chehelo,
        R.raw.panjaho,0
        };

        int[] sot10 = {

        0,
        R.raw.dah, R.raw.bist, R.raw.c, R.raw.chehel,
        R.raw.panjah,0
        };



private int[] sots = {R.raw.saat, R.raw.r2o, R.raw.r50, R.raw.daghigheh, 0};
private int locs = 0;
        int[] sots1 = {

        0,
        R.raw.r1, R.raw.r2, R.raw.r3, R.raw.r4,
        R.raw.r5, R.raw.r6, R.raw.r7, R.raw.r8,
        R.raw.r9, R.raw.r10, R.raw.r11, R.raw.r12,
        R.raw.r13, R.raw.r14, R.raw.r15, R.raw.r16,
        R.raw.r17, R.raw.r18, R.raw.r19, R.raw.r20,

        };

        int[] sots1o = {

        0,
        R.raw.r1o, R.raw.r2o, R.raw.r3o, R.raw.r4o,
        R.raw.r5o, R.raw.r6o, R.raw.r7o, R.raw.r8o,
        R.raw.r9o, R.raw.r10o, R.raw.r11o, R.raw.r12o,
        R.raw.r13o, R.raw.r14o, R.raw.r15o, R.raw.r16o,
        R.raw.r17o, R.raw.r18o, R.raw.r19o, R.raw.r20o,


        };

        int[] sots10o = {

        0,
        R.raw.r10o, R.raw.r20o, R.raw.r30o, R.raw.r40o,
        R.raw.r50o
        };
        int[] sots10 = {

        0,
        R.raw.r10, R.raw.r20, R.raw.r30, R.raw.r40,
        R.raw.r50
        };

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hours = (TextView) findViewById(R.id.tx1);
        minute = (TextView) findViewById(R.id.tx2);
        but1 = (Button) findViewById(R.id.b1);
        but2= (Button)findViewById(R.id.b2);

        Typeface t1 = Typeface.createFromAsset(getAssets(), "fonts/segment7.otf");
        hours.setTypeface(t1);
        minute.setTypeface(t1);
        but1.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {


        Date da = new Date();
        int h = d.getHours();
        int m = d.getMinutes();
        String ft = String.format("%2d", h);
        String ln = String.format("%2d", m);
        hours.setText(ft);
        minute.setText(ln);

        if ((h == 0))
        h = 12;
        else if (h > 12)
        h = h - 12;

        int i = 0;

        sot[i++] = m == 0 ? sot1[h] : sot1o[h];
        if (m < 20)
        sot[i++] = sot1[m];
        else {
        int m10 = m / 10;
        int m1 = m % 10;
        sot[i++] = m1 == 0? sot10[m10] : sot10o[m10];
        if ((m1 != 0))
        sot[i++] = sot1[m1];
        }
        int j = 0;

        sots[j++] = m == 0 ? sots1[h] : sots1o[h];
        if (m < 20)
        sots[j++] = sots1[m];
        else {
        int m10 = m / 10;
        int m1 = m % 10;
        sots[j++] = m1 == 0 ? sots10[m10] : sots10o[m10];
        if ((m1 != 0))
        sots[j++] = sot1[m1];
        }


        button2.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {


        Intent intent = new Intent (MainActivity.this,Main2Activity.class);
        startActivity(intent);


        }
        });



        MediaPlayer fm = MediaPlayer.create(MainActivity.this, R.raw.saat);
        fm.setOnCompletionListener(MainActivity.this);
        fm.start();

        }
        });


        }

@Override
public void onCompletion(MediaPlayer fm) {

        if (sot[loc] != 0) {
        MediaPlayer fm1 = MediaPlayer.create(this, sot[loc]);
        index++;
        fm1.setOnCompletionListener(this);
        fm1.start();

        }
        }
        }


