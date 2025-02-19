package com.senati.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Trapecio extends AppCompatActivity {

    private EditText et_base_mayor, et_base_menor, et_altura;
    private TextView tv_resultado;
    private ImageView img_trapecio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapecio);
        Components.buildToolbar(this, R.id.toolbar);
        loadUI();
        cargarGIF();
    }

    // eventos
    public void hallarAreaTrapecio(View view){
        float baseMayor = Float.parseFloat(et_base_mayor.getText().toString());
        float baseMenor = Float.parseFloat(et_base_menor.getText().toString());
        float altura = Float.parseFloat(et_altura.getText().toString());

        float area = ((baseMayor+baseMenor)/2)*altura;

        tv_resultado.setText(Helper.decimalFormateo(area));
    }
    // metodos
    public void loadUI(){
        et_base_mayor = (EditText) findViewById(R.id.et_base_mayor);
        et_base_menor = (EditText) findViewById(R.id.et_base_menor);
        et_altura = (EditText) findViewById(R.id.et_altura);
        tv_resultado = (TextView) findViewById(R.id.tv_resultado);
        img_trapecio = (ImageView) findViewById(R.id.img_trapecio);
    }

    public void cargarGIF(){
        Helper.cargarGIF(this, R.drawable.trapecio, img_trapecio);
    }
}