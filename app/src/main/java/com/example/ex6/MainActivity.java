package com.example.ex6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    ImageView iV1;
    ImageView iV2;
    ImageView iV3;
    TextView tV11;
    TextView tV12;
    EditText eT1;
    TextView tV21;
    TextView tV22;
    EditText eT2;
    TextView tV31;
    TextView tV32;
    EditText eT3;
    Random rnd = new Random();
    int rnd1,rnd2,sum,counter;
    double avg;
    boolean click1= false;
    boolean click2= false;
    boolean click3= false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        iV1 = findViewById(R.id.iV1);
        iV2 = findViewById(R.id.iV2);
        iV3 = findViewById(R.id.iV3);
        tV11 = findViewById(R.id.tV11);
        tV12 = findViewById(R.id.tV12);
        tV21 = findViewById(R.id.tV21);
        tV22 = findViewById(R.id.tV22);
        tV31 = findViewById(R.id.tV31);
        tV32 = findViewById(R.id.tV32);
        eT1 = findViewById(R.id.eT1);
        eT2 = findViewById(R.id.eT2);
        eT3 = findViewById(R.id.eT3);
        rnd1= rnd.nextInt(89)+10;
        rnd2= rnd.nextInt(89)+10;
        tV11.setText(String.valueOf(rnd1));
        tV12.setText(String.valueOf(rnd2));

    }

    public void pressed1(View view) {
        if(click1 == false && click2== false && click3== false ){
            String st1 = eT1.getText().toString();
            int var = Integer.parseInt(st1);
            if(var==rnd2+rnd1){
                iV1.setImageResource(R.drawable.v);
                counter++;
            }
            else{
                iV1.setImageResource(R.drawable.x);
            }
            sum =rnd2+rnd1;
            tV21.setText(String.valueOf(sum));
            click2 = true;
            rnd1= rnd.nextInt(89)+10;
            tV22.setText(String.valueOf(rnd1));
            btn1.setText("clicked");
            btn2.setText("click");

        }

    }

    public void pressed2(View view) {
        if(click1 == false && click2== true && click3== false ){
            String st1 = eT2.getText().toString();
            int var = Integer.parseInt(st1);
            if(var==sum+rnd1){
                iV2.setImageResource(R.drawable.v);
                counter++;
            }
            else{
                iV2.setImageResource(R.drawable.x);
            }
            sum =sum+rnd1;
            tV31.setText(String.valueOf(sum));
            click2 = false;
            click3 = true;
            rnd1= rnd.nextInt(89)+10;
            tV32.setText(String.valueOf(rnd1));
            btn2.setText("clicked");
            btn3.setText("click");
        }
    }

    public void pressed3(View view) {
        if(click1 == false && click2== false && click3== true ){
            String st1 = eT3.getText().toString();
            int var = Integer.parseInt(st1);
            if(var==sum+rnd1){
                iV3.setImageResource(R.drawable.v);
                counter++;
            }
            else{
                iV3.setImageResource(R.drawable.x);
            }
            btn3.setText("clicked");
            avg = counter * (1/3.0)*100;
            Toast.makeText(this,counter + "/3" + " "+ avg,Toast.LENGTH_LONG).show();
        }
    }

    public void reset(View view) {
       click1= false;
       click2= false;
       click3= false;
       tV11.setText("TextView");
       tV12.setText("TextView");
       tV21.setText("TextView");
       tV22.setText("TextView");
       tV31.setText("TextView");
       tV32.setText("TextView");
       iV1.setImageResource(0);
       iV2.setImageResource(0);
       iV3.setImageResource(0);
       btn2.setText("pressed");
       btn3.setText("pressed");
       rnd1= rnd.nextInt(89)+10;
       rnd2= rnd.nextInt(89)+10;
       tV11.setText(String.valueOf(rnd1));
       tV12.setText(String.valueOf(rnd2));


    }
}
