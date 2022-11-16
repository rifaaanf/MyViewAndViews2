package com.example.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_chat = findViewById(R.id.btn_chat);
        Button btn_buy = findViewById(R.id.btn_buy);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Iphone 12 Pro");
        }

        btn_buy.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Buy.class);
            startActivity(intent);
        });

        btn_chat.setOnClickListener(v -> {
            String phoneNumber = "082135816504";
            Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
            startActivity(dialPhoneIntent);
        });
    }

}
