package sv.edu.utec.ejercicio3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnSaludar_Click (View view) {
        EditText etNombre = (EditText)findViewById(R.id.etNombre);

        String saludo = String.format("Bienvenido %s", etNombre.getText().toString());
        Toast.makeText(MainActivity.this, saludo,Toast.LENGTH_LONG).show();

    }
}