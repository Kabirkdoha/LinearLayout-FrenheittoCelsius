package com.example.linearlayout_celsiustofrenheit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText t1;
    TextView t2;
    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.data);
        t2 = findViewById(R.id.ans);
        b1 = findViewById(R.id.cel);
        b2 = findViewById(R.id.fah);
        b1.setOnClickListener(v -> {
            double f = Double.valueOf(t1.getText().toString());
            double c = (f - 32) * 5 / 9;
            t2.setText(String.valueOf(c));
        });
        b2.setOnClickListener(v -> {
            double c = Double.valueOf(t1.getText().toString());
            double f = (c * 9 / 5) + 32;
            t2.setText(String.valueOf(f));

        });
    }
}