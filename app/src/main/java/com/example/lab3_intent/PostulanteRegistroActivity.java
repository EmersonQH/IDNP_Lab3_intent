package com.example.lab3_intent;

import static com.example.lab3_intent.R.id.registrar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PostulanteRegistroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postulante_registro);

        EditText dni = findViewById(R.id.dni);
        EditText nombre = findViewById(R.id.nombres);
        EditText apellido = findViewById(R.id.apellidos);
        EditText fecha = findViewById(R.id.fechaNacimiento);
        EditText colegio = findViewById(R.id.colegio);
        EditText carrera = findViewById(R.id.carrera);
        Button registro = findViewById(R.id.registrar);

        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] data = new String[6];
                data[0] = dni.getText().toString();
                data[1] = nombre.getText().toString();
                data[2] = apellido.getText().toString();
                data[3] = fecha.getText().toString();
                data[4] = colegio.getText().toString();
                data[5] = carrera.getText().toString();

                Intent intent = new Intent(getApplicationContext(), PostulanteInfoActivity.class);
                intent.putExtra("postulant", data);
                startActivity(intent);
            }
        });
    }
}