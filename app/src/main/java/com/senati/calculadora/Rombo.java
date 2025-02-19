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

public class Rombo extends AppCompatActivity {

    private EditText et_diagonal_mayor, et_diagonal_menor;
    private TextView tv_resultado;
    private ImageView img_rombo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rombo);
        loadUI();
        cargarGIF();
    }

    // eventos
    public void hallarAreaCirculo(View view){
        float diagonalMayor = Float.parseFloat(et_diagonal_mayor.getText().toString());
        float diagonalMenor = Float.parseFloat(et_diagonal_menor.getText().toString());

        float area = (diagonalMayor*diagonalMenor)/2;

        tv_resultado.setText(Helper.decimalFormateo(area));
    }


    // metodos
    public void loadUI(){
        et_diagonal_mayor = (EditText) findViewById(R.id.et_diagonal_mayor);
        et_diagonal_menor = (EditText) findViewById(R.id.et_diagonal_menor);
        tv_resultado = (TextView) findViewById(R.id.tv_resultado);
        img_rombo = (ImageView) findViewById(R.id.img_rombo);
    }

    public void cargarGIF(){
        Helper.cargarGIF(this, R.drawable.rombo, img_rombo);
    }
}