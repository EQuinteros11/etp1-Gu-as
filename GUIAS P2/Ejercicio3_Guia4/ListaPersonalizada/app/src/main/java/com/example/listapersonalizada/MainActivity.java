package com.example.listapersonalizada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String [] paises = {"El Salvador", "Guatemala", "Honduras", "Nicaragua", "Costa Rica"};
    ListView lvstPais;
    Integer []ImgPais = {
            R.drawable.bandera_el_salvador,
            R.drawable.bandera_guatemala,
            R.drawable.bandera_honduras,
            R.drawable.bandera_nicaragua,
            R.drawable.bandera_costa_rica,
    };
    EditText edPaisSeleecion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdaptadorPais adaptador = new AdaptadorPais( this, paises, ImgPais );
        lvstPais = findViewById( R.id.list1 );
        edPaisSeleecion = findViewById( R.id.edtPaisSeleccion );
        lvstPais.setAdapter( adaptador );

        lvstPais.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText( adapterView.getContext(), "Selecciono " + adapterView.getItemAtPosition( i ).toString(), Toast.LENGTH_LONG ).show();
                String seleecion = adapterView.getItemAtPosition( i ).toString();
                edPaisSeleecion.setText( seleecion );
            }
        });
    }
}