package sv.edu.utec.triangulo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText A1, A2, A3;
    Button Calcular;

    ImageView Triangulo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        A1=findViewById(R.id.edtLado1);
        A2=findViewById(R.id.edtLado2);
        A2=findViewById(R.id.edtLado3);
        Calcular=findViewById(R.id.btnCalcular);
        Triangulo = findViewById(R.id.imgV);
    }

    public void Calc (View v) {
        String a1 = A1.getText().toString();
        String a2 = A2.getText().toString();
        String a3 = A3.getText().toString();

        /*double ladoA = Integer.parseInt(a1);
        double ladoB = Integer.parseInt(a2);
        double ladoC = Integer.parseInt(a3);*/

        if (a1.equals("") || a2.equals("") || a3.equals("")){
            Toast.makeText(getApplicationContext(),"Sin datos, Ingrese datos",Toast.LENGTH_LONG).show();
        }
        else {
            float ladoA = Float.parseFloat(a1);
            float ladoB = Float.parseFloat(a2);
            float ladoC = Float.parseFloat(a3);

            if (ladoA == ladoB && ladoA == ladoC) {
                Triangulo.setImageResource(R.drawable.Equilatero);
                Toast.makeText(getApplicationContext(), "TRIANGULO EQUILATERO", Toast.LENGTH_LONG).show();
            }
            else if (ladoA == ladoB && ladoA != ladoC || ladoA != ladoB && ladoA == ladoC || ladoB == ladoA && ladoB != ladoC || ladoB != ladoA && ladoB == ladoC || ladoC == ladoA && ladoC != ladoB || ladoC != ladoA && ladoC == ladoB){
                Triangulo.setImageResource(R.drawable.Isosceles);
                Toast.makeText(getApplicationContext(), "TRIANGULO iSOSCELES", Toast.LENGTH_LONG).show();
            }
            else {
                Triangulo.setImageResource(R.drawable.Escaleno);
                Toast.makeText(getApplicationContext(), "TRIANGULO ESCALENO", Toast.LENGTH_LONG).show();
            }


      }
    }
}