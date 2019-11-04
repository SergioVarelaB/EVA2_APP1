package savb.com.eva2_1_intentos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Intent inLanzar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inLanzar = new Intent(this,Secundaria.class);
    }
    public void click(View v){
        startActivity(inLanzar);
    }
}
