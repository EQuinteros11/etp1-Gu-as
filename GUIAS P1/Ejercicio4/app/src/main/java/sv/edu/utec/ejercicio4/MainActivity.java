package sv.edu.utec.ejercicio4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

// 4.	 Crear una aplicación que leerá un número solicitando el precio de un producto
// (puede tener decimales) y calcule el precio final con IVA. El IVA será una constante del 13.4%”,
// utilizar TextView para mostrar el resultado.

public class MainActivity extends AppCompatActivity {

    EditText edtPrecioProducto;
    TextView txvResultado, txvPrecioInicial, txvIVA, txvPrecioFinal, txvAlerta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Capturando valor del precio del producto y los demás valores
        edtPrecioProducto = findViewById( R.id.edtPrecioProducto );
        txvResultado = findViewById( R.id.txvResultados );
        txvPrecioInicial = findViewById( R.id.txvPrecioProducto );
        txvIVA = findViewById( R.id.txvIvaProducto );
        txvPrecioFinal = findViewById( R.id.txvPrecioFinal );
    }

    public void CalcularIVA( View v ){
        // Convirtiendo el valor calculado a decimal
        double precioProducto = Double.parseDouble( edtPrecioProducto.getText().toString() );
        double IVA = 13.4, totalIva = 0.00, precioFinal = 0.00;

            // Calculando el IVA
            totalIva = ( precioProducto * IVA ) / 100;
            obtieneDosDecimales( totalIva );

            // Calculando el precio final del producto
            precioFinal = precioProducto + totalIva;

            // Mostrando los resultados dentro de los textView de la vista
            txvResultado.setText("Resultados");
            txvPrecioInicial.setText( "Precio inicial: " + String.valueOf( precioProducto ) );
            txvIVA.setText( "IVA generado: " + String.valueOf( obtieneDosDecimales( totalIva ) ) );
            txvPrecioFinal.setText( "Precio final del producto: " + String.valueOf( obtieneDosDecimales( precioFinal ) ) );
    }

    // Metodo para obtener 2 redondear a 2 decimales un numero decimal
    private String obtieneDosDecimales( double valor ){
        DecimalFormat format = new DecimalFormat();
        format.setMaximumFractionDigits(2); //Define 2 decimales.
        return format.format( valor );
    }

    public void LimpiarDatos( View v ){
        edtPrecioProducto.setText( String.valueOf( "" ));
        txvResultado.setText( "" );
        txvPrecioInicial.setText( "" );
        txvIVA.setText( "" );
        txvPrecioFinal.setText( "" );
    }
}