package com.example.kinglaundry;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class OnBoarding_tiga extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboarding_tiga);

    }

    public void ketiga(View view) {
        Intent inte = new Intent(OnBoarding_tiga.this,MainActivity.class);
        startActivity(inte);
    }
}
