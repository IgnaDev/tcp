package com.example.tcp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuEntrenamiento extends AppCompatActivity {

    Button btnRealizarEntrenamiento, btnCrearEntrenamiento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_entrenamiento);
        btnRealizarEntrenamiento = findViewById(R.id.btnRealizarEntrenamiento);
        btnCrearEntrenamiento = findViewById(R.id.btnCrearSesion);
        setTitle("Entrenamiento");
        btnRealizarEntrenamiento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {irRealizarEntrenamiento();   }
        });

        btnCrearEntrenamiento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irFormularioEntrenamiento();
            }
        });

    }

    public void irFormularioEntrenamiento(){
        Intent intencion = new Intent(MenuEntrenamiento.this, FormularioEntrenamiento.class);
        startActivity(intencion);
    }

    public void irRealizarEntrenamiento(){
        Intent intencion = new Intent(MenuEntrenamiento.this, RealizarEntrenamiento.class);
        startActivity(intencion);
    }


}