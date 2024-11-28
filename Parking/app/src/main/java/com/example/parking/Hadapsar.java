package com.example.parking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;;

public class Hadapsar extends AppCompatActivity {

    Button back ;
    Button JSPM_Map;
    //18.473133450800578, 73.93558103000676
//    18.456968422009282, 73.82463612403969  18.457914876935252, 73.82467903938225
    double a=18.456968422009282;
    double b=73.82463612403969;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadapsar);

        TextView JSPM_Collage=findViewById(R.id.jspm);
        TextView Handewadi=findViewById(R.id.handewadi);
        TextView Gadital=findViewById(R.id.gadi_tal);
        Button back = findViewById(R.id.back);


        JSPM_Map=findViewById(R.id.JSPM_locate);

        JSPM_Map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url;
                // url=("http://www.google.com/maps/place"+a,b);

//                gotoUrl("https://www.google.com/maps/place/Jspm+college/@18.4734642,73.9292725,17z/data=!3m1!4b1!4m6!3m5!1s0x3bc2eba711d36e8b:0xc79294ccd7b257a5!8m2!3d18.4734591!4d73.9318474!16s%2Fg%2F11v0br3x63?entry=ttu");
                //gotoUrl("http://www.google.com/maps/place/a,b");
                openMap(a,b);
            }
        });

        JSPM_Collage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Parking_layout.class);
                startActivity(intent);
                finish();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), slot_Activity.class);
                startActivity(intent);
                finish();
            }
        });
    }
    void openMap(double a,double b){
        String geoUri="http://www.google.com/maps/place/"+a+","+b;
        // Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(geoUri)));
        //   Intent mapIntent=new Intent(Intent.ACTION_VIEW,Uri.parse(geoUri));

//        if (Intent.resolveActivity(getPackageManager())!=null){
//            startActivity(Intent);
//        }
    }
}