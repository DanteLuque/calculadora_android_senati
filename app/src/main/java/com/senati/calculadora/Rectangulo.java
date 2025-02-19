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

public class Rectangulo extends AppCompatActivity {

    private EditText et_base, et_altura;
    private TextView tv_resultado;
    private ImageView img_rectangulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo);
        loadUI();
        cargarGIF();
    }

    // eventos
    public void hallarAreaRectangulo(View view){
        float base = Float.parseFloat(et_base.getText().toString());
        float altura = Float.parseFloat(et_altura.getText().toString());

        float area = base*altura;

        tv_resultado.setText(Helper.decimalFormateo(area));
    }


    // metodos
    public void loadUI(){
        et_base = (EditText) findViewById(R.id.et_base);
        et_altura = (EditText) findViewById(R.id.et_altura);
        tv_resultado = (TextView) findViewById(R.id.tv_resultado);
        img_rectangulo = (ImageView) findViewById(R.id.img_rectangulo);
    }

    public void cargarGIF(){
        Helper.cargarGIF(this, R.drawable.rectangulo, img_rectangulo);
    }
}