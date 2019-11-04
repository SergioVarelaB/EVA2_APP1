package savb.com.eva2_5_extras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Secundaria extends AppCompatActivity {
    TextView tvText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        tvText = findViewById(R.id.tvText);
        Intent intent = getIntent();
        tvText.setText(intent.getStringExtra("texto"));
        //Toast.makeText(this,intent.getStringExtra("datos"))

    }
    public void ClickSec(View v){
        finish();

    }
}
