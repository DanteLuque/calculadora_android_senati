package com.senati.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Triangulo extends AppCompatActivity {

    private EditText tv_base, tv_altura;
    private TextView tv_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);

        loadUI();
    }

    public void hallarAreaTriangulo(View view){
        float base = Float.parseFloat(tv_base.getText().toString());
        float altura = Float.parseFloat(tv_altura.getText().toString());

        float area = (base*altura)/2;

        tv_resultado.setText(String.valueOf(area));
    }


    public void loadUI(){
        tv_base = (EditText) findViewById(R.id.tv_base);
        tv_altura = (EditText) findViewById(R.id.tv_altura);
        tv_resultado = (TextView) findViewById(R.id.tv_resultado);
    }
}