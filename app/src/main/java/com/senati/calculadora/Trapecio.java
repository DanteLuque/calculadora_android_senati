package com.senati.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;

import java.text.DecimalFormat;

public class Trapecio extends AppCompatActivity {

    private EditText tv_base_mayor, tv_base_menor, tv_altura;
    private TextView tv_resultado;
    private ImageView img_trapecio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapecio);
        loadUI();
        cargarGIF();
    }

    // eventos
    public void hallarAreaTrapecio(View view){
        float baseMayor = Float.parseFloat(tv_base_mayor.getText().toString());
        float baseMenor = Float.parseFloat(tv_base_menor.getText().toString());
        float altura = Float.parseFloat(tv_altura.getText().toString());

        float area = ((baseMayor+baseMenor)/2)*altura;

        DecimalFormat formateo = new DecimalFormat("#.##");
        tv_resultado.setText(formateo.format(area));
    }
    // metodos
    public void loadUI(){
        tv_base_mayor = (EditText) findViewById(R.id.tv_base_mayor);
        tv_base_menor = (EditText) findViewById(R.id.tv_base_menor);
        tv_altura = (EditText) findViewById(R.id.tv_altura);
        tv_resultado = (TextView) findViewById(R.id.tv_resultado);
        img_trapecio = (ImageView) findViewById(R.id.img_trapecio);
    }

    public void cargarGIF(){
        Glide.with(this)
                .load(R.drawable.trapecio)
                .into(img_trapecio);
    }
}