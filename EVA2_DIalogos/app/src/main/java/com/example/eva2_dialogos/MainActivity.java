package com.example.eva2_dialogos;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickEstandar(View v){
        new AlertDialog.Builder(this)
                .setTitle("Hola que tranza")
                .setMessage("Que royo, soy un mensaje")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Action
                        Toast.makeText(getApplicationContext(),"holi soy un toast de ok",Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("nel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"holi soy un toast de nel prro",Toast.LENGTH_SHORT).show();
                    }
                })
                .setNeutralButton("pos me da igual", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"holi soy un toast de que no importa",Toast.LENGTH_SHORT).show();
                    }
                }).create().show();

    }
    public void clickPropio(View v){
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.activity_dialogo);
        //vincular los widgets
        final EditText etName;
        Button btn;

        etName = dialog.findViewById(R.id.etName);
        btn = dialog.findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cadena = etName.getText().toString();
                Toast.makeText(getApplicationContext(),cadena,Toast.LENGTH_LONG).show();
                dialog.dismiss();
            }
        });
        dialog.show();

    }
}
