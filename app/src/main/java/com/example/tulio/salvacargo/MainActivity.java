package com.example.tulio.salvacargo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tulio.salvacargo.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    private Button ingresar, registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ingresar= (Button) findViewById(R.id.BotonIngresar);
        registrar= (Button) findViewById(R.id.BotonRegistro);

        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cambio=new Intent(MainActivity.this, LoginActivity.class);
                startActivity(cambio);
                finish();
            }
        });
    }
}
