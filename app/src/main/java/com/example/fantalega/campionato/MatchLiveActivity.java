package com.example.fantalega.campionato;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.fantalega.FragmentActivity;
import com.example.fantalega.R;

public class MatchLiveActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.match_live);


        AppCompatButton indietro = findViewById(R.id.btnTornaIndietro);

        indietro.setOnClickListener(v -> {
            Intent intent = new Intent(this, FragmentActivity.class);
            startActivity(intent);



        });
    }
}
