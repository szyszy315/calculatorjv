package com.example.calculatorjv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    EditText number1, number2;
    Button add, sub, div, mul;
    float result_nums;
    float num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result =(TextView)findViewById(R.id.result);
        number1 = (EditText)findViewById(R.id.number1);
        number2 = (EditText)findViewById(R.id.number2);
        add = (Button)findViewById(R.id.add);
        mul = (Button)findViewById(R.id.mul);
        sub = (Button)findViewById(R.id.sub);
        div = (Button)findViewById(R.id.div);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 =Float.parseFloat(number1.getText().toString());
                num2 =Float.parseFloat(number2.getText().toString());
                result_nums = num1 + num2;
                result.setText(String.valueOf(result_nums));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 =Float.parseFloat(number1.getText().toString());
                num2 =Float.parseFloat(number2.getText().toString());
                result_nums = num1 - num2;
                result.setText(String.valueOf(result_nums));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 =Float.parseFloat(number1.getText().toString());
                num2 =Float.parseFloat(number2.getText().toString());
                result_nums = num1 / num2;
                result.setText(String.valueOf(result_nums));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 =Float.parseFloat(number1.getText().toString());
                num2 =Float.parseFloat(number2.getText().toString());
                result_nums = num1 * num2;
                result.setText(String.valueOf(result_nums));
            }
        });

    }
}
