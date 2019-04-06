package com.example.vantrantrucphuong;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;

import com.example.vantrantrucphuong.tracnghiem.R;

public class manhinh4 extends AppCompatActivity {

    public Button btnPre, btnNext, btnResult;
    Spinner spinA, spinB, spinC;

//    String spin1[] = {"1","2"};
//    ArrayAdapter<String> spin1Adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinh4);
        setControl();
        setEvent();
    }

    private void setControl(){
        btnPre = findViewById(R.id.btnPre);
        btnResult = findViewById(R.id.btnResult);
        btnNext = findViewById(R.id.btnNext);
        spinA = findViewById(R.id.spinA);
        spinB = findViewById(R.id.spinB);
        spinC = findViewById(R.id.spinC);
//        spin1Adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, spin1);
//        spinA.setAdapter(spin1Adapter);
    }

    private void setEvent() {
        Intent intent = getIntent();
        final String cau1 = intent.getStringExtra("CAU1");
        final int cau2 = intent.getIntExtra("CAU2", 0);
        final int[] count = {0};

        spinA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position == 1){
                    count[0]++;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinB.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position == 1){
                    count[0]++;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position == 1){
                    count[0]++;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(manhinh4.this,manhinh5.class);
                intent.putExtra("CAU1", cau1);
                intent.putExtra("CAU2", cau2);
                intent.putExtra("CAU3", count[0]);
                startActivity(intent);
            }
        });
        btnPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(manhinh4.this,manhinh3.class);
                startActivity(intent);
            }
        });
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(manhinh4.this,manhinh7.class);
                intent.putExtra("CAU1", cau1);
                intent.putExtra("CAU2", cau2);
                intent.putExtra("CAU3", count[0]);
                startActivity(intent);
            }
        });
    }
}
