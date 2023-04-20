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
    private String[] frutas={"1 - Sandia: fruta dulce y jugosa de color verde por fuera y rojo por dentro",
            "2 - Melon: fruta redonda y suave de color anaranjado de sabor dulce",
            "3 - Uva: fruta suave y crujiente\", \"Fruta dulce y jugosa",
            "4 - Manzana: una fruta redonda y suave con piel suave y pulpa dulce y jugosa.",
            "5 - Arandanos: fruta dulce y pequeña de color morado y sabor dulce",
            "6 - Naranja: Frura dulce y jugosa",
            "7 - Papaya: una fruta grande y alargada con piel amarilla y naranja con pulpa amarilla y dulce.",
            "8 - Durazno: una fruta pequeña y redonda con piel amarilla y pulpa naranja y dulce.",
            "9 - Piña: una fruta grande y espinosa con piel marrón y pulpa amarilla y dulce.",
            "10 - Pera: una fruta mediana y alargada con piel verde y pulpa dulce.",
            "11 - Guineo: una fruta alargada y amarilla con una textura suave y sabor dulce.",
            "12 - Fresa: una pequeña fruta roja y dulce con una textura suave y sabor agridulce.",
            "13 - Mango: una fruta grande y ovalada con piel amarilla o naranja y pulpa jugosa y dulce.",
            "14 - Kiwi: una fruta pequeña y ovalada con piel marrón y peluda y pulpa verde y jugosa.",
            "15 - limon: una fruta pequeña y amarilla con una piel gruesa y pulpa ácida.",
            "16 - Mandarina: una fruta pequeña y anaranjada con piel suave y pulpa jugosa y dulce.",
            "17 - Frambuesa: Fruta pequeña de sabor agridulce",
            "18 - Cereza: una fruta pequeña y redonda con piel suave y pulpa dulce y jugosa",
            "19 - Higo: una fruta pequeña y redonda con piel suave y pulpa dulce y jugosa.",
            "20 - Maracuya: fruta redonda y pequeña de piel resistente que se arruga cuando está madura",
            "21 - Sandia: fruta redonda y grande de cascara resistente",
            "22 - Toronja: fruta redonda Agria",
            "23 - Guayava: fruta redonda dulces",
            "24 - Arayan: fruta agridulce",
            "25 - Carambola: fruta agridulce recomendada en refrescos"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv1);
        lv1 = (ListView) findViewById(R.id.lv1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, frutas);
        lv1.setAdapter(adapter);
        }


}

