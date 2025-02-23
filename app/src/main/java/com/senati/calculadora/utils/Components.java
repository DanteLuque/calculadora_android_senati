package com.senati.calculadora.utils;

import android.content.Context;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.bumptech.glide.Glide;

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
        toolbar.setNavigationOnClickListener(view -> activity.getOnBackPressedDispatcher().onBackPressed());
    }

    public static void buildGIF(Context context, int image, ImageView imageView) {
        Glide.with(context)
                .load(image)
                .into(imageView);
    }
}
