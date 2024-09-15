package com.isys221.unitconverter;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

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
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

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
                convertKmtoMiles();
            }
        });


    }
}