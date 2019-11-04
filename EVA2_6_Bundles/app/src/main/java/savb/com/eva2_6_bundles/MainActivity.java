package savb.com.eva2_6_bundles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    EditText edNombre, edTelefono, edEdad, edCorreo;
    RadioGroup rgSexo;
    Intent inDatos;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        edNombre = findViewById(R.id.etNombre);
        edTelefono = findViewById(R.id.etTel);
        edEdad = findViewById(R.id.etEdad);
        edCorreo = findViewById(R.id.etCorreo);
        rgSexo = findViewById(R.id.rgGenero);
        inDatos = new Intent(getApplicationContext(),Secundaria.class);
    }
    public void click(View v){
        //ingresar datos
        Bundle bundle = new Bundle();
        bundle.putString("nombre",edNombre.getText().toString());
        bundle.putString("correo",edCorreo.getText().toString());
        int telefono = Integer.parseInt(edTelefono.getText().toString());
        int edad = Integer.parseInt(edEdad.getText().toString());
        bundle.putInt("telefono",telefono);
        bundle.putInt("edad",edad);
        int iSexo;
        if(rgSexo.getCheckedRadioButtonId() == R.id.rbHombre){
            iSexo = 0;
        }else if(rgSexo.getCheckedRadioButtonId() == R.id.rbMujer){
            iSexo = 1;
        }else {
            iSexo = 2;
        }

        bundle.putInt("sexo", iSexo);
        inDatos.putExtras(bundle);
        startActivity(inDatos);
    }
}
