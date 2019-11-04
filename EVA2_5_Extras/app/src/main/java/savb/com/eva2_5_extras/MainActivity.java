package savb.com.eva2_5_extras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Intent inLanzar;
    EditText etExtra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etExtra = findViewById(R.id.etExtra);
        inLanzar = new Intent(this, Secundaria.class);
    }
    public void click(View v){
        String sText = etExtra.getText().toString();
        inLanzar.putExtra("texto", sText);
        startActivity(inLanzar);

    }
}
