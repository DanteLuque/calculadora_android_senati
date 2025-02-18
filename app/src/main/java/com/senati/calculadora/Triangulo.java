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

public class Triangulo extends AppCompatActivity {

    private EditText tv_base, tv_altura;
    private TextView tv_resultado;
    private ImageView img_triangulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);
        loadUI();
        cargarGIF();
    }

    // eventos
    public void hallarAreaTriangulo(View view){
        float base = Float.parseFloat(tv_base.getText().toString());
        float altura = Float.parseFloat(tv_altura.getText().toString());

        float area = (base*altura)/2;

        DecimalFormat formateo = new DecimalFormat("#.##");
        tv_resultado.setText(formateo.format(area));
    }


    // metodos
    public void loadUI(){
        tv_base = (EditText) findViewById(R.id.tv_base);
        tv_altura = (EditText) findViewById(R.id.tv_altura);
        tv_resultado = (TextView) findViewById(R.id.tv_resultado);
        img_triangulo = (ImageView) findViewById(R.id.img_triangulo);
    }

    public void cargarGIF(){
        Glide.with(this)
                .load(R.drawable.triangulo)
                .into(img_triangulo);
    }
}