package com.example.parking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class slot_Activity extends AppCompatActivity {

    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slot);
        TextView Hadapsar=findViewById(R.id.Hadapsar);
        TextView Katraj=findViewById(R.id.Katraj);
        TextView Swargate=findViewById(R.id.Swargate);
        TextView Pimpri_chinvawad=findViewById(R.id.Pimpri_chinvawad);
        Button logout=  findViewById(R.id.logout);;
        //logout=  findViewById(R.id.logout);
        mAuth = FirebaseAuth.getInstance();

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    mAuth.signOut();
                    Intent intent=new Intent(slot_Activity.this,MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                    finish();
                }
                catch (Exception e){
                    Toast.makeText(slot_Activity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    System.out.println(e.getMessage());
                    Log.d("logout",e.getMessage());
                }
//
            }
        });

        Hadapsar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h=new Intent(getApplicationContext(), com.example.parking.Hadapsar.class);
                startActivity(h);
                finish();
            }
        });

        Katraj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h=new Intent(getApplicationContext(), com.example.parking.Hadapsar.class);
                startActivity(h);
                finish();
            }
        });

        Swargate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h=new Intent(getApplicationContext(), com.example.parking.Hadapsar.class);
                startActivity(h);
                finish();
            }
        });

        Pimpri_chinvawad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h=new Intent(getApplicationContext(), com.example.parking.Hadapsar.class);
                startActivity(h);
                finish();
            }
        });

    }
}