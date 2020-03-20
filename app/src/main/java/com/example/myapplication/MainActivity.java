package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myapplication.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void addClick(View v){
        EditText number1 = (EditText) findViewById(R.id.Number1);
        EditText number2 = (EditText) findViewById(R.id.Number2);
        TextView result = (TextView) findViewById(R.id.result);
        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());
        result.setText(Integer.toString(n1+n2));
    }

    public void subClick(View v){
        EditText number1 = (EditText) findViewById(R.id.Number1);
        EditText number2 = (EditText) findViewById(R.id.Number2);
        TextView result = (TextView) findViewById(R.id.result);
        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());
        result.setText(Integer.toString(n1-n2));
    }

    public void MultipleClick(View v){
        EditText number1 = (EditText) findViewById(R.id.Number1);
        EditText number2 = (EditText) findViewById(R.id.Number2);
        TextView result = (TextView) findViewById(R.id.result);
        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());
        result.setText(Integer.toString(n1*n2));
    }

    public void divideClick(View v){
        EditText number1 = (EditText) findViewById(R.id.Number1);
        EditText number2 = (EditText) findViewById(R.id.Number2);
        TextView result = (TextView) findViewById(R.id.result);
        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());
        result.setText(Integer.toString(n1/n2));
    }
}
