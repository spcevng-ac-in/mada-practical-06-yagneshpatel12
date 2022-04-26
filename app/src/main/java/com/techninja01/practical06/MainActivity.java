package com.techninja01.practical06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2;
    TextView result;
    Button add,mul,sub,div;
    private Calculator mCalculator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.number1);
        num2 = findViewById(R.id.number2);
        result = findViewById(R.id.result);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        div = findViewById(R.id.div);
        mul = findViewById(R.id.mul);
        mCalculator = new Calculator();
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = num1.getText().toString();
                double i = Double.parseDouble(n1);
                String n2 = num2.getText().toString();
                double j = Double.parseDouble(n2);
                double output = i+j;
                String o = Double.toString(output);
                result.setText(o);
                SharedPreferences sharedPreferences = getSharedPreferences("output",MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("sum",o);
                editor.commit();
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = num1.getText().toString();
                double i = Double.parseDouble(n1);
                String n2 = num2.getText().toString();
                double j =Double.parseDouble(n2);
                double output = i-j;
                String o = Double.toString(output);
                result.setText(o);
                SharedPreferences sharedPreferences = getSharedPreferences("output",MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("sum",o);
                editor.commit();
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = num1.getText().toString();
                double i = Double.parseDouble(n1);
                String n2 = num2.getText().toString();
                double j = Double.parseDouble(n2);
                double output = i*j;
                String o = Double.toString(output);
                result.setText(o);
                SharedPreferences sharedPreferences = getSharedPreferences("output",MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("sum",o);
                editor.commit();
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = num1.getText().toString();
                double i = Double.parseDouble(n1);
                String n2 = num2.getText().toString();
                double j = Double.parseDouble(n2);
                double output = 0;
                try{
                    output = i/j;
                }
                catch (ArithmeticException e){
                    Log.e("Divide by zero","error");
                    e.printStackTrace();
                }
                String o = Double.toString(output);
                result.setText(o);
                SharedPreferences sharedPreferences = getSharedPreferences("output",MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("sum",o);
                editor.commit();
            }
        });
        SharedPreferences sharedPreferences = getSharedPreferences("output",MODE_PRIVATE);
        String out = sharedPreferences.getString("sum","Result");
        result.setText("Result: "+out);
    }
}