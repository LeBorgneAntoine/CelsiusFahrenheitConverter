package com.example.cf_converter.control;

import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import com.example.cf_converter.R;
import com.example.cf_converter.converter.DataConverter;
import com.google.android.material.textfield.TextInputEditText;

public class ValidateListener implements View.OnClickListener {


    private TextInputEditText input;
    private RadioButton btn_CTF;
    private TextView result_field;
    private AppCompatActivity view;


    public ValidateListener(TextInputEditText input, RadioButton btn_CTF, TextView result_field, AppCompatActivity view) {
        this.input = input;
        this.btn_CTF = btn_CTF;
        this.result_field = result_field;
        this.view = view;
    }

    @Override
    public void onClick(View v) {

        input.clearFocus();

        try {


            if (btn_CTF.isChecked()) {
                result_field.setText("" + DataConverter.celsiusToFahrenheit(Double.parseDouble(input.getText().toString())) + " F°");
            } else {
                result_field.setText("" + DataConverter.fahrenheitToCelsius(Double.parseDouble(input.getText().toString())) + " C°");
            }


        } catch (NumberFormatException e) {
            input.clearFocus();
            input.setBackground(ResourcesCompat.getDrawable(view.getResources(), R.drawable.error_border, null));

        }


    }


}

