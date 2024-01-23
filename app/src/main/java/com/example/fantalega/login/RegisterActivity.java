package com.example.fantalega.login;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import com.example.fantalega.R;


public class RegisterActivity extends AppCompatActivity {

    private EditText username, email, password, confirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username = findViewById(R.id.registerUsername);
        email = findViewById(R.id.registerEmail);
        password = findViewById(R.id.registerPassword);
        confirmPassword = findViewById(R.id.confirmPassword);

        // Pulsante per confermare la creazione dell'account
        Button btnRegister = findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(v -> {
            // Aggiungi la logica di registrazione
            if (checkInput()) {
                // Apri la schermata del login dopo aver creato l'account (aggiungere append)
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void onBackClick(View view) {
        navigateToLogin();
    }

    private void navigateToLogin() {
        Intent intent = new Intent(this, MainActivity.class); // Modificato da RegisterActivity
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

        String emailText = email.getText().toString().trim();
        if (TextUtils.isEmpty(emailText)) {
            errors++;
            email.setError("Inserisci un'email!");
        } else {
            email.setError(null);
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

        String confirmPasswordText = confirmPassword.getText().toString().trim();
        if (!passwordText.equals(confirmPasswordText)) {
            errors++;
            confirmPassword.setError("Le password non coincidono!");
        } else {
            confirmPassword.setError(null);
        }

        return errors == 0;
    }
}
