package sv.edu.utec.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtOp1, edtOp2;
    private Spinner sp1;
    private TextView respu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtOp1=(EditText)findViewById(R.id.edtOperador1);
        edtOp2=(EditText)findViewById(R.id.edtOperador2);
        sp1=(Spinner) findViewById(R.id.spinner);
        respu=(TextView)findViewById(R.id.tvRespuesta);

        String[] opciones={"+","-","*","/"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>
                ( this,  android.R.layout.simple_spinner_item, opciones);

        sp1.setAdapter(adapter);

    }
    public void operaciones(View view) {
        int op1, op2;
        int suma, resta, multi, divi;
        String selec;

        op1 = Integer.parseInt(edtOp1.getText().toString());
        op2 = Integer.parseInt(edtOp2.getText().toString());
        selec = sp1.getSelectedItem().toString();

        if (selec.equals("+")) {
            suma = op1 + op2;
            respu.setText("La suma es: " + suma);
        } else {
            if (selec.equals("-")) {
                resta = op1 - op2;
                respu.setText("La resta es: " + resta);
            } else {
                if (selec.equals("*")) {
                    multi = op1 * op2;
                    respu.setText("La multiplicación es: " + multi);
                } else {
                    if (selec.equals("/")) {
                        divi = op1 / op2;
                        respu.setText("La división es: " + divi);
                    }
                }

            }

        }

    }

}
