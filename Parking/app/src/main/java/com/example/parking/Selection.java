package com.example.parking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Selection extends AppCompatActivity {

    Button AdmonLogin,CustomerLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
        AdmonLogin=findViewById(R.id.AdminLogin);
        CustomerLogin=findViewById(R.id.CustomerLogin);

        AdmonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Adminlogin=new Intent(Selection.this,AdminLogin.class);
                startActivity(Adminlogin);
                finish();
            }
        });

        CustomerLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Adminlogin=new Intent(Selection.this,MainActivity.class);
                startActivity(Adminlogin);
                finish();
            }
        });

    }
}