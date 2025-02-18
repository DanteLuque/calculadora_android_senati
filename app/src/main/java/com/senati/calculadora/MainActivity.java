package com.senati.calculadora;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private ImageView img_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadUI();
        cargarGIF();
    }

    public void redirectMenu(View view){
        Intent intent = new Intent(getApplicationContext(), Menu.class);
        startActivity(intent);
    }

    public void loadUI(){
         img_main = (ImageView) findViewById(R.id.img_main);
    }

    public void cargarGIF(){
        Glide.with(this)
                .load(R.drawable.calculadora)
                .into(img_main);
    }
}