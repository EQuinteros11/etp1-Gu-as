package sv.edu.utec.positivonegativonulo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText et;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btnValor);
        et = findViewById(R.id.txtValor);
        tv = findViewById(R.id.lblResultado);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar();
            }
        });

}

public void mostrar(){
        String SA = et.getText().toString();
    try {
        int B = Integer.valueOf(SA);

       if(B == 0)
           tv.setText("Ingreso valor 0");
       else
        if (B >= 0)
            tv.setText("Es Positivo");
        else
            tv.setText("Es negativo");
    }
    catch (Exception e){
        tv.setText("Vuelva a intentar");
    }

    }
}