package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText number1,number2;
    String n1,n2;
    String toast = "You just clicked the OK button";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.no1);
        number2 = findViewById(R.id.no2);
        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                n1 = number1.getText().toString();
                n2 = number2.getText().toString();
                intent.putExtra("number1", n1);
                intent.putExtra("number2", n2);
                Toast toast = Toast.makeText(getApplicationContext(), toast, Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP,Gravity.CENTER,200);
                toast.show();

                startActivity(intent);
                finish();
            }
        });
    }
}