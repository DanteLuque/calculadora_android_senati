package com.senati.calculadora;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.senati.calculadora.utils.Components;

public class MainActivity extends AppCompatActivity {

    private ImageView img_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadUI();
        cargarGIF();
    }

    // eventos
    public void redirectMenu(View view){
        Intent intent = new Intent(getApplicationContext(), Menu.class);
        startActivity(intent);
    }

    // metodos
    public void loadUI(){
         img_main = (ImageView) findViewById(R.id.img_main);
    }

    public void cargarGIF(){
        Components.buildGIF(this, R.drawable.calculadora, img_main);
    }
}