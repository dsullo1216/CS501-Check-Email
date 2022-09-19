package com.example.emailcheck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView resultLabel;
    private EditText emailInput;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultLabel = (TextView) findViewById(R.id.resultLabel);
        emailInput = (EditText) findViewById(R.id.emailInput);
        submitButton = (Button) findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = emailInput.getText().toString();
                if (email.contains("@")) {
                    resultLabel.setText("VALID");
                }
                else {
                    resultLabel.setText("INVALID");
                }
            }
        });
    }
}