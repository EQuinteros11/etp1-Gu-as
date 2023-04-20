package utec.edu.sv.listaperson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView lstperson;
ArrayAdapter<CharSequence> adaptador;
ArrayAdapter adaptations;
    ArrayList<String> ListadodePersonas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstperson = findViewById(R.id.lstperson);

        ListadodePersonas= new ArrayList<>();
        ListadodePersonas.add("Nombre: Juan\nEdad: 22 años \nDirección: San Salvador");
        ListadodePersonas.add("Nombre: Elias\nEdad: 28 años \nDirección: Santa Tecla");
        ListadodePersonas.add("Nombre: Bryan\nEdad: 20 años \nDirección: San Salvador");
        ListadodePersonas.add("Nombre: Jhonatan\nEdad: 42 años \nDirección: Sonsonate");
        ListadodePersonas.add("Nombre: Daniel\nEdad: 50 años \nDirección: San Salvador");
        ListadodePersonas.add("Nombre: Diana\nEdad: 22 años \nDirección: San Salvador");
        ListadodePersonas.add("Nombre: Jose\nEdad: 20 años \nDirección: San Salvador");
        ListadodePersonas.add("Nombre: Julia\nEdad: 78 años \nDirección: San Salvador");
        ListadodePersonas.add("Nombre: lilian\nEdad: 41 años \nDirección: San Salvador");
        ListadodePersonas.add("Nombre: Mariabel\nEdad: 22 años \nDirección: San Salvador");
        ListadodePersonas.add("Nombre: Andrea\nEdad: 22 años \nDirección: San Salvador");
        ListadodePersonas.add("Nombre: Marlon\nEdad: 22 años \nDirección: San Salvador");
        ListadodePersonas.add("Nombre: Francisco\nEdad: 22 años \nDirección: San Salvador");
        ListadodePersonas.add("Nombre: Rosa\nEdad: 22 años \nDirección: San Salvador");
        ListadodePersonas.add("Nombre: Ivan\nEdad: 22 años \nDirección: San Salvador");


        adaptations= new ArrayAdapter(this,android.R.layout.simple_list_item_1,ListadodePersonas);

        lstperson.setAdapter(adaptations);

        lstperson.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(),"Selecciono\n"+parent.getItemAtPosition(position).toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}