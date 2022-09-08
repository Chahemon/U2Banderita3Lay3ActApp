package mx.edu.itl.c19130897.u2banderita3lay3actapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnSiguienteClick ( View v ) {
        // Hacemos transicion al activity de la bandera 2
        Intent intent = new Intent ( this, Bandera2Activity.class );
        startActivity ( intent );
    }

    public void btnAcercaDeClick ( View v ) {

    }

    public void btnSalirClick ( View v ) { finish (); }

}