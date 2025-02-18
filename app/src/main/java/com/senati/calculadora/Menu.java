package com.senati.calculadora;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;

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

    // metodos
    public void loadUI(){
        img_menu = (ImageView) findViewById(R.id.img_menu);
    }



}