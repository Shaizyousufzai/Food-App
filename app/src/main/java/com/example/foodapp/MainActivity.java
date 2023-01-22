package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button login;
    Button signup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                getSupportActionBar().hide();
                login = findViewById(R.id.button);
                signup = findViewById(R.id.button2);
                login.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "login clicked", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this,SignIn_Activity.class);
                        startActivity(intent);
                    }
                });
                signup.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "Register clicked", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this,SignUp_Activity.class);
                        startActivity(intent);
                    }
                });
    }
}