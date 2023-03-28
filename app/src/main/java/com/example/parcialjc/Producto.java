package com.example.parcialjc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Producto extends AppCompatActivity {

    Button guardarfruta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto);
        guardarfruta.findViewById(R.id.guardarfruta);

        guardarfruta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Producto.this,"Fruta guardada", Toast.LENGTH_SHORT).show();
            }
        });

    }
}