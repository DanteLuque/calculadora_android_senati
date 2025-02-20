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

public class Rombo extends AppCompatActivity {

    private EditText et_diagonal_mayor, et_diagonal_menor;
    private TextView tv_resultado;
    private ImageView img_rombo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rombo);
        Components.buildToolbar(this, R.id.toolbar);
        loadUI();
        cargarGIF();
    }

    // eventos
    public void hallarAreaRombo(View view){
        String diagonalMayorText = et_diagonal_mayor.getText().toString();
        String diagonalMenorText = et_diagonal_menor.getText().toString();

        if (diagonalMayorText.isEmpty()) {
            et_diagonal_mayor.setError("Ingrese un valor");
            return;
        }

        if(diagonalMenorText.isEmpty()){
            et_diagonal_menor.setError("Ingrese un valor");
            return;
        }

        try{
            float area = calcular(diagonalMayorText, diagonalMenorText);
            tv_resultado.setText(Helper.decimalFormateo(area));
        }catch (NumberFormatException e){
            Toast.makeText(this,"Ingrese valores válidos",Toast.LENGTH_SHORT).show();
        }
    }

    // metodos
    public float calcular(String diagonalMayorText, String diagonalMenorText){
        float diagonalMayor = Float.parseFloat(diagonalMayorText);
        float diagonalMenor = Float.parseFloat(diagonalMenorText);

        return (diagonalMayor * diagonalMenor) / 2;
    }
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