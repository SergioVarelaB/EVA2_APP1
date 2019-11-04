package com.example.eva2_10_activity_result_list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Clima extends AppCompatActivity implements AdapterView.OnItemClickListener {
        Clima_class[] Ciudades = {
        new Clima_class(),
        new Clima_class(R.drawable.sunny, "Camargo", 25, "Apenas pa un 12"),
        new Clima_class(R.drawable.rainy, "Delicias", 18, "2 Triquis"),
        new Clima_class(R.drawable.atmospher, "Parrar", 14, "Normal"),
        new Clima_class(R.drawable.cloudy, "Chihuahua", 21, "likea (hell)"),
        new Clima_class(R.drawable.tornado, "Juarez", 23, "se pronostican lluvias de balas"),
        };
        Intent intento, iRegresar;
        ListView listaClima;
        private static final int SECOND_ACTIVITY_REQUEST_CODE = 0;

        @Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clima);
        //Toast.makeText(this,"jajaj",Toast.LENGTH_LONG).show();
        listaClima = findViewById(R.id.listaClima);
        listaClima.setAdapter(new ClimaAdapter(this, R.layout.layout_clima, Ciudades));
        listaClima.setOnItemClickListener(this);
        }


@Override
public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        //Toast.makeText(this, Ciudades[i].getCiudad(), Toast.LENGTH_SHORT).show();
        String ciudad = Ciudades[i].getCiudad() + "\n" + Ciudades[i].getClima() + "\n" + Ciudades[i].getTemp();
        int imagen = Ciudades[i].getImagen();
        Intent intent = new Intent();
        intent.putExtra("keyName", ciudad);
        intent.putExtra("imagen", Ciudades[i].getImagen());
        setResult(RESULT_OK, intent);
        finish();
        }
}