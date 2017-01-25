package com.jspark.android.widgets;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txt, txtPre;

    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero;
    Button btnP, btnM, btnMu, btnD, btnR, btnC;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        txt = (TextView)findViewById(R.id.tvResult);
        txtPre = (TextView)findViewById(R.id.preview);

        btnOne = (Button)findViewById(R.id.btn1);
        btnTwo = (Button)findViewById(R.id.btn2);
        btnThree = (Button)findViewById(R.id.btn3);
        btnFour = (Button)findViewById(R.id.btn4);
        btnFive = (Button)findViewById(R.id.btn5);
        btnSix = (Button)findViewById(R.id.btn6);
        btnSeven = (Button)findViewById(R.id.btn7);
        btnEight = (Button)findViewById(R.id.btn8);
        btnNine = (Button)findViewById(R.id.btn9);
        btnZero = (Button)findViewById(R.id.btn0);

        btnP = (Button)findViewById(R.id.btnPlus);
        btnM = (Button)findViewById(R.id.btnMinus);
        btnMu = (Button)findViewById(R.id.btnMulti);
        btnD = (Button)findViewById(R.id.btnDiv);
        btnC = (Button)findViewById(R.id.btnCancle);
        btnR = (Button)findViewById(R.id.btnRun);

        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener(this);
        btnNine.setOnClickListener(this);
        btnZero.setOnClickListener(this);

        btnP.setOnClickListener(this);
        btnM.setOnClickListener(this);
        btnMu.setOnClickListener(this);
        btnD.setOnClickListener(this);

        btnC.setOnClickListener(this);
        btnR.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1 :
                txtPre.setText(txtPre.getText() + "1");
                txt.setText(txt.getText() + "1");
                break;
            case R.id.btn2 :
                txtPre.setText(txtPre.getText() + "2");
                txt.setText(txt.getText() + "2");
                break;
            case R.id.btn3 :
                txtPre.setText(txtPre.getText() + "3");
                txt.setText(txt.getText() + "3");
                break;
            case R.id.btn4 :
                txtPre.setText(txtPre.getText() + "4");
                txt.setText(txt.getText() + "4");
                break;
            case R.id.btn5 :
                txtPre.setText(txtPre.getText() + "5");
                txt.setText(txt.getText() + "5");
                break;
            case R.id.btn6 :
                txtPre.setText(txtPre.getText() + "6");
                txt.setText(txt.getText() + "6");
                break;
            case R.id.btn7 :
                txtPre.setText(txtPre.getText() + "7");
                txt.setText(txt.getText() + "7");
                break;
            case R.id.btn8 :
                txtPre.setText(txtPre.getText() + "8");
                txt.setText(txt.getText() + "8");
                break;
            case R.id.btn9 :
                txtPre.setText(txtPre.getText() + "9");
                txt.setText(txt.getText() + "9");
                break;
            case R.id.btn0 :
                txtPre.setText(txtPre.getText() + "0");
                txt.setText(txt.getText() + "0");
                break;

            case R.id.btnPlus :
                txtPre.setText(txtPre.getText() + "+");
                txt.setText("");
                break;
            case R.id.btnMinus :
                txtPre.setText(txtPre.getText() + "-");
                txt.setText("");
                break;
            case R.id.btnMulti :
                txtPre.setText(txtPre.getText() + "*");
                txt.setText("");
                break;
            case R.id.btnDiv :
                txtPre.setText(txtPre.getText() + "/");
                txt.setText("");
                break;

            case R.id.btnCancle :
                txtPre.setText("");
                txt.setText("");
                break;
            case R.id.btnRun :
                runBtn(txtPre.getText().toString());
                break;
        }
    }

    public void runBtn(String str) {

    }
}
