package com.aavil.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void convert(View view) {

        String message = "";

        EditText dollarField = (EditText) findViewById(R.id.dollarsField);

        if (dollarField.getText().toString().isEmpty()) {

            message = "Please enter an amount";
        } else {

            Double dollarAmount = Double.parseDouble(dollarField.getText().toString());

            Double poundAmount = dollarAmount * 0.65;

            // Log.i("dollarField", poundAmount.toString());

            Toast.makeText(getApplicationContext(), "$" + poundAmount.toString(), Toast.LENGTH_LONG).show();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
