package com.example.ad_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonActividad1;
    Button buttonActividad2;
    Button buttonActividad3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonActividad1 = (Button) findViewById(R.id.buttonActividad1);
        buttonActividad2 = (Button) findViewById(R.id.buttonActividad2);
        buttonActividad3 = (Button) findViewById(R.id.buttonActividad3);

        buttonActividad1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent();
                    }
                }
        );

    }

}