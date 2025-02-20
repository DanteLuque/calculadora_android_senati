package com.senati.calculadora.utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.text.DecimalFormat;

public class Helper {
    public static String decimalFormateo(float numero) {
        DecimalFormat formateo = new DecimalFormat("#.##");
        return formateo.format(numero);
    }

    public static void cargarGIF(Context context, int image, ImageView imageView) {
        Glide.with(context)
                .load(image)
                .into(imageView);
    }
}
