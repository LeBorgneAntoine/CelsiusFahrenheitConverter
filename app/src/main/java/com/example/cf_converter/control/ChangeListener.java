package com.example.cf_converter.control;

import android.widget.CompoundButton;
import android.widget.TextView;

import com.example.cf_converter.converter.DataConverter;
import com.google.android.material.textfield.TextInputEditText;

public class ChangeListener implements CompoundButton.OnCheckedChangeListener{


    private TextView inputUnit,result;
    private TextInputEditText input;

    public ChangeListener(TextView inputUnit, TextView result, TextInputEditText input) {
        this.inputUnit = inputUnit;
        this.result = result;
        this.input = input;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        if(isChecked){
            inputUnit.setText("C°");

            if(!input.getText().toString().equals("")){
                result.setText(""+ DataConverter.celsiusToFahrenheit(Double.parseDouble(input.getText().toString()))+ " F°");
            }

        }else{
            inputUnit.setText("F°");

            if(!input.getText().toString().equals("")){
                result.setText(""+DataConverter.fahrenheitToCelsius(Double.parseDouble(input.getText().toString()))+ " C°");
            }
        }


    }
}
