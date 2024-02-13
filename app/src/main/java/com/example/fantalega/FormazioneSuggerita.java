package com.example.fantalega;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class FormazioneSuggerita extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formazione_suggerita);
    }

    public void onCloseClick(View view) {
        finish();
    }
}
