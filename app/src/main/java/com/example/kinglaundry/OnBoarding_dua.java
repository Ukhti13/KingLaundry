package com.example.kinglaundry;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class OnBoarding_dua extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceStae){
        super.onCreate(savedInstanceStae);
        setContentView(R.layout.onboarding_dua);
    }

    public void kedua(View view) {
        Intent in = new Intent(OnBoarding_dua.this,OnBoarding_tiga.class);
        startActivity(in);
    }
}
