package utec.edu.sv.ejercicio6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.Element;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Spinner spInfo;
EditText edtDigite;
Button btnEjecutar;
TextView tvResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtDigite = findViewById(R.id.edtDigite);
        tvResultado = findViewById(R.id.tvResultado);
    }
    public void ejecutar(View v){

        String mostrar = "";
        int num, result, N;
        try {
            num = Integer.parseInt(edtDigite.getText().toString());
            N = num + 77;
            mostrar =String.valueOf(num)+" + 77 = " + String.valueOf(N)+"\n"+String.valueOf(N)+" - 3 = ";
            N = N - 3;
            mostrar =mostrar + String.valueOf(N)+"\n"+ String.valueOf(N)+" * 2 = ";
            N = N * 2;
            mostrar = mostrar + String.valueOf(N);
            tvResultado.setText("Valor Inicial de N = "+ num + "\n"+ mostrar);

        }
        catch (Exception m){

            tvResultado.setText("*** Digite un numero Entero *** \n"+m);

        }
        edtDigite.setText("");
    }
}