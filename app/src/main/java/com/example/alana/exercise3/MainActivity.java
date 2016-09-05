package com.example.alana.exercise3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // String tv;
        Button btn = (Button) findViewById(R.id.button);
        TextView txtView = (TextView) findViewById(R.id.textView);
        EditText editTxt = (EditText) findViewById(R.id.editText);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtView = (TextView) findViewById(R.id.textView);
                EditText editTxt = (EditText) findViewById(R.id.editText);
                editTxt.setText(txtView.getText().toString());
            }
        });
        final CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        final CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        final RadioButton radioButton1 = (RadioButton) findViewById(R.id.radioButton1);
        final RadioButton radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        radioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = (TextView) findViewById(R.id.textView);
                    if(checkBox2.isChecked()||checkBox1.isChecked()) {
                        checkBox2.setChecked(false);
                        checkBox1.setChecked(false);
                    }
                    textView.setText(radioButton1.getText().toString());
            }
        });
        radioButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = (TextView) findViewById(R.id.textView);
                if(checkBox2.isChecked()||checkBox1.isChecked()) {
                    checkBox2.setChecked(false);
                    checkBox1.setChecked(false);
                }
                textView.setText(radioButton2.getText().toString());
            }
        });
        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = (TextView) findViewById(R.id.textView);
                if(checkBox1.isChecked()) {
                    if(checkBox2.isChecked()||radioButton1.isChecked()||radioButton2.isChecked()) {
                        radioButton1.setChecked(false);
                        radioButton2.setChecked(false);
                        checkBox2.setChecked(false);
                    }
                    textView.setText(checkBox1.getText().toString());
                }
                else
                    textView.setText(null);
            }
        });
        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = (TextView) findViewById(R.id.textView);
                if(checkBox2.isChecked()) {
                    if(checkBox1.isChecked()||radioButton1.isChecked()||radioButton2.isChecked()) {
                        radioButton1.setChecked(false);
                        radioButton2.setChecked(false);
                        checkBox1.setChecked(false);
                    }
                    textView.setText(checkBox2.getText().toString());
                }
                else
                    textView.setText(null);
            }
        });
    }
}
