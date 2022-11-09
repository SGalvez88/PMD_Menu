package com.example.ad_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

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

        buttonActividad1.setOnClickListener(this);
        buttonActividad2.setOnClickListener(this);
        buttonActividad3.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buttonActividad1:
                Intent intent = new Intent(this, Activity1.class);
                startActivity(intent);
                break;
            case R.id.buttonActividad2:
                Intent intent2 = new Intent(this, Activity2.class);
                break;
            case R.id.buttonActividad3:
                Intent intent3 = new Intent(this, Activity3.class);
                break;
        }
    }
}