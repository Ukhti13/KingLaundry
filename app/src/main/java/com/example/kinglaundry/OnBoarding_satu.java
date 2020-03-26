package com.example.kinglaundry;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class OnBoarding_satu extends AppCompatActivity {

@Override

    protected void onCreate(Bundle savedInstanceState){
       super.onCreate(savedInstanceState);
        setContentView(R.layout.onboarding_satu);

    }

    public void kesatu(View view) {
    Intent i = new Intent(OnBoarding_satu.this,OnBoarding_dua.class);
    startActivity(i);
    }
}
