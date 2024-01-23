package com.example.fantalega.login;
import com.example.fantalega.HomeActivity;
import com.example.fantalega.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onLoginClick(View view) {
        navigateToHome();
    }

    public void onRegisterClick(View view) {
        navigateToRegister();
    }

    private void navigateToHome() {
        // Fare la verifica dei dati, che siano collegati all'account creato
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    private void navigateToRegister() {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}

