package com.example.vantrantrucphuong;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.example.vantrantrucphuong.tracnghiem.R;

public class manhinh3 extends AppCompatActivity {

    public Button btnPre, btnNext, btnResult;
    CheckBox cb_cau1,  cb_cau2,  cb_cau3,  cb_cau4;
    String ketQua = "", cau1 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinh3);
        setControl();

        setEvent();
    }
    private void setEvent() {
        final int[] count = {0};
        Intent intent = getIntent();
        cau1 = intent.getStringExtra("CAU1");

//        Toast.makeText(manhinh3.this, cau1 , Toast.LENGTH_SHORT).show();
        cb_cau1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                count = 0;
                if(cb_cau1.isChecked()) {
                    count[0]++;
                }
                else{
                    count[0] = 0;
                }
            }
        });

        cb_cau3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                count = 0;
                if(cb_cau3.isChecked()) {
                    count[0]++;
                }
                else{
                    count[0] = 0;
                }
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(manhinh3.this,manhinh4.class);
                intent.putExtra("CAU1", cau1);
                intent.putExtra("CAU2", count[0]);
                startActivity(intent);
            }
        });
        btnPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(manhinh3.this,manhinh2.class);
                startActivity(intent);
            }
        });

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(manhinh3.this,manhinh7.class);
                intent.putExtra("CAU1", cau1);
                intent.putExtra("CAU2", count[0]);
                startActivity(intent);
            }
        });
    }

    private void setControl(){
        btnPre = findViewById(R.id.btnPre);
        btnResult = findViewById(R.id.btnResult);
        btnNext = findViewById(R.id.btnNext);
        cb_cau1 = findViewById(R.id.cb_cau1);
        cb_cau2 = findViewById(R.id.cb_cau2);
        cb_cau3 = findViewById(R.id.cb_cau3);
        cb_cau4 = findViewById(R.id.cb_cau4);
    }
}
