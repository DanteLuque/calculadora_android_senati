package com.senati.calculadora;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;


import com.bumptech.glide.Glide;
import com.senati.calculadora.modules.Circulo;
import com.senati.calculadora.modules.Rectangulo;
import com.senati.calculadora.modules.Rombo;
import com.senati.calculadora.modules.Trapecio;
import com.senati.calculadora.modules.Triangulo;
import com.senati.calculadora.utils.Components;

public class Menu extends AppCompatActivity {

    private ImageView img_menu;
    private int[] gifs = new int[] {
            R.drawable.triangulo,
            R.drawable.trapecio,
            R.drawable.rectangulo,
            R.drawable.circulo,
            R.drawable.rombo
    };
    private int indiceActualGif = 0;
    private Handler handler = new Handler(); // tareas periodicas

    private Runnable runCambioGif = new Runnable() {
        @Override
        public void run() {
            if(isFinishing()) return;
            Glide.with(Menu.this)
                    .load(gifs[indiceActualGif])
                    .into(img_menu);

            indiceActualGif = (indiceActualGif+1) % gifs.length;

            handler.postDelayed(this,4000);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Components.buildToolbar(this, R.id.toolbar);
        loadUI();
    }

    @Override
    protected void onResume() {
        super.onResume();
        handler.post(runCambioGif);
    }

    @Override
    protected void onPause() {
        super.onPause();
        handler.removeCallbacks(runCambioGif);
    }

    // eventos
    public void redirectTriangulo(View view){
        Intent intent = new Intent(getApplicationContext(), Triangulo.class);
        startActivity(intent);
    }

    public void redirectTrapecio(View view){
        Intent intent = new Intent(getApplicationContext(), Trapecio.class);
        startActivity(intent);
    }

    public void redirectRectangulo(View view){
        Intent intent = new Intent(getApplicationContext(), Rectangulo.class);
        startActivity(intent);
    }

    public void redirectCirculo(View view){
        Intent intent = new Intent(getApplicationContext(), Circulo.class);
        startActivity(intent);
    }

    public void redirectRombo(View view){
        Intent intent = new Intent(getApplicationContext(), Rombo.class);
        startActivity(intent);
    }

    // metodos
    public void loadUI(){
        img_menu = (ImageView) findViewById(R.id.img_menu);
    }



}