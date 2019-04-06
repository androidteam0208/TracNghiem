package com.example.vantrantrucphuong;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.vantrantrucphuong.tracnghiem.R;

public class manhinh7 extends AppCompatActivity {
    TextView txtCau1, txtCau2, txtCau3, txtCau4, txtCau5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinh7);
        setControl();
        setEvent();
    }

    private void setEvent() {
        Intent intent = getIntent();
        String cau1 = intent.getStringExtra("CAU1");
        int cau2 = intent.getIntExtra("CAU2", 0);
        int cau3 = intent.getIntExtra("CAU3", 0);
        int cau4 = intent.getIntExtra("CAU4", 0);
        int cau5 = intent.getIntExtra("CAU5", 0);
        txtCau1.setText(txtCau1.getText() + " " + cau1 );
        txtCau2.setText(txtCau2.getText() + " " + cau2 + " câu đúng");
        txtCau3.setText(txtCau3.getText() + " " + cau3 + " câu đúng");
        txtCau4.setText(txtCau4.getText() + " " + cau4 + " câu đúng");
        txtCau5.setText(txtCau5.getText() + " " + cau5 + " câu đúng");
    }

    private void setControl() {
        txtCau1 = findViewById(R.id.txtViewCau1);
        txtCau2 = findViewById(R.id.txtViewCau2);
        txtCau3 = findViewById(R.id.txtViewCau3);
        txtCau4 = findViewById(R.id.txtViewCau4);
        txtCau5 = findViewById(R.id.txtViewCau5);
    }


}
