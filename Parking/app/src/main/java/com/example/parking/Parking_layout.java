package com.example.parking;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Parking_layout extends AppCompatActivity {
    ImageView car1, car2, car3, car4, car5, car6, car7, car8, car9, car10, car11, car12;
    ImageView redcar1;

  ImageView redcar2;
  ImageView redcar3;
  ImageView redcar4;
  ImageView redcar5;
  ImageView redcar6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking_layout);

        setContentView(R.layout.activity_parking_layout);
        car1 = findViewById(R.id.car1);
        car2 = findViewById(R.id.car2);
        car3 = findViewById(R.id.car3);
        car4 = findViewById(R.id.car4);
        car5 = findViewById(R.id.car5);
        car6 = findViewById(R.id.car6);

        redcar1 = findViewById(R.id.redcar1);
        redcar2 = findViewById(R.id.redcar2);
        redcar3 = findViewById(R.id.redcar3);
        redcar4 = findViewById(R.id.redcar4);
        redcar5 = findViewById(R.id.redcar5);
        redcar6 = findViewById(R.id.redcar6);




//        boolean isBookingSuccessful=
//                car1.setImageResource(isBookingSuccessful?R.drawable.redcar:R.drawable.car);

//      Intent intent=getIntent();
//      boolean isBookingSuccessful=intent.getBooleanExtra("bookingStatus",false);

//      car1.setImageResource(isBookingSuccessful?R.drawable.redcar:R.drawable.car);


        // In ParkingSlotClass to retrieve the boolean value
        Intent intent = getIntent();
        boolean bookingStatus = intent.getBooleanExtra("bookingStatus", false);
        String bookedCar=intent.getStringExtra("bookedCar");

     if (bookingStatus && bookedCar != null) {
            switch ("bookedCar") {

                case "car1":
                    // Booking is done, show the red-colored car image
                    car1.setVisibility(View.GONE);
                    redcar1.setVisibility(View.VISIBLE);
//                    car1.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
////                            openCar1Form();
//
//
//                        }
//                    });
                    break;

                case "car2":
                    car2.setVisibility(View.GONE);
                    redcar2.setVisibility(View.VISIBLE);
                    car2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
//                            openCar1Form(); // Customize this method for car1
                        }
                    });
                    break;

                case "car3":
                    car3.setVisibility(View.GONE);
                    redcar3.setVisibility(View.VISIBLE);
//                    car3.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
////                            openCar1Form(); // Customize this method for car1
//                        }
//                    });
                    break;

                case "car4":
                    car4.setVisibility(View.GONE);
                    redcar4.setVisibility(View.VISIBLE);
//                    car4.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
////                            openCar1Form(); // Customize this method for car1
//                        }
//                    });
                    break;

                case "car5":
                    car5.setVisibility(View.GONE);
                    redcar5.setVisibility(View.VISIBLE);
//                    car1.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
////                            openCar1Form(); // Customize this method for car1
//                        }
//                    });
                    break;

                case "car6":
                    car6.setVisibility(View.GONE);
                    redcar6.setVisibility(View.VISIBLE);
//                    car1.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
////                            openCar1Form(); // Customize this method for car1
//                        }
//                    });
                    break;


                // Set OnClickListener for car1 to open a specific form
            }
        }
       else{
                // Booking is not done, show the original car image
            car1.setVisibility(View.VISIBLE);
            redcar1.setVisibility(View.GONE);

            car2.setVisibility(View.VISIBLE);
            redcar2.setVisibility(View.GONE);

            car3.setVisibility(View.VISIBLE);
            redcar3.setVisibility(View.GONE);

            car4.setVisibility(View.VISIBLE);
            redcar4.setVisibility(View.GONE);

            car5.setVisibility(View.VISIBLE);
            redcar5.setVisibility(View.GONE);

            car6.setVisibility(View.VISIBLE);
            redcar6.setVisibility(View.GONE);
            }


// Now you can use the 'bookingStatus' variable in ParkingSlotClass

            car1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    String Car = "car1";
                    Intent intent = new Intent(Parking_layout.this, User_and_Vechical_Info.class);
                    startActivity(intent);
                    finish();


                    // Put the string as an extra in the Intent
//                    intent.putExtra("EXTRA_STRING", Car);

                    // Start ActivityB

                   // finish();
                }
            });
//
//            car2.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    String Car = "car2";
//                   Intent intent = new Intent(Parking_layout.this, User_and_Vechical_Info.class);
//
//                    // Put the string as an extra in the Intent
//                    intent.putExtra("EXTRA_STRING", Car);
//
//                    // Start ActivityB
//                    startActivity(intent);
//                    finish();
//                    finish();
//                }
//            });
//
//            car3.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Intent intent = new Intent(getApplicationContext(), User_and_Vechical_Info.class);
//                    startActivity(intent);
//                    finish();
//                }
//            });
//
//            car4.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Intent intent = new Intent(getApplicationContext(), User_and_Vechical_Info.class);
//                    startActivity(intent);
//                    finish();
//                }
//            });
//
//            car5.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Intent intent = new Intent(getApplicationContext(), User_and_Vechical_Info.class);
//                    startActivity(intent);
//                    finish();
//                }
//            });
//
//            car6.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Intent intent = new Intent(getApplicationContext(), User_and_Vechical_Info.class);
//                    startActivity(intent);
//                    finish();
//                }
//            });
        }



//    private void openCar1Form() {
//        Intent intent=new Intent(getApplicationContext(),User_and_Vechical_Info.class);
////        intent.putExtra("changeImage1", true);
//        startActivity(intent);
////        finish();
//
//    }
}