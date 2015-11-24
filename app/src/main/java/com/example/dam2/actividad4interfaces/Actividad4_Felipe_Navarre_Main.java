package com.example.dam2.actividad4interfaces;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Actividad4_Felipe_Navarre_Main extends Activity {
    ImageView escudo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad4__felipe__navarre__main);
        escudo=(ImageView)findViewById(R.id.escudo);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_actividad4__felipe__navarre__main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id) {
            case R.id.campeonato:
                Toast.makeText(this, "Copa de Coñac de S.M. el Guey", Toast.LENGTH_LONG).show();
                escudo.setVisibility(View.INVISIBLE);
                return true;
            case R.id.primero:
                escudo.setImageResource(R.drawable.images);
                escudo.setVisibility(View.VISIBLE);
                Toast.makeText(this, "Copa de Coñac de S.M. el Guey", Toast.LENGTH_SHORT).show();
                Toast.makeText(this, "Somos los campeones", Toast.LENGTH_LONG).show();
                return true;
            case R.id.segundo:
                Toast.makeText(this, "Copa de Coñac de S.M. el Guey", Toast.LENGTH_SHORT).show();
                Toast.makeText(this, "Somos los primeros perdedores", Toast.LENGTH_LONG).show();
                return true;
            case R.id.tercero:
                Toast.makeText(this, "Copa de Coñac de S.M. el Guey", Toast.LENGTH_SHORT).show();
                Toast.makeText(this, "Almenos ganamos el último partido", Toast.LENGTH_LONG).show();
                return true;
            case R.id.cuarto:
                Toast.makeText(this, "Copa de Coñac de S.M. el Guey", Toast.LENGTH_SHORT).show();
                Toast.makeText(this, "Copa de madera", Toast.LENGTH_LONG).show();
                return true;
            case R.id.quartos:
                Toast.makeText(this, "Copa de Coñac de S.M. el Guey", Toast.LENGTH_SHORT).show();
                Toast.makeText(this, "invitados de piedra", Toast.LENGTH_LONG).show();


        }
        //noinspection SimplifiableIfStatement
        /*if (id == R.id.campeonato) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }
}
