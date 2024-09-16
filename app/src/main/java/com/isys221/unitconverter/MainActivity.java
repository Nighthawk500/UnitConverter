package com.isys221.unitconverter;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //  Joseph Marvin
    //  ISYS 221 - VL1
    //  Individual Programming Assignment #2 - Unit Converter App
    //  Due: 9/15/2024

    //Declaring variables for UI components
    private EditText enterEurosEditText, dollarResultEditText, enterKmEditText, milesResultEditText;
    private Button convEuroButton, convKmButton;
    private Conversion conversionModel;

    //Initializing the UI
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Link the variables to UI elements
        enterEurosEditText = findViewById(R.id.enter_euros_edit_text);
        enterKmEditText = findViewById(R.id.enter_km_edit_text);
        dollarResultEditText = findViewById(R.id.dollar_result_edit_text);
        milesResultEditText = findViewById(R.id.miles_result_edit_text);
        convEuroButton = findViewById(R.id.convEuroButton);
        convKmButton = findViewById(R.id.convKmButton);

        //Initialize model
        conversionModel = new Conversion();

        //Create listeners for the two buttons
        convEuroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertEurosToDollars();
            }
        });
        convKmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertKmToMiles();
            }
        });

    }

    //Method for converting Euros to Dollars
    private void convertEurosToDollars() {
        String eurosStr = enterEurosEditText.getText().toString();
        if (!eurosStr.isEmpty()) {
            double euros = Double.parseDouble(eurosStr);
            double dollars = conversionModel.convertEurosToDollars(euros);
            dollarResultEditText.setText(String.valueOf(dollars));
        } else {
            Toast.makeText(this, "Enter Euros", Toast.LENGTH_SHORT).show();
        }
    }

    private void convertKmToMiles() {
        String kmStr = enterKmEditText.getText().toString();
        if (!kmStr.isEmpty()) {
            double kilometers = Double.parseDouble(kmStr);
            double miles = conversionModel.convertKmToMiles(kilometers);
            milesResultEditText.setText(String.valueOf(miles));
        } else {
            Toast.makeText(this, "Enter Kilometers", Toast.LENGTH_SHORT).show();
        }
    }
}