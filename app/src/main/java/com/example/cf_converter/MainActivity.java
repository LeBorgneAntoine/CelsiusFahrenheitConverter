package com.example.cf_converter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.cf_converter.control.ChangeListener;
import com.example.cf_converter.control.FocusListener;
import com.example.cf_converter.control.TouchListener;
import com.example.cf_converter.control.ValidateListener;
import com.example.cf_converter.converter.DataConverter;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //disable top bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();


        //Get view component
        Button calculateBtn = (Button) findViewById(R.id.calculate);
        TextInputEditText input = (TextInputEditText) findViewById(R.id.input);
        RadioButton btn_CtF = (RadioButton) findViewById(R.id.radio_CtF);
        TextView inputUnit = (TextView) findViewById(R.id.input_unit);
        TextView result = (TextView) findViewById(R.id.result);



        //Add listener
        calculateBtn.setOnClickListener     (new ValidateListener(input,btn_CtF,result,this));
        calculateBtn.setOnTouchListener     (new TouchListener(calculateBtn));
        btn_CtF.setOnCheckedChangeListener  (new ChangeListener(inputUnit,result,input));
        input.setOnFocusChangeListener      (new FocusListener(input,this));




    }
}