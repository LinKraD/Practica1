package net.iesseveroochoa.gabrielvidal.practica1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HoraActivity extends AppCompatActivity {
    public static String EXTRA_HORA="net.iesseveroochoa.gabrielvidal.practica1.HoraActivity.hora";
    TextView tvTextoHora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hora);
        tvTextoHora=findViewById(R.id.tv_HoraTexto);

        String texto=this.getIntent().getStringExtra(EXTRA_HORA);
        tvTextoHora.setText("La hora a la que has pulsado el botón es "+texto+" y mi nombre es "+getResources().getString(R.string.minombre));

    }
}
