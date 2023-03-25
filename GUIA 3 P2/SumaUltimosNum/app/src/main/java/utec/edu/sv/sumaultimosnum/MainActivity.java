package utec.edu.sv.sumaultimosnum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvMostrar;
    EditText edtNum1,edtNum2,edtNum3,edtNum4,edtNum5,edtNum6,edtNum7,edtNum8,edtNum9,edtNum10;
    Double suma = 0.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMostrar = findViewById(R.id.tvMostrar);
        edtNum1 = findViewById(R.id.edtNum1);
        edtNum2 = findViewById(R.id.edtNum2);
        edtNum3 = findViewById(R.id.edtNum3);
        edtNum4 = findViewById(R.id.edtNum4);
        edtNum5 = findViewById(R.id.edtNum5);
        edtNum6 = findViewById(R.id.edtNum6);
        edtNum7 = findViewById(R.id.edtNum7);
        edtNum8 = findViewById(R.id.edtNum8);
        edtNum9 = findViewById(R.id.edtNum9);
        edtNum10 = findViewById(R.id.edtNum10);


    }
    public void imprimir(View v){
        String num1 = edtNum1.getText().toString();
        String num2 = edtNum2.getText().toString();
        String num3 = edtNum3.getText().toString();
        String num4 = edtNum4.getText().toString();
        String num5 = edtNum5.getText().toString();
        String num6 = edtNum6.getText().toString();
        String num7 = edtNum7.getText().toString();
        String num8 = edtNum8.getText().toString();
        String num9 = edtNum9.getText().toString();
        String num10 = edtNum10.getText().toString();

        suma =  Double.valueOf(num6)+Double.valueOf(num7)+Double.valueOf(num8)+Double.valueOf(num9)+Double.valueOf(num10);

        tvMostrar.setText("La suma de los últimos 5 números dígitados es:  "+suma);
    }
}