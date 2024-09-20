package com.stech.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText weight1,inch1,feet1;
    Button button;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weight1=findViewById(R.id.edweight);
        feet1=findViewById(R.id.edheight1);
        inch1=findViewById(R.id.edheight2);
        button=findViewById(R.id.button);
        display=findViewById(R.id.display);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float Weight,inch,feet,BMI;


                Weight=Float.parseFloat(weight1.getText().toString());
                feet=Float.parseFloat(feet1.getText().toString());
                inch=Float.parseFloat(inch1.getText().toString());

                float meter= (float) (feet*0.3048+inch*0.0254);
                BMI=Weight/(meter*meter);
                display.setText("আপনার BMI হলো: "+BMI);
            }
        });
    }
}