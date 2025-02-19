package com.senati.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Circulo extends AppCompatActivity {

    private EditText et_radio;
    private TextView tv_resultado;
    private ImageView img_circulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);
        loadUI();
        cargarGIF();
    }

    // eventos
    public void hallarAreaCirculo(View view){
        float radio = Float.parseFloat(et_radio.getText().toString());

        float area = (float) (Math.PI * Math.pow(radio, 2));

        tv_resultado.setText(Helper.decimalFormateo(area));
    }


    // metodos
    public void loadUI(){
        et_radio = (EditText) findViewById(R.id.et_radio);
        tv_resultado = (TextView) findViewById(R.id.tv_resultado);
        img_circulo = (ImageView) findViewById(R.id.img_circulo);
    }

    public void cargarGIF(){
        Helper.cargarGIF(this, R.drawable.circulo, img_circulo);
    }
}