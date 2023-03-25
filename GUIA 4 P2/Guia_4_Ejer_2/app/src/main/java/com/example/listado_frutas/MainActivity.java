package com.example.listado_frutas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;
    private ListView lv1;
    private String[] frutas={"1-Sandia", "2-Melon", "3-Uva", "4-Manzana","5-Arandanos","6-Naranja","7-Papaya","8-Durazno ",
            "9-Piña ", "10-Pera","11-Guineo ","12-Fresa ","13-Mango","14-Kiwi","15-limon","16-Mandarina ","17-Frambuesa ",
            "18-Cereza ", "19-Higo ","20-Maracuya"};

    private String[] Descripcion={"fruta dulce y jugosa de color verde por fuera y rojo por dentro",
            " fruta redonda y suave de color anaranjado de sabor dulce", " fruta dulce y pequeña de color morado y sabor dulce",
            "fruta suave y crujiente", "Fruta dulce y jugosa","una fruta redonda y suave con piel suave y pulpa dulce y jugosa.",
            " una fruta grande y espinosa con piel marrón y pulpa amarilla y dulce."
            ,"Frura dulce y jugosa","una fruta alargada y amarilla con una textura suave y sabor dulce.",
            " una pequeña fruta roja y dulce con una textura suave y sabor agridulce.",
            "una fruta grande y ovalada con piel amarilla o naranja y pulpa jugosa y dulce.",
            "una fruta pequeña y ovalada con piel marrón y peluda y pulpa verde y jugosa.",
            "una fruta pequeña y amarilla con una piel gruesa y pulpa ácida.",
            "una fruta pequeña y anaranjada con piel suave y pulpa jugosa y dulce.","Fruta pequeña de sabor agridulce",
            "una fruta pequeña y redonda con piel suave y pulpa dulce y jugosa.",
            "una fruta pequeña y redonda con piel suave y pulpa dulce y jugosa.",
            " fruta redonda y pequeña de piel resistente que se arruga cuando está madura"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv1);
        lv1 = (ListView) findViewById(R.id.lv1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, frutas);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                tv1.setText("Fruta : "+ lv1.getItemAtPosition(i)+" "+Descripcion[i]);
            }
        });


        }


}

