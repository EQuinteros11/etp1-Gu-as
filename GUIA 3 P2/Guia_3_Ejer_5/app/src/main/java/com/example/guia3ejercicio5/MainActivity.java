package com.example.guia3ejercicio5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText txtPrimerLado;
    private EditText txtSegundoLado;
    private EditText txtTercerLado;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtPrimerLado=findViewById(R.id.txtPrimerLado);
        txtSegundoLado=findViewById(R.id.txtSegundoLado);
        txtTercerLado=findViewById(R.id.txtTercerLado);
        imageView=findViewById(R.id.imgTriangulo);

    }

    public void OnClick(View v) {

        Double primerLado =Double.parseDouble(txtPrimerLado.getText().toString());
        Double segundoLado =Double.parseDouble(txtSegundoLado.getText().toString());
        Double tercerLado =Double.parseDouble(txtTercerLado.getText().toString());

        ArrayList<Double> lados = new ArrayList<Double>();

        lados.add(primerLado);

        if(lados.contains(segundoLado) == false){
            lados.add(segundoLado);
        }

        if(lados.contains(tercerLado) == false){
            lados.add(tercerLado);
        }
        int ladosIguales = lados.size();

        if(ladosIguales == 3){
            imageView.setImageResource(R.drawable.equilatero);
            Toast.makeText(getApplicationContext(), "TRIANGULO EQUILATERO", Toast.LENGTH_LONG).show();
        }

        if(ladosIguales == 2){
            imageView.setImageResource(R.drawable.isoceles);
            Toast.makeText(getApplicationContext(), "TRIANGULO iSOSCELES", Toast.LENGTH_LONG).show();
        }

        if(ladosIguales == 1){
            imageView.setImageResource(R.drawable.escaleno);
            Toast.makeText(getApplicationContext(), "TRIANGULO ESCALENO", Toast.LENGTH_LONG).show();
        }


    }
}