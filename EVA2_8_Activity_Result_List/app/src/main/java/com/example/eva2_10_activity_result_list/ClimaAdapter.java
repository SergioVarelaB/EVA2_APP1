package com.example.eva2_10_activity_result_list;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ClimaAdapter extends ArrayAdapter<Clima_class> {

    Context context;
    int resource;
    Clima_class[] Ciudades;

    public ClimaAdapter(Context context, int resource, Clima_class[] objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.Ciudades = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        TextView txtCiudad, txtTemp, textView;

        if(convertView == null){
            //Crear nuestro layout que representa una fila en la lista
            //INFLATER
            LayoutInflater lInflator = ((Activity) context).getLayoutInflater();
            convertView = lInflator.inflate(resource, parent, false);
        }

        imageView = convertView.findViewById(R.id.imageView);
        txtCiudad = convertView.findViewById(R.id.txtCiudad);
        txtTemp = convertView.findViewById(R.id.txtTemp);
        textView = convertView.findViewById(R.id.textView);

        imageView.setImageResource(Ciudades[position].getImagen());
        txtCiudad.setText(Ciudades[position].getCiudad());
        txtTemp.setText(Ciudades[position].getTemp() + "C");
        textView.setText(Ciudades[position].getClima());

        return convertView;
    }
}
