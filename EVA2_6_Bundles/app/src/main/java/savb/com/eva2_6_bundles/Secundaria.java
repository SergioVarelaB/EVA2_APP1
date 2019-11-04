package savb.com.eva2_6_bundles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Secundaria extends AppCompatActivity {
    TextView tvRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        tvRes = findViewById(R.id.tvResultados);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        tvRes.append(bundle.getString("nombre")+ "\n");
        tvRes.append(bundle.getInt("telefono")+ "\n");
        tvRes.append(bundle.getInt("edad")+ "\n");
        tvRes.append(bundle.getString("correo")+ "\n");
        switch (bundle.getInt("sexo")){
            case 0:
                tvRes.append("Hombre");
                break;
            case 1:
                tvRes.append("Mujer");
                break;
            case 3:
                tvRes.append("Demonio");
                break;
        }
    }
}
