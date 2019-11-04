package savb.com.eva2_2_intentos_llamada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
    Intent marcar;
    EditText eT_Tel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eT_Tel = findViewById(R.id.eT_telefono);

    }
    public void click(View v){
        View btn = findViewById(R.id.btnAC);
        String sTel = "tel:" + eT_Tel.getText().toString();
        if(v == btn) {
            marcar = new Intent(Intent.ACTION_CALL, Uri.parse(sTel));
        }else{
            marcar = new Intent(Intent.ACTION_DIAL, Uri.parse(sTel));
        }
        startActivity(marcar);
    }
}
