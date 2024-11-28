package com.example.parking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class AdminActivity extends AppCompatActivity {
    Button AdminLogut;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        AdminLogut=findViewById(R.id.AdminLogout);
        mAuth = FirebaseAuth.getInstance();

        AdminLogut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    mAuth.signOut();
                    Intent intent=new Intent(AdminActivity.this,MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                    finish();
                }
                catch (Exception e){
                    Toast.makeText(AdminActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    System.out.println(e.getMessage());
                    Log.d("logout",e.getMessage());
                }
//
            }
        });


    }
}