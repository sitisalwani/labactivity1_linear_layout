package com.android.labactivity2linearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

import java.text.BreakIterator;


public class MainActivity extends AppCompatActivity {

    //Declare variable. The global variable

    EditText firstName, lastName, birth, country;
    Button submit;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Call back variable

        firstName = (EditText)findViewById(R.id.txtFN);
        lastName = (EditText)findViewById(R.id.txtLN);
        birth = (EditText)findViewById(R.id.txtBirth);
        country = (EditText)findViewById(R.id.txtCountry);
        submit = (Button)findViewById(R.id.buttonSubmit);
        output = (TextView)findViewById(R.id.displayOutput);

        //Submit Function
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fName=firstName.getText().toString();
                String lName=lastName.getText().toString();
                String bth=birth.getText().toString();
                String cty=country.getText().toString();
                output.setText("First Name:\t" + fName + "\nLast Name:\t" + lName + "\nBirth:\t" + bth + "\nCountry:\t" + cty);
            }
        });


    }
}

