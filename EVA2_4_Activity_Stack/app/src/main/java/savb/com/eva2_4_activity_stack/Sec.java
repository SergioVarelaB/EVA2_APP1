package savb.com.eva2_4_activity_stack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Sec extends AppCompatActivity {
    //Intent iBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);
        //iBack = new Intent(this, MainActivity.class);//esto no se hace ya que crea muchas actividades de 0
    }

    public void clickSec(View v){
        finish();//esto si para regresar en las actividades
        

    }

}
