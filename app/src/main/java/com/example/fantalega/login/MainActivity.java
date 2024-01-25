package com.example.fantalega.login;
import com.example.fantalega.HomeActivity;
import com.example.fantalega.R;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.loginUsername);
        password = findViewById(R.id.loginPassword);
    }

    public void onLoginClick(View view) {
        navigateToHome();
    }

    public void onRegisterClick(View view) {
        navigateToRegister();
    }

    private void navigateToHome() {
        // Per ora controlla soltanto che le stringhe fornite non siano vuote
        // Aggiungere controllo dei dati = account registrato
        if (checkInput()) {
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
        }
    }

    private void navigateToRegister() {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    private boolean checkInput() {
        int errors = 0;

        String usernameText = username.getText().toString().trim();
        if (TextUtils.isEmpty(usernameText)) {
            errors++;
            username.setError("Inserisci un nome!");
        } else {
            username.setError(null);
        }

        String passwordText = password.getText().toString().trim();
        if (TextUtils.isEmpty(passwordText)) {
            errors++;
            password.setError("Inserisci una password!");
        } else if (passwordText.length() < 6) {
            errors++;
            password.setError("La password deve avere almeno 6 caratteri!");
        } else {
            password.setError(null);
        }

        return errors == 0;
    }
}

