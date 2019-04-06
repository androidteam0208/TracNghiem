package com.example.vantrantrucphuong;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

import com.example.vantrantrucphuong.tracnghiem.R;

public class manhinh5 extends AppCompatActivity {
    Button btnPre, btnResult, btnNext;
    ToggleButton toggleButton1, toggleButton2, toggleButton3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinh5);
        setControl();
        setEvent();
    }

    private void setControl(){
        btnPre = findViewById(R.id.btnPre);
        btnResult = findViewById(R.id.btnResult);
        btnNext = findViewById(R.id.btnNext);
        toggleButton1 = findViewById(R.id.toggleButton1);
        toggleButton2 = findViewById(R.id.toggleButton2);
        toggleButton3 = findViewById(R.id.toggleButton3);

    }

    private void setEvent() {
        final int[] count = {0};
        Intent intent = getIntent();
        final String cau1 = intent.getStringExtra("CAU1");
        final int cau2 = intent.getIntExtra("CAU2", 0);
        final int cau3 = intent.getIntExtra("CAU3", 0);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(manhinh5.this,manhinh6.class);
                intent.putExtra("CAU1", cau1);
                intent.putExtra("CAU2", cau2);
                intent.putExtra("CAU3", cau3);
                intent.putExtra("CAU4", count[0]);
                startActivity(intent);
            }
        });
        btnPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(manhinh5.this,manhinh4.class);
                startActivity(intent);
            }
        });
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(toggleButton1.isChecked()){
                    count[0]++;
                }
                if(!toggleButton2.isChecked()){
                    count[0]++;
                }
                if(!toggleButton3.isChecked()){
                    count[0]++;
                }
                Intent intent = new Intent(manhinh5.this,manhinh7.class);
                intent.putExtra("CAU1", cau1);
                intent.putExtra("CAU2", cau2);
                intent.putExtra("CAU3", cau3);
                intent.putExtra("CAU4", count[0]);
                startActivity(intent);
            }
        });
    }
}