package com.example.unitconverterBy_Al_Mamun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout lengthBtn, areaBtn, volumeBtn, weightBtn, tempBtn, speedBtn, currencyBtn, powerBtn, pressureBtn;
    ImageView mainInfoBtn;

    Gadgets gadgets = new Gadgets();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        assignBtn(lengthBtn, R.id.lengthBtn);
        assignBtn(areaBtn, R.id.areaBtn);
        assignBtn(volumeBtn, R.id.volumeBtn);
        assignBtn(weightBtn, R.id.weighttBtn);
        assignBtn(tempBtn, R.id.tempBtn);
        assignBtn(speedBtn, R.id.speedBtn);
        assignBtn(mainInfoBtn, R.id.main_info_btn);
        assignBtn(currencyBtn, R.id.currencyBtn);
        assignBtn(powerBtn, R.id.powerBtn);
        assignBtn(pressureBtn, R.id.pressureBtn);
    }

    void assignBtn(LinearLayout btn, int id) {
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }
    void assignBtn(ImageView btn, int id) {
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.main_info_btn) {
            gadgets.openActivity(MainActivity.this, Informations.class, "info_from", "main");
        } else {
            LinearLayout currTarget = (LinearLayout) view;
            String activityWillOpen;
            switch (currTarget.getId()) {
                case (R.id.lengthBtn):
                    activityWillOpen = "Length";
                    break;
                case (R.id.areaBtn):
                    activityWillOpen = "Area";
                    break;
                case (R.id.volumeBtn):
                    activityWillOpen = "Volume";
                    break;
                case (R.id.weighttBtn):
                    activityWillOpen = "Weight";
                    break;
                case (R.id.tempBtn):
                    activityWillOpen = "Temperature";
                    break;
                case (R.id.speedBtn):
                    activityWillOpen = "Speed";
                    break;
                case (R.id.currencyBtn):
                    activityWillOpen = "Currency";
                    break;
                case (R.id.powerBtn):
                    activityWillOpen = "Power";
                    break;
                case (R.id.pressureBtn):
                    activityWillOpen = "Pressure";
                    break;
                default:
                    activityWillOpen = "Unit Converter";
            }
            gadgets.openActivity(MainActivity.this, ConvertActivity.class, "activity", activityWillOpen);
        }
    }
}