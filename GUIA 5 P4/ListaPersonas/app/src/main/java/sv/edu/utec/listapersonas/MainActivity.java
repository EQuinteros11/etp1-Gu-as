package sv.edu.utec.listapersonas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Persona>listapersonas;
    ListView lv1;
    Integer []ImgPpersonas={
            R.drawable.ana,
            R.drawable.carlos,
            R.drawable.fernanda,
            R.drawable.gustavo,
            R.drawable.jose,
            R.drawable.juan,
            R.drawable.karla,
            R.drawable.luis,
            R.drawable.maria,
            R.drawable.marta,
            R.drawable.pedro,
            R.drawable.silvia
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listapersonas = new ArrayList<Persona>();
        listapersonas.add(new Persona("Ana Perez", "27 Años", "1335 Tiara Fords, Suite 556, 69690, Kreigerhaven, Pennsylvania, United States",'f'));
        listapersonas.add(new Persona("Carlos Serrano", "32 Años ","771 America Prairie, Suite 600, 70456-9896, West Frieda, Maryland, United States",'m'));
        listapersonas.add(new Persona("Fernanda Quintanilla", "21 Años","955 Hoeger Track, Apt. 693, 38004-2979, Port Ora, Utah, United States",'f'));
        listapersonas.add(new Persona("Gustavo Acencio", "37 Años", "4307 Connie Hill, Suite 098, 22826, Immanuelview, Utah, United States",'m'));
        listapersonas.add(new Persona("Jose Martinez", "31 Años", "812 Adelle Mountain, Suite 966, 69719, Savionburgh, Kansas, United States",'m'));
        listapersonas.add(new Persona("Juan Villanueva", "34 Años", "8507 Raoul Manor, Suite 445, 76383, Kendrickside, Texas, United States",'m'));
        listapersonas.add(new Persona("Karla Rosales", "42 Años", "187 Deanna Harbor, Apt. 797, 61407-3461, Cummingsmouth, Tennessee, United States",'f'));
        listapersonas.add(new Persona("Luis Marroquin", "26 Años", "429 Rau Shoals, Apt. 334, 53135-0204, Kesslerside, Oklahoma, United States",'m'));
        listapersonas.add(new Persona("Maria Ortiz", "24 Años", "70661 Daugherty Loaf, Apt. 031, 68987, West Annabelle, Delaware, United States",'f'));
        listapersonas.add(new Persona("Marta Lopez", "28 Años", "32464 Jace Terrace, Suite 987, 97708-6770, Port Lilyanchester, Georgia, United States",'f'));
        listapersonas.add(new Persona("Pedro Cruz", "38 Años", "07048 Macey Islands, Suite 472, 68018-6483, Stephanieland, Oregon, United States",'m'));
        listapersonas.add(new Persona("Silvia Lemus", "25 Años", "63900 Dane Mill, Apt. 748, 51991, Blandaberg, Minnesota, United States",'f'));

        AdaptadorPersonas adaptador = new AdaptadorPersonas(this);
        lv1 = findViewById(R.id.lsvPersonas);
        lv1.setAdapter(adaptador);
    }
    class AdaptadorPersonas extends ArrayAdapter<Persona>{
        AppCompatActivity appCompatActivity;
        AdaptadorPersonas(AppCompatActivity context){
            super(context, R.layout.persona, listapersonas);
            appCompatActivity=context;
        }
        public View getView(int position, View coinvertView, ViewGroup parent){
            LayoutInflater inflater = appCompatActivity.getLayoutInflater();
            View item = inflater.inflate(R.layout.persona, null);

            TextView textView1=item.findViewById(R.id.tvNombre);
            textView1.setText(listapersonas.get(position).getNombre());

            TextView textView2=item.findViewById(R.id.tvEdad);
            textView2.setText(listapersonas.get(position).getEdad());

            TextView textView3=item.findViewById(R.id.tvDirec);
            textView3.setText(listapersonas.get(position).getDireccion());

            ImageView imageView1=item.findViewById(R.id.imvFoto);
            imageView1.setImageResource(ImgPpersonas[position]);
            return(item);
        }
    }
}