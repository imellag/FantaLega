package com.example.fantalega.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fantalega.HomeActivity;
import com.example.fantalega.R;
import com.example.fantalega.FragmentActivity;

public class LoginActivity extends AppCompatActivity {

    EditText nome, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.loginUsername);
        password = findViewById(R.id.loginPassword);
    }

    public void onLoginClick(View view) {
        navigateToHome();
    }

    public void onRegisterClick(View view) {
        navigateToRegister();
    }

    private void navigateToHome() {
        if (checkLoginInput()) {
            Intent intent = new Intent(this, FragmentActivity.class);
            startActivity(intent);
            finish();
        }
    }

    private void navigateToRegister() {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    protected boolean checkLoginInput() {
        int errors = 0;

        if (nome.getText() == null || nome.getText().length() == 0) {
            errors++;
            nome.setError("Inserisci un nome!");
        } else
            nome.setError(null);

        if (password.getText() == null || password.getText().length() == 0) {
            errors++;
            password.setError("Inserisci una password!");
        } else if (password.getText().length() < 4) {
            errors++;
            password.setError("La password deve avere almeno 4 caratteri!");
        } else
            password.setError(null);

        return errors == 0;
    }
}