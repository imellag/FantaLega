package com.example.fantalega.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fantalega.R;

public class RegisterActivity extends AppCompatActivity {

    EditText nome, email, password, confermaP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        nome = findViewById(R.id.registerUsername);
        email = findViewById(R.id.registerEmail);
        password = findViewById(R.id.registerPassword);
        confermaP = findViewById(R.id.confirmPassword);

        Button btnRegister = findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(v -> {
            if (checkInput()) {
                Toast.makeText(this, "Hai creato un nuovo account, ora puoi accedere!", Toast.LENGTH_SHORT).show();
                navigateToLogin();
            }
        });
    }

    public void onBackClick(View view) {
        navigateToLogin();
    }

    private void navigateToLogin() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    protected boolean checkInput() {
        int errors = 0;

        if (nome.getText() == null || nome.getText().length() == 0) {
            errors++;
            nome.setError("Inserisci un nome!");
        } else
            nome.setError(null);

        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email.getText().toString()).matches()) {
            errors++;
            email.setError("Inserisci una mail valida!");
        } else
            email.setError(null);

        if (password.getText() == null || password.getText().length() == 0) {
            errors++;
            password.setError("Inserisci una password!");
        } else if (password.getText().length() < 4) {
            errors++;
            password.setError("La password deve avere almeno 4 caratteri!");
        } else
            password.setError(null);

        if (confermaP.getText() == null || confermaP.getText().length() == 0) {
            errors++;
            confermaP.setError("Inserisci una password!");
        } else if (confermaP.getText().length() < 4) {
            errors++;
            confermaP.setError("La password deve avere almeno 4 caratteri!");
        } else if (confermaP != password) {
            errors++;
            confermaP.setError("Le password devono coincidere!");
        } else
            confermaP.setError(null);

        return errors == 0;
    }
}
