package com.training.ick.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button btnName,btnLastName;
    TextView firstTxt,secondTxt;
    EditText name,lastname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnName=(Button) findViewById(R.id.button2);
        btnLastName=(Button)findViewById(R.id.button3);
        firstTxt=(TextView) findViewById(R.id.txt1);
        secondTxt=(TextView) findViewById(R.id.txt2);
        name=(EditText)findViewById(R.id.name);
        lastname=(EditText)findViewById(R.id.lastname);

        

        btnName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstTxt.setText(name.getText().toString());
            }
        });

        btnLastName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondTxt.setText(lastname.getText().toString());
            }
        });


    }
}
