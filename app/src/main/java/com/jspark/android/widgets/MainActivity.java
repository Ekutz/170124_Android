package com.jspark.android.widgets;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn;
    Button btn2;
    Button btn3;
    Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.btnGrid);
        btn.setOnClickListener(this);

        btn2 = (Button)findViewById(R.id.btnCal);
        btn2.setOnClickListener(this);

        btn3 = (Button)findViewById(R.id.btnWidget);
        btn3.setOnClickListener(this);

        btn4 = (Button)findViewById(R.id.btnUnit);
        btn4.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnGrid :
                Intent i = new Intent(MainActivity.this, GridActivity.class);
                startActivity(i);
                break;
            case R.id.btnCal :
                i = new Intent(MainActivity.this, CalculatorActivity.class);
                startActivity(i);
                break; //
            case R.id.btnWidget :
                i = new Intent(MainActivity.this, WidgetActivity.class);
                startActivity(i);
                break;
            case R.id.btnUnit :
                i = new Intent(MainActivity.this, UnitActivity.class);
                startActivity(i);
                break;
        }
    }
}
