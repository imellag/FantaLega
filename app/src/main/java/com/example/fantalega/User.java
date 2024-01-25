package com.example.fantalega;

import java.io.Serializable;

public class User implements Serializable {
    private String username, email, password;

    // Costruttore per la registrazione
    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    // Costruttore per l'accesso
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Metodi per ottenere i dati
    public String getUsername() { return username; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }

    public void setUsername(String username) { this.username = username; }
    public void setEmail(String email) { this.email = email; }
    public void setPassword(String password) { this.password = password; }

}
