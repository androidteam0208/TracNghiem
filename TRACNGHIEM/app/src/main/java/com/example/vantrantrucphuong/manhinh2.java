package com.example.vantrantrucphuong;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.vantrantrucphuong.tracnghiem.R;

public class manhinh2 extends AppCompatActivity {

    TextView txtCauHoi;
    RadioGroup radioGroup_1;
    RadioButton rb_mh2_1_a, rb_mh2_1_b, rb_mh2_1_c, rb_mh2_1_d;
    Button btnPre, btnResult, btnNext;
    String ketQua = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinh2);
        setControl();
        setEvent();
    }

    private void setEvent() {
        radioGroup_1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.rb_mh2_1_a){
                    ketQua = "Đúng";
                    Toast.makeText(manhinh2.this, "Đúng" , Toast.LENGTH_SHORT).show();
                }
                else{
                    ketQua = "Sai";
                }
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(manhinh2.this,manhinh3.class);
                intent.putExtra("CAU1", ketQua);
                startActivity(intent);
            }
        });
        btnPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(manhinh2.this,MainActivity.class);
                startActivity(intent);
            }
        });

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(manhinh2.this,manhinh7.class);
                Toast.makeText(manhinh2.this, ketQua , Toast.LENGTH_SHORT).show();
                intent.putExtra("CAU1", ketQua);
                startActivity(intent);
            }
        });



    }

    private void setControl(){
        txtCauHoi = findViewById(R.id.txtCauHoi);
        radioGroup_1 = findViewById(R.id.radioGroup_1);
        rb_mh2_1_a = findViewById(R.id.rb_mh2_1_a);
        rb_mh2_1_b = findViewById(R.id.rb_mh2_1_b);
        rb_mh2_1_c = findViewById(R.id.rb_mh2_1_c);
        rb_mh2_1_d = findViewById(R.id.rb_mh2_1_d);
        btnPre = findViewById(R.id.btnPre);
        btnResult = findViewById(R.id.btnResult);
        btnNext = findViewById(R.id.btnNext);
    }

}
