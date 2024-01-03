package com.example.proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button  ingresarButton;
    Button  getIngresarButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ingresarButton = findViewById(R.id.ingresarButton);
        getIngresarButton2 =findViewById(R.id.ingresarButton2);

        ingresarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Home.class);
                startActivity(intent);
            }
        });
        getIngresarButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,Registro.class);
                startActivity(intent);
            }
        });
    }
}