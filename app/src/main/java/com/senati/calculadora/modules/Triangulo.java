package com.senati.calculadora.modules;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.senati.calculadora.utils.Components;
import com.senati.calculadora.utils.Helper;
import com.senati.calculadora.R;

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
    public void hallarAreaTriangulo(View view) {
        String baseText = et_base.getText().toString();
        String alturaText = et_altura.getText().toString();

        if (baseText.isEmpty()) {
            et_base.setError("Ingrese un valor");
            return;
        }

        if (alturaText.isEmpty()) {
            et_altura.setError("Ingrese un valor");
            return;
        }

        try {
            float area = calcular(baseText, alturaText);
            tv_resultado.setText(Helper.decimalFormateo(area));
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Ingrese valores válidos", Toast.LENGTH_SHORT).show();
        }
    }

    // Métodos
    public float calcular(String baseText, String alturaText) {
        float base = Float.parseFloat(baseText);
        float altura = Float.parseFloat(alturaText);
        return (base * altura) / 2;
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