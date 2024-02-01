package com.example.fantalega.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fantalega.HomeActivity;
import com.example.fantalega.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onLoginClick(View view) {navigateToHome();}
    public void onRegisterClick(View view) {
        navigateToRegister();
    }

    private void navigateToHome() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
        finish();
    }

    private void navigateToRegister() {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button elemento1 = findViewById(R.id.elemento1);
        elemento1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Elemento 1 cliccato", Toast.LENGTH_SHORT).show();
                // Aggiungi qui il codice per gestire il clic sull'elemento 1
            }
        });

        Button elemento2 = findViewById(R.id.elemento2);
        elemento2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Elemento 2 cliccato", Toast.LENGTH_SHORT).show();
                // Aggiungi qui il codice per gestire il clic sull'elemento 2
            }
        });

        // Aggiungi più pulsanti e gestisci i clic come necessario

    }
}
