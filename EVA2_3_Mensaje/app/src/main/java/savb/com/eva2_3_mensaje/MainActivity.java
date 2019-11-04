package savb.com.eva2_3_mensaje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Intent iSms;
    EditText et_tel,et_men;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_tel = findViewById(R.id.etTel);
        et_men = findViewById(R.id.etMen);
    }
    public void click(View v){
        String sTel = "smsto:" + et_tel.getText().toString();
        iSms = new Intent(Intent.ACTION_SENDTO, Uri.parse(sTel));
        iSms.putExtra("sms_body", et_men.getText().toString());
        startActivity(iSms);
    }
}
