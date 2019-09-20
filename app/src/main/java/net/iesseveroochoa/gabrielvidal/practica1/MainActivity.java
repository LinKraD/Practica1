package net.iesseveroochoa.gabrielvidal.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {
    EditText etNombre;
    Button btAceptar;
    Button btDimeHora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNombre=findViewById(R.id.et_Nombre);
        btAceptar=findViewById(R.id.bt_Aceptar);
        btDimeHora=findViewById(R.id.bt_Hora);

        btAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, SaludoActivity.class);
                intent.putExtra(SaludoActivity.EXTRA_NOMBRE, etNombre.getText().toString());
                startActivity(intent);
            }
        });

        btDimeHora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(MainActivity.this, HoraActivity.class);
                Calendar calendario=new GregorianCalendar();

                String hora=calendario.get(Calendar.HOUR_OF_DAY)+":"+calendario.get(Calendar.MINUTE)+":"+calendario.get(Calendar.SECOND);

                intent2.putExtra(HoraActivity.EXTRA_HORA,hora);
                startActivity(intent2);
            }
        });
    }
}
