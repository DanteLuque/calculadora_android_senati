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
    public void hallarAreaTrapecio(View view) {
        String baseMayorText = et_base_mayor.getText().toString();
        String baseMenorText = et_base_menor.getText().toString();
        String alturaText = et_altura.getText().toString();

        if (baseMayorText.isEmpty()) {
            et_base_mayor.setError("Ingrese un valor");
            return;
        }

        if (baseMenorText.isEmpty()) {
            et_base_menor.setError("Ingrese un valor");
            return;
        }

        if (alturaText.isEmpty()) {
            et_altura.setError("Ingrese un valor");
            return;
        }

        try {
            float area = calcular(baseMayorText, baseMenorText, alturaText);
            tv_resultado.setText(Helper.decimalFormateo(area));
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Ingrese valores válidos", Toast.LENGTH_SHORT).show();
        }
    }
    // metodos
    public float calcular(String baseMayorText, String baseMenorText, String alturaText) {
        float baseMayor = Float.parseFloat(baseMayorText);
        float baseMenor = Float.parseFloat(baseMenorText);
        float altura = Float.parseFloat(alturaText);
        return ((baseMayor + baseMenor) / 2) * altura;
    }

    public void loadUI(){
        et_base_mayor = (EditText) findViewById(R.id.et_base_mayor);
        et_base_menor = (EditText) findViewById(R.id.et_base_menor);
        et_altura = (EditText) findViewById(R.id.et_altura);
        tv_resultado = (TextView) findViewById(R.id.tv_resultado);
        img_trapecio = (ImageView) findViewById(R.id.img_trapecio);
    }

    public void cargarGIF(){
        Components.buildGIF(this, R.drawable.trapecio, img_trapecio);
    }
}