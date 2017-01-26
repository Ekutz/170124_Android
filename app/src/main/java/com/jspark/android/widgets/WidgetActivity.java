package com.jspark.android.widgets;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;

public class WidgetActivity extends AppCompatActivity {

    ToggleButton toggle;
    CheckBox cbApple;
    CheckBox cbBanana;
    CheckBox cbCherry;
    RadioGroup radioG;
    Spinner sp;
    SeekBar sb;
    SeekBar sb2;
    TextView sbTV;

    String months[] = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
    ArrayList<String> year = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widget);

        toggle = (ToggleButton)findViewById(R.id.tgBtn);
        cbApple = (CheckBox)findViewById(R.id.cBox1);
        cbBanana = (CheckBox)findViewById(R.id.cBox2);
        cbCherry = (CheckBox)findViewById(R.id.cBox3);
        radioG = (RadioGroup)findViewById(R.id.rdGroup);
        sp = (Spinner)findViewById(R.id.sp);
        sb = (SeekBar)findViewById(R.id.seekBar);
        sb2 = (SeekBar)findViewById(R.id.seekBar2);
        sbTV = (TextView) findViewById(R.id.seekTv);

        toggle.setOnCheckedChangeListener(toggleListener);
        cbApple.setOnCheckedChangeListener(checkBoxListener);
        cbBanana.setOnCheckedChangeListener(checkBoxListener);
        cbCherry.setOnCheckedChangeListener(checkBoxListener);


        //라디오 그룹
        radioG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                String name = "";
                switch(id) {
                    case R.id.rdBtn1 :
                        name = "Anaconda";
                        break;
                    case R.id.rdBtn2 :
                        name = "Bear";
                        break;
                    case R.id.rdBtn3 :
                        name = "Cat";
                        break;
                }
                Toast.makeText(WidgetActivity.this, name+" 버튼 선택됨", Toast.LENGTH_SHORT).show();
            }
        });

        int nowYear = 2017;
        for(int i=0;i<100;i++) {
            year.add(String.valueOf(nowYear));
            nowYear--;
        }

        // 스피너
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, year); // Context, 스피너에서 쓸 레이아웃, 데이터
        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(WidgetActivity.this, "선택된 년도 : "+ year.get(i), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                sbTV.setText(i+"%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(WidgetActivity.this, "start", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(WidgetActivity.this, "finish", Toast.LENGTH_SHORT).show();
            }
        });

    }

    CompoundButton.OnCheckedChangeListener toggleListener = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            Toast.makeText(WidgetActivity.this, "토글 상태 : "+b, Toast.LENGTH_SHORT).show();
        }
    };

    CompoundButton.OnCheckedChangeListener checkBoxListener = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            if(b==true) {
                String fruit = "";
                switch (compoundButton.getId()) {
                    case R.id.cBox1:
                        fruit = "Apple";
                        break;
                    case R.id.cBox2:
                        fruit = "Banana";
                        break;
                    case R.id.cBox3:
                        fruit = "Cherry";
                        break;
                }
                Toast.makeText(WidgetActivity.this, "I Like " + fruit, Toast.LENGTH_SHORT).show();
            }
        }
    };
}
