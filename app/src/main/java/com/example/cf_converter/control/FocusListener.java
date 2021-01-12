package com.example.cf_converter.control;

import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import com.example.cf_converter.R;
import com.google.android.material.textfield.TextInputEditText;

public class FocusListener implements View.OnFocusChangeListener{

    private TextInputEditText input;
    private AppCompatActivity view;

    public FocusListener(TextInputEditText input, AppCompatActivity view) {
        this.input = input;
        this.view = view;
    }

    @Override
    public void onFocusChange(View v, boolean hasFocus) {

        input.setBackground(ResourcesCompat.getDrawable(view.getResources(), R.drawable.rounded_button, null));

    }
}
