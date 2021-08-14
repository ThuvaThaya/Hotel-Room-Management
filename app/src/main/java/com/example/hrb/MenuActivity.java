package com.example.hrb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {
    //menu

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void onClickBooking(View view) {
        Intent intent = new Intent(this, BookingActivity.class);
        startActivity(intent);
    }

    public void onClickPayment(View view) {
        Intent intent = new Intent(this, PaymentActivity.class);
        startActivity(intent);
    }

    public void onClickBookingDetails(View view) {
        Intent intent = new Intent(this, BookingDetailsActivity.class);
        startActivity(intent);
    }

    public void onClickBookingDetailsAdmin(View view) {
        Intent intent = new Intent(this, BookingDetailsAdminActivity.class);
        startActivity(intent);
    }
}