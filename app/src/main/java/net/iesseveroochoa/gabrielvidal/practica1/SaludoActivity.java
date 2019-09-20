package net.iesseveroochoa.gabrielvidal.practica1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SaludoActivity extends AppCompatActivity {
    public static String EXTRA_NOMBRE="net.iesseveroochoa.gabrielvidal.practica1.SaludoActivity.nombre";
    TextView tvSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);
        tvSaludo=findViewById(R.id.tv_Saludo);

        String nombre=this.getIntent().getStringExtra(EXTRA_NOMBRE);
        tvSaludo.setText(getResources().getString(R.string.saludo)+ " " +nombre);
    }
}
