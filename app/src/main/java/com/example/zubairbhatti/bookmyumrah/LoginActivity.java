package com.example.zubairbhatti.bookmyumrah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    EditText email, password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = (EditText) findViewById(R.id.etEmail);
        password = (EditText) findViewById(R.id.etPassword);
        login = (Button) findViewById(R.id.btnLogin);
        TextView registerScreen = (TextView) findViewById(R.id.link_to_register);


        login.setOnClickListener(this);


        // Listening to register new account link
        registerScreen.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // Switching to Register screen
                Intent i = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(i);
            }
        });

    }

    @Override
    public void onClick(View v) {
        String em = email.getText().toString();
        String pas = password.getText().toString();

        if (em.equals("admin")){
            if (pas.equals("admin")){
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(),"You have successfully LogIn",Toast.LENGTH_LONG).show();

            }
            else
                Toast.makeText(getApplicationContext(),"Incorrect Password",Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(getApplicationContext(),"Incorrect Username",Toast.LENGTH_LONG).show();

        }

    }
}
