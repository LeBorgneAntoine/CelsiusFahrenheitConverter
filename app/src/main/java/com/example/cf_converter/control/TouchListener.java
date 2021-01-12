package com.example.cf_converter.control;

import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import androidx.core.content.res.ResourcesCompat;

import com.example.cf_converter.R;

public class TouchListener implements View.OnTouchListener{


    private Button validate_btn;

    public TouchListener(Button validate_btn) {
        this.validate_btn = validate_btn;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if(event.getAction() == MotionEvent.ACTION_DOWN){
            validate_btn.setBackground(ResourcesCompat.getDrawable(v.getResources(), R.drawable.primary_button_touch, null));
        }else if (event.getAction() == MotionEvent.ACTION_UP){
            validate_btn.setBackground(ResourcesCompat.getDrawable(v.getResources(), R.drawable.primary_button, null));
        }


        return false;
    }
}
