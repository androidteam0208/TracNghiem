package com.example.vantrantrucphuong;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

import com.example.vantrantrucphuong.tracnghiem.R;

public class manhinh6 extends AppCompatActivity {
    Button btnPre, btnResult, btnNext;
    Switch switch1, switch2, switch3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinh6);
        setControl();
        setEvent();
    }

    private void setControl(){
        btnPre = findViewById(R.id.btnPre);
        btnResult = findViewById(R.id.btnResult);
        btnNext = findViewById(R.id.btnNext);
        switch1 = findViewById(R.id.switch1);
        switch2 = findViewById(R.id.switch2);
        switch3 = findViewById(R.id.switch3);

    }

    private void setEvent() {
        final int[] count = {0};
        Intent intent = getIntent();
        final String cau1 = intent.getStringExtra("CAU1");
        final int cau2 = intent.getIntExtra("CAU2", 0);
        final int cau3 = intent.getIntExtra("CAU3", 0);
        final int cau4 = intent.getIntExtra("CAU4", 0);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(manhinh6.this,manhinh7.class);
                intent.putExtra("CAU1", cau1);
                intent.putExtra("CAU2", cau2);
                intent.putExtra("CAU4", cau4);
                intent.putExtra("CAU3", cau3);
                intent.putExtra("CAU5", count[0]);
                startActivity(intent);
            }
        });
        btnPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(manhinh6.this,manhinh5.class);
                startActivity(intent);
            }
        });
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(switch1.isChecked()){
                    count[0]++;
                }
                if(!switch2.isChecked()){
                    count[0]++;
                }
                if(switch3.isChecked()){
                    count[0]++;
                }
                Intent intent = new Intent(manhinh6.this,manhinh7.class);
                intent.putExtra("CAU1", cau1);
                intent.putExtra("CAU2", cau2);
                intent.putExtra("CAU4", cau4);
                intent.putExtra("CAU3", cau3);
                intent.putExtra("CAU5", count[0]);
                startActivity(intent);
            }
        });
    }
}