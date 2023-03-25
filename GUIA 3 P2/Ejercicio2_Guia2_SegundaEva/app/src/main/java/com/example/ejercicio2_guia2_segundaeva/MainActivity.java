package com.example.ejercicio2_guia2_segundaeva;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Declaración de campos utilizados
    EditText edNumero;
    Button btnCalculo, btnLimpiar;
    TextView tvRes, tvNumIngresado, tvCantCifras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referencia a objetos de la vista
        edNumero = findViewById( R.id.edtNumeroIngresado );
        btnCalculo = findViewById( R.id.btnConsultar );
        btnLimpiar = findViewById( R.id.btnLimpiar );
        tvRes = findViewById( R.id.tvResulados );
        tvNumIngresado = findViewById( R.id.tvNumeroIngresado );
        tvCantCifras = findViewById( R.id.tvCantidadCifras );
    }

    public void Calcular( View view ){

        // Variables para realizar calculo
        int numeroIngresado = Integer.parseInt( edNumero.getText().toString() ),
            cantidadDigitos = 0;

        // Condicional para saber el largo del digito ingresado
        if ( numeroIngresado > 0 && numeroIngresado < 10) {
            cantidadDigitos = 1;
            MostrarDatos( numeroIngresado, cantidadDigitos );
        }else if ( numeroIngresado >= 10 && numeroIngresado < 100 ) {
            cantidadDigitos = 2;
            MostrarDatos( numeroIngresado, cantidadDigitos );
        } else if ( numeroIngresado >= 100 && numeroIngresado < 1000 ){
            cantidadDigitos = 3;
            MostrarDatos( numeroIngresado, cantidadDigitos );
        } else if ( numeroIngresado >= 1000 || numeroIngresado < 0 ){
            // Metodo para mostrar alerta de error
            btnCalculo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast alerta = new Toast( getApplicationContext() );
                    LayoutInflater inflater =getLayoutInflater();
                    View layout =inflater.inflate( R.layout.toast_alerta, ( ViewGroup ) findViewById( R.id.lyAlerta ) );

                    TextView txtAlerta = ( TextView ) layout.findViewById( R.id.txtAlerta1 );
                    alerta.setDuration( Toast.LENGTH_LONG );
                    alerta.setView( layout );
                    alerta.show();
                    Limpiar();
                }
            });
        }
    }

    // Metodo para mostrar datos en vista
    public void MostrarDatos( int numIngresado, int CantDigitos ){
        tvRes.setText("Resultados");
        tvNumIngresado.setText( "Número ingresado: " + numIngresado );
        tvCantCifras.setText("Cantidad de cifras del número: " + CantDigitos);
    }

    // Metodo principal para limpiar los campos
    public void Limpiar(){
        tvRes.setText( "" );
        tvNumIngresado.setText( "" );
        tvCantCifras.setText( "" );
    }

    // Metodo con sobrecarga para limpiar los campos
    public void Limpiar( View view ){
        tvRes.setText( "" );
        tvNumIngresado.setText( "" );
        tvCantCifras.setText( "" );
        edNumero.setText("");
    }
}