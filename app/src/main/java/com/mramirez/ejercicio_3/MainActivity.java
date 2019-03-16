package com.mramirez.ejercicio_3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout ly1,ly2,ly3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ly1 = findViewById(R.id.ly1);
        ly2 = findViewById(R.id.ly2);
        ly3 = findViewById(R.id.ly3);

        /*Colores */

        final int[] red = {Color.rgb(255,0,0),Color.rgb(200,0,0),Color.rgb(150,0,0),Color.rgb(100,0,0),Color.rgb(50,0,0),Color.rgb(25,0,0)};
        final int[] green = {Color.rgb(0,255,0),Color.rgb(0,200,0),Color.rgb(0,150,0),Color.rgb(0,100,0),Color.rgb(0,50,0),Color.rgb(0,25,0)};
        final int[] blue = {Color.rgb(0,0,255),Color.rgb(0,0,200),Color.rgb(0,0,150),Color.rgb(0,0,100),Color.rgb(0,0,50),Color.rgb(0,0,25)};



        ly1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ly1.setBackgroundColor(red[(int) Math.floor(Math.random()*6)]);
            }


        });

        ly2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ly2.setBackgroundColor(green[(int) Math.floor(Math.random()*6)]);
            }

        });

        ly3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ly3.setBackgroundColor(blue[(int) Math.floor(Math.random()*6)]);
            }


        });


    }
}

/*
 * mLinearLayout = findViewById
 * */
/*
        @Override
        public void onClick(View v){
            int viewId = v.getId();
            Log.
        }
*/
