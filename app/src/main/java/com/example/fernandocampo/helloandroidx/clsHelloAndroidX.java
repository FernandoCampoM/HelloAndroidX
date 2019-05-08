package com.example.fernandocampo.helloandroidx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Date;

import android.view.View;
import android.widget.Button;

public class clsHelloAndroidX extends AppCompatActivity implements View.OnClickListener {

     Button atrButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_andorid_x);
        atrButton = (Button) findViewById(R.id.atrButton);
        atrButton.setOnClickListener(this);
        //UpDateTime();
        atrButton.setText("Bienvenido a tu primera App");
    }
    public void UpDateTime(){
        atrButton.setText(new Date().toString());
    }


    @Override
    public void onClick(View v) {
        UpDateTime();
    }
}
