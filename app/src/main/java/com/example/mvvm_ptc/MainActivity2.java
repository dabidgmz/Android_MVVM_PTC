package com.example.mvvm_ptc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModel;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        viewModel = new ViewModelProvider(this).get(MainViewModel.class);
        EditText editTextNumber1 = findViewById(R.id.editTextNumer1);
        EditText editTextNumber2 = findViewById(R.id.editTextNumer2);
        Button button = findViewById(R.id.buttonSum);
        TextView textView = findViewById(R.id.textViewResult);

        button.setOnClickListener(v -> {
            int num1 = Integer.parseInt(editTextNumber1.getText().toString());
            int num2 = Integer.parseInt(editTextNumber2.getText().toString());
            int result = viewModel.suma(num1, num2);
            textView.setText("Resultado: " + result);
        });
    }
}
