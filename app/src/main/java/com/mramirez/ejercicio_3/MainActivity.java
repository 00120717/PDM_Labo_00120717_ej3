package com.mramirez.ejercicio_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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



    }
}
