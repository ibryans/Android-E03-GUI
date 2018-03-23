package br.ufmg.coltec.tp.e03_layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button splash = findViewById(R.id.splash_button);
        Button noticia = findViewById(R.id.noticia_button);
        Button previsao = findViewById(R.id.previsao_button);
        Button formulario = findViewById(R.id.formulario_button);

        splash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,
                        SplashScreenActivity.class);
                startActivity(intent);
            }
        });


        noticia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,
                        NoticiaActivity.class);
                startActivity(intent);
            }
        });


        previsao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,
                        PrevisaoActivity.class);
                startActivity(intent);
            }
        });

        formulario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,
                        FormularioActivity.class);
                startActivity(intent);
            }
        });

    }
}
