package com.popland.pop.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView txtv, txtvSo;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent i = new Intent(Activity2.this, MainActivity.class);//dữ liệu bị xóa khi chuyển
                startActivity(i);// còn nút trở về "<-" không thay đổi dữ liệu
            }
        });
        txtv = (TextView) findViewById(R.id.TV);
        txtvSo = (TextView)findViewById(R.id.TVso);
        btn = (Button)findViewById(R.id.BTN);
        Bundle bd = getIntent().getExtras();//Bundle quản lí putExtra và getExtras
        if(bd != null){
            String ten = bd.getString("hoten");//dữ liệu kiểu nào lấy dữ liệu kiểu đó
            txtv.setText(ten);
            Float nu = bd.getFloat("maso");
            txtvSo.setText(String.valueOf(nu));
        }
    }

}