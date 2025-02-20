package com.senati.calculadora.utils;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Components {
    public static void buildToolbar(AppCompatActivity activity, int toolbarId) {
        Toolbar toolbar = activity.findViewById(toolbarId);
        activity.setSupportActionBar(toolbar);
/*
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity.getOnBackPressedDispatcher().onBackPressed();
            }
        });
*/
        //Comprobado ✅: una función lamdba optimizó el evento del Toolbar (similar a una función de flecha en js)
        toolbar.setNavigationOnClickListener(view -> activity.getOnBackPressedDispatcher().onBackPressed());
    }
}

/*
* Diferencias clave:
* funciones lambda en java -> se usa habitualmente en programación funcional
* funciones de flecha en js -> se usa habitualmente en programación asincrónica
*
* Similitudes clave:
* - lambda usa el this de la clase envolvente
* - Arrow hereda el this del contexto en el que se definieron
* */
