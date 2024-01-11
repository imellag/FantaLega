package com.example.fantalega;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onLoginClick(View view) {
        // Implementa la logica di login qui
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void onRegisterClick(View view) {
        // Implementa la logica di registrazione qui
    }
}
