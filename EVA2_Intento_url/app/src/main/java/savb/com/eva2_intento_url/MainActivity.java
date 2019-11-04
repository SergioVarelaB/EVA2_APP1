package savb.com.eva2_intento_url;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Intent inUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View v){
            int ran = (int)(Math.random()*3);
            String[] arr = {"https://www.youtube.com/watch?v=dQw4w9WgXcQ", "https://www.youtube.com/watch?v=Vbg2-1FncpA" , "https://www.youtube.com/watch?v=PaoCQHwTPg4" };
            inUrl = new Intent(Intent.ACTION_VIEW,Uri.parse(arr[ran]));
            startActivity(inUrl);
    }
}
