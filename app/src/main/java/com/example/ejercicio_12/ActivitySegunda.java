package com.example.ejercicio_12;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivitySegunda extends AppCompatActivity {

    TextView lbresultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_segunda);

        lbresultado = (TextView) findViewById(R.id.lbresultado);

        String nombres = getIntent().getStringExtra("nombres");
        String apellidos = getIntent().getStringExtra("apellidos");
        String edad = getIntent().getStringExtra("edad");
        String correo = getIntent().getStringExtra("correo");

        lbresultado.setText("Nombre Completo: "+ nombres + "\nApellidos: "+ apellidos +
                "\nEdad: "+ edad + "\ncorreo: " + correo + "\n   Fueron Enviados Exitosamente");

    }
}