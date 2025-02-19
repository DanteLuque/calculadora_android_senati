package com.senati.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Triangulo extends AppCompatActivity {

    private EditText et_base, et_altura;
    private TextView tv_resultado;
    private ImageView img_triangulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);
        Components.buildToolbar(this, R.id.toolbar);
        loadUI();
        cargarGIF();
    }

    // eventos
    public void hallarAreaTriangulo(View view){
        float base = Float.parseFloat(et_base.getText().toString());
        float altura = Float.parseFloat(et_altura.getText().toString());

        float area = (base*altura)/2;

        tv_resultado.setText(Helper.decimalFormateo(area));
    }


    // metodos
    public void loadUI(){
        et_base = (EditText) findViewById(R.id.et_base);
        et_altura = (EditText) findViewById(R.id.et_altura);
        tv_resultado = (TextView) findViewById(R.id.tv_resultado);
        img_triangulo = (ImageView) findViewById(R.id.img_triangulo);
    }

    public void cargarGIF(){
        Helper.cargarGIF(this, R.drawable.triangulo, img_triangulo);
    }
}