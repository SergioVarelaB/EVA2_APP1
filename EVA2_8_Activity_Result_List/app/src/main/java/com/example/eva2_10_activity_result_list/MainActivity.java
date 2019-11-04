package com.example.eva2_10_activity_result_list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnRes,btnClima;
    Intent intento,intento2;
    ImageView ivClima, ivRes;
    TextView tvClima , tvRes;
    private static final int SECOND_ACTIVITY_REQUEST_CODE = 0;
    private static final int Third_ACTIVITY_REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnClima = findViewById(R.id.btnClima);
        btnRes = findViewById(R.id.btnRestaurant);
        intento = new Intent(this,Clima.class);
        intento2 = new Intent(this,Restaurant.class);
        btnClima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(intento, SECOND_ACTIVITY_REQUEST_CODE);
                //startActivity(intento);
            }
        });
        btnRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(intento2, Third_ACTIVITY_REQUEST_CODE);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

       // Toast.makeText(this,"jj",Toast.LENGTH_LONG).show();
        // Check that it is the SecondActivity with an OK result
        if (requestCode == SECOND_ACTIVITY_REQUEST_CODE) {
            if (resultCode == RESULT_OK) {

                // Get String data from Intent
                String returnString = data.getStringExtra("keyName");
                int imagen = data.getIntExtra("imagen",R.drawable.sunny);

                // Set text view with string
                tvClima = findViewById(R.id.tvClima);
                ivClima = findViewById(R.id.ivClima);
                ivClima.setImageResource(imagen);
                tvClima.setText(returnString);

            }
        }
        if (requestCode == Third_ACTIVITY_REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                // Get String data from Intent
                String returnString = data.getStringExtra("res");
                int imagen = data.getIntExtra("ima",R.drawable.sunny);
                // Set text view with string
                tvRes = findViewById(R.id.tvRes);
                ivRes = findViewById(R.id.ivRes);
                ivRes.setImageResource(imagen);
                tvRes.setText(returnString);

            }
        }

    }

}
