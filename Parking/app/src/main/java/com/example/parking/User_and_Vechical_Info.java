package com.example.parking;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class User_and_Vechical_Info extends AppCompatActivity {

    TextView fname;
    TextView Tprice;
    TextView phNo;
    TextView emailId;
    TextView vno;
    TextView aDate;
    TextView aTime;
    TextView dDate;
    TextView dTime;

    Button Submit,TpriceB,Pay;
    FirebaseFirestore db;
    ImageView car;
    private boolean shouldChangeImage = false;

    private HashMap<String, Integer> imageMap;
    Spinner arrivalAmPmSpinner, departureAmPmSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_and_vechical_info);


        db = FirebaseFirestore.getInstance();
        fname = findViewById(R.id.fname);
        phNo = findViewById(R.id.phno);
        emailId = findViewById(R.id.email);
        vno = findViewById(R.id.vno);
        aDate = findViewById(R.id.adate);
        aTime = findViewById(R.id.atime);
        dDate = findViewById(R.id.ddate);
        dTime = findViewById(R.id.dtime);
        Submit = findViewById(R.id.submit);
        Tprice=findViewById(R.id.tprice);
        TpriceB=findViewById(R.id.TpriceB);
//        Pay=findViewById(R.id.pay);

//        Pay.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent pay=new Intent(User_and_Vechical_Info.this,Payment.class);
//                startActivity(pay);
//                finish();
//            }
//        });


//        shouldChangeImage = getIntent().getBooleanExtra("changeImage", false);
//
//        String imageChangeName = getIntent().getStringExtra("imageChangeName");

//        if (imageMap.containsKey(imageChangeName)) {
//            int imageResource = imageMap.get(imageChangeName);
//            car.setImageResource(imageResource);
////            Details();
//      }










        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(User_and_Vechical_Info.this, "Button Clicked", Toast.LENGTH_SHORT).show();




                String Fname = fname.getText().toString();
                String PhNo = phNo.getText().toString();
                String Email = emailId.getText().toString();
                String Vehicle_No = vno.getText().toString();
                String ADate = aDate.getText().toString();
                String ATime = aTime.getText().toString();
                String DDate = dDate.getText().toString();
                String DTime = dTime.getText().toString();
                Map<String, Object> user = new HashMap<>();
                user.put("Phone no", PhNo);
                user.put("Email Id", Email);
                user.put("Vehicle No", Vehicle_No);
                user.put("Arrival Time ", ATime);
                user.put("Arrival Date ", ADate);
                user.put("Departure Time", DTime);
                user.put("Departure Date", DDate);


                db.collection("User")
                        .add(user)
                        .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                            @Override
                            public void onSuccess(DocumentReference documentReference) {
                                Toast.makeText(User_and_Vechical_Info.this, "Successful", Toast.LENGTH_SHORT).show();
                            }

                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(User_and_Vechical_Info.this, "Failed", Toast.LENGTH_SHORT).show();
                            }
                        });

//                Intent intent=new Intent(getApplicationContext(), slot_Activity.class);
//                intent.putExtra("bookingStatus","success");
//                startActivity(intent);
//                finish();

                // In UserClass where you want to send the boolean value
//                boolean isBookingDone = true; // or false based on your condition

//                Intent intent = new Intent(User_and_Vechical_Info.this, Parking_layout.class);
                Intent intent = new Intent(User_and_Vechical_Info.this, Payment.class);
                startActivity(intent);


//                intent.putExtra("bookedCar", bookedCar);
//                intent.putExtra("bookingStatus", isBookingDone);
//                startActivity(intent);
//                finish();

//                Calculate_price();



            }
        });

        TpriceB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculate_price();
            }
        });





//        Intent intent = getIntent();
//        String receivedString = intent.getStringExtra("EXTRA_STRING");
//
//        if ("Car1".equals(receivedString)) {
//            // Toast.makeText(this, "String is equal to 'Hello from ActivityA'", Toast.LENGTH_SHORT).show();
//
//        }
//        if ("Car2".equals(receivedString)) {
//            // Toast.makeText(this, "String is equal to 'Hello from ActivityA'", Toast.LENGTH_SHORT).show();
//            Details();
//        }

//        if (getIntent().getBooleanExtra("changeImage", false)) {
//            // Change the image to red in ActivityB
//
//
//
//
//
//        }
    }



//    public void Details() {
//        Submit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(User_and_Vechical_Info.this, "Button Clicked", Toast.LENGTH_SHORT).show();
//
//
//
//
//                String Fname = fname.getText().toString();
//                String PhNo = phNo.getText().toString();
//                String Email = emailId.getText().toString();
//                String Vehicle_No = vno.getText().toString();
//                String ADate = aDate.getText().toString();
//                String ATime = aTime.getText().toString();
//                String DDate = dDate.getText().toString();
//                String DTime = dTime.getText().toString();
//                Map<String, Object> user = new HashMap<>();
//                user.put("Phone no", PhNo);
//                user.put("Email Id", Email);
//                user.put("Vehicle No", Vehicle_No);
//                user.put("Arrival Time ", ATime);
//                user.put("Arrival Date ", ADate);
//                user.put("Departure Time", DTime);
//                user.put("Departure Date", DDate);
//
//
//                db.collection("User")
//                        .add(user)
//                        .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
//                            @Override
//                            public void onSuccess(DocumentReference documentReference) {
//                                Toast.makeText(User_and_Vechical_Info.this, "Successful", Toast.LENGTH_SHORT).show();
//                            }
//
//                        }).addOnFailureListener(new OnFailureListener() {
//                            @Override
//                            public void onFailure(@NonNull Exception e) {
//                                Toast.makeText(User_and_Vechical_Info.this, "Failed", Toast.LENGTH_SHORT).show();
//                            }
//                        });
//
////                Intent intent=new Intent(getApplicationContext(), slot_Activity.class);
////                intent.putExtra("bookingStatus","success");
////                startActivity(intent);
////                finish();
//
//                // In UserClass where you want to send the boolean value
//                boolean isBookingDone = true; // or false based on your condition
//
////                Intent intent = new Intent(User_and_Vechical_Info.this, Parking_layout.class);
//                Intent intent = new Intent(User_and_Vechical_Info.this, Parking_layout.class);
//
////                intent.putExtra("bookedCar", bookedCar);
////                intent.putExtra("bookingStatus", isBookingDone);
////                startActivity(intent);
////                finish();
//
//                  Calculate_price();
//
//
//
//            }
//        });

//    }

    void Calculate_price(){
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");

        try {
            Date arrivalTime = format.parse(aTime.getText().toString());
            Date leavingTime = format.parse(dTime.getText().toString());

            long durationInMillis = leavingTime.getTime() - arrivalTime.getTime();
            int hours = (int) (durationInMillis / (1000 * 60 * 60)); // Convert milliseconds to hours

            int price = hours * 10; // Rs. 10 per hour

            Tprice.setText("Price: Rs. " + price);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    }




//        String Car1 = "car1";
//
//        // Create an Intent to start ActivityB
//        Intent intent = new Intent(User_and_Vechical_Info.this, Parking_layout.class);
//
//        // Put the string as an extra in the Intent
//        intent.putExtra("EXTRA_STRING", Car1);
//
//        // Start ActivityB
//        startActivity(intent);






//            Submit.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//
//                    String bookedCar = "Car1";
//
//
//                    String Fname = fname.getText().toString();
//                    String PhNo = phNo.getText().toString();
//                    String Email = emailId.getText().toString();
//                    String Vehicle_No = vno.getText().toString();
//                    String ADate = aDate.getText().toString();
//                    String ATime = aTime.getText().toString();
//                    String DDate = dDate.getText().toString();
//                    String DTime = dTime.getText().toString();
//                    Map<String, Object> user = new HashMap<>();
//                    user.put("Phone no", PhNo);
//                    user.put("Email Id", Email);
//                    user.put("Vehicle No", Vehicle_No);
//                    user.put("Arrival Time ", ATime);
//                    user.put("Arrival Date ", ADate);
//                    user.put("Departure Time", DTime);
//                    user.put("Departure Date", DDate);
//
//
//                    db.collection("User")
//                            .add(user)
//                            .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
//                                @Override
//                                public void onSuccess(DocumentReference documentReference) {
//                                    Toast.makeText(User_and_Vechical_Info.this, "Successful", Toast.LENGTH_SHORT).show();
//                                }
//
//                            }).addOnFailureListener(new OnFailureListener() {
//                                @Override
//                                public void onFailure(@NonNull Exception e) {
//                                    Toast.makeText(User_and_Vechical_Info.this, "Failed", Toast.LENGTH_SHORT).show();
//                                }
//                            });
//
////                Intent intent=new Intent(getApplicationContext(), slot_Activity.class);
////                intent.putExtra("bookingStatus","success");
////                startActivity(intent);
////                finish();
//
//                    // In UserClass where you want to send the boolean value
//                    boolean isBookingDone = true; // or false based on your condition
//
//                    Intent intent = new Intent(User_and_Vechical_Info.this, Parking_layout.class);
//                    intent.putExtra("bookedCar", bookedCar);
//                    intent.putExtra("bookingStatus", isBookingDone);
//                    startActivity(intent);
//
//
//                }
//            });






