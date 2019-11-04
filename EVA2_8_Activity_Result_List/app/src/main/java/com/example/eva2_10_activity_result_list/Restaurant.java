package com.example.eva2_10_activity_result_list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Restaurant extends AppCompatActivity implements AdapterView.OnItemClickListener {
    Restaurants_class[] restaurantes = {
            new Restaurants_class(),
            new Restaurants_class(R.drawable.f1, "on the Bridge", "cena bajo un puente"),
            new Restaurants_class(R.drawable.f2, "Sushi kito", "comida japonesa/peruana"),
            new Restaurants_class(R.drawable.f3, "El Hormigero", "coma como oso hormigero"),
            new Restaurants_class(R.drawable.f1, "on the Bridge", "cena bajo un puente"),
            new Restaurants_class(R.drawable.f2, "Sushi kito", "comida japonesa/peruana"),
            new Restaurants_class(R.drawable.f3, "El Hormigero", "coma como oso hormigero"),
            new Restaurants_class(R.drawable.f1, "on the Bridge", "cena bajo un puente"),
            new Restaurants_class(R.drawable.f2, "Sushi kito", "comida japonesa/peruana"),
            new Restaurants_class(R.drawable.f3, "El Hormigero", "coma como oso hormigero"),
            new Restaurants_class(R.drawable.f1, "on the Bridge", "cena bajo un puente"),
            new Restaurants_class(R.drawable.f2, "Sushi kito", "comida japonesa/peruana"),
            new Restaurants_class(R.drawable.f3, "El Hormigero", "coma como oso hormigero"),
    };

    ListView listaRestaurantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
        listaRestaurantes = findViewById(R.id.ListaRestaurants);
        listaRestaurantes.setAdapter(new RestaurantAdapter(this, R.layout.layout_restaurant, restaurantes));
        listaRestaurantes.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        //Toast.makeText(this, restaurantes[i].getNombre(), Toast.LENGTH_SHORT).show();
        String restaurant = restaurantes[i].getNombre() + "\n" + restaurantes[i].getDescripcion();
        int imagen = restaurantes[i].getImagen();
        Intent intent = new Intent();
        intent.putExtra("res", restaurant);
        intent.putExtra("ima", imagen);
        setResult(RESULT_OK, intent);
        finish();
    }

}
