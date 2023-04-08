package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    RadioButton rg1,rg2,rg3,rg4;
    LinearLayout layout;
    Switch switc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg1 = findViewById(R.id.rg1);
        rg2 = findViewById(R.id.rg2);
        rg3 = findViewById(R.id.rg3);
        rg4 = findViewById(R.id.rg4);
        layout = findViewById(R.id.linearlayout);
        switc = findViewById(R.id.switch1);
    }


    public void button1(View view) {
        if(!switc.isChecked()){
            if(rg1.isChecked()){
            layout.setBackgroundColor(Color.RED);
            }
            else if(rg2.isChecked()){
                layout.setBackgroundColor(Color.BLUE);
            }
            else if(rg3.isChecked()){
                layout.setBackgroundColor(Color.YELLOW);
            }
            else if(rg4.isChecked()){
                layout.setBackgroundColor(Color.GREEN);
            }
        }
    }

    public void rg11(View view) {
        if(rg1.isChecked()&&switc.isChecked()){
            layout.setBackgroundColor(Color.RED);
        }
    }

    public void rg22(View view) {
        if(rg2.isChecked()&&switc.isChecked()){
            layout.setBackgroundColor(Color.BLUE);
        }
    }

    public void rg33(View view) {
        if(rg3.isChecked()&&switc.isChecked()){
            layout.setBackgroundColor(Color.YELLOW);
        }
    }

    public void rg44(View view) {
        if(rg4.isChecked()&&switc.isChecked()){
            layout.setBackgroundColor(Color.GREEN);
        }
    }
}