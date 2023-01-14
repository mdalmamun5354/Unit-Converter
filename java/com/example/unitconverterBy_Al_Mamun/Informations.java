package com.example.unitconverterBy_Al_Mamun;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class Informations extends AppCompatActivity {

    Gadgets gadgets = new Gadgets();

    ImageView backBtn;
    Button webBtn;
    String fromActivity;
    String myWebLink = "https://md-al-mamun--workshop.000webhostapp.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informations);

        Intent intent = getIntent();
        fromActivity = intent.getStringExtra("info_from");

        backBtn = findViewById(R.id.imageView3);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fromActivity.equals("Convert")) {
                    gadgets.openActivity(Informations.this, ConvertActivity.class);
                } else {
                    gadgets.openActivity(Informations.this, MainActivity.class);
                }
            }
        });

        webBtn = findViewById(R.id.button1);
        webBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gadgets.openActivity(Informations.this, myWebLink);
            }
        });
    }
}