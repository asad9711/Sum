package com.example.asad.sum;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity implements View.OnClickListener
{
    Button b;
    EditText txt1,txt2,txt3;
    int x1,x2,x3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("asd", "oncreate was called");

        b=(Button)findViewById(R.id.sum);
        b.setOnClickListener(this);
            }
    public void onClick(View v)
    {
        if(v.getId()==R.id.sum) {
            txt1 = (EditText) findViewById(R.id.text1);
            txt2 = (EditText) findViewById(R.id.text2);
            x1 = Integer.parseInt(txt1.getText().toString());
            x2 = Integer.parseInt(txt2.getText().toString());
            x3 = x2 + x1;
            txt3 = (EditText) findViewById(R.id.text3);
            txt3.setText(Integer.toString(x3));

        }

    }

    }




