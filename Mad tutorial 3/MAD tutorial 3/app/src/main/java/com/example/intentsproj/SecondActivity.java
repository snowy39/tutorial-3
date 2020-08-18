package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    TextView result;
    EditText number1;
    EditText number2;
    String n1;
    String n2;
    Button add,subtract,multiply,divide;
    String errortoastMessage = "Please Enter Both Numbers";
    int answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getSupportActionBar().setTitle("Second Activity");
        number1 = findViewById(R.id.n1_2);
        number2 = findViewById(R.id.n2_2);
        add = (Button) findViewById(R.id.add);
        subtract = (Button) findViewById(R.id.subtract);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);
        n1 = getIntent().getExtras().getString("number1");
        n2 = getIntent().getExtras().getString("number2");
        result = findViewById(R.id.result);

        number1.setText(n1);
        number2.setText(n2);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            n1 = number1.getText().toString();
            n2 = number2.getText().toString();
            ans = Double.parseDouble(n1) + Double.parseDouble(n2);
            String answer = n1 + " + " + n2 + " = " + Double.toString(ans);
            result.setText(answer);

            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                n1 = number1.getText().toString();
                n2 = number2.getText().toString();

                ans =  Double.parseDouble(n1) -  Double.parseDouble(n2);
                String answer = n1 + " - " + n2 + " = " + Double.toString(ans);
                result.setText(answer);

            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                n1 = number1.getText().toString();
                n2 = number2.getText().toString();

                ans =  Double.parseDouble(n1) *  Double.parseDouble(n2);
                String answer = n1 + " X " + n2 + " = " + Double.toString(ans);
                result.setText(answer);


            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                n1 = number1.getText().toString();
                n2 = number2.getText().toString();

                ans =  Double.parseDouble(n1) /  Double.parseDouble(n2);
                String answer = n1 + " / " + n2 + " = " + Double.toString(ans);
                result.setText(answer);

            }
        });




    }

}