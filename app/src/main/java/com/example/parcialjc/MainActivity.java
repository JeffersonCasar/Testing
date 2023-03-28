package com.example.parcialjc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtNombre, txtContraseña;
    Button btnGuardar;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = findViewById(R.id.txtNombre);
        txtContraseña=findViewById(R.id.txtContraseña);
        btnGuardar= findViewById(R.id.btnGuardar);

        btnGuardar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (txtContraseña != null){
                    Toast.makeText(MainActivity.this,"Entraste a la tabla", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this,"Verifica si existen campos vacios", Toast.LENGTH_SHORT).show();;
                }
                startActivity(new Intent(MainActivity.this, Producto.class));
            }
        });
    }
}