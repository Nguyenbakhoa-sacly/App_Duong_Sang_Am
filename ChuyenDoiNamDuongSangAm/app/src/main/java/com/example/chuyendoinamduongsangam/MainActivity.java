package com.example.chuyendoinamduongsangam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edt_nhap_nam_duong ;
    Button btn_chuyendoi;
    TextView txt_nam_am;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
        btn_chuyendoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xulychuyenduongquaam();
            }
        });
    }
    private void xulychuyenduongquaam() {
        String []arrCan ={"Canh","Tân","Nhâm","Quý","Giáp","Ất","Bính","Đinh","Mậu","Kỷ"};
        String []arrChi = {"Thân","Dậu","Tuất","Hợi","Tý","Sửu","Dần","Mẹo","Thìn","Tỵ","Ngọ","Mùi"};
        int namDuong=Integer.parseInt(edt_nhap_nam_duong.getText().toString());
        String can=arrCan[namDuong%10];
        String chi=arrChi[namDuong%12];
        txt_nam_am.setText(can+" "+chi);
    }
    private void addControls() {
        edt_nhap_nam_duong =(EditText) findViewById(R.id.edt_nhap_nam_duong);
        btn_chuyendoi = (Button) findViewById(R.id.btn_chuyendoi);
        txt_nam_am = (TextView) findViewById(R.id.txt_nam_am);

    }
}