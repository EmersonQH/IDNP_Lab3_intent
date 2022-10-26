package com.example.lab3_intent;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PostulanteInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postulante_info);

        EditText dniBuscar = findViewById(R.id.buscar_dni);
        Button buscar = findViewById(R.id.buscar);

        String [] data = getIntent().getStringArrayExtra("postulant");
        String [] Postulant;
        //postulants = new Postulant[10];
        int count = 0;
        //p1 = new Postulant(data[0],data[1],data[2],data[3],data[4],data[5]);
        //postulants[count] = p1;

        TextView dni= findViewById(R.id.inf_dni);
        TextView nombre = findViewById(R.id.inf_nombres);
        TextView apellido = findViewById(R.id.inf_apellidos);
        TextView fecha = findViewById(R.id.inf_fecha);
        TextView colegio = findViewById(R.id.inf_colegio);
        TextView carrera = findViewById(R.id.inf_carrera);

        /*if(postulants == null){
            Toast.makeText(this, "Sin registro", Toast.LENGTH_SHORT).show();
        }
        else{
            dni.setText("DNI: "+data[0]);
            nombre.setText("Nombre: "+data[1]);
            apellido.setText("Apellidos: "+data[2]);
            fecha.setText("Fecha Nacimiento: "+data[3]);
            colegio.setText("Colegio de Procedencia: : "+data[4]);
            carrera.setText("Carrera a Postular: : "+data[5]);
        }
        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });*/






    }
}