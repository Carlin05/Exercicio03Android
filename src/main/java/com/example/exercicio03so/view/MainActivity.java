package com.example.exercicio03so.view;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.exercicio03so.R;
import com.example.exercicio03so.controller.Operacao;

public class MainActivity extends AppCompatActivity {

    private EditText etValor1;
    private EditText etValor2;
    private TextView tvComparar;
    private TextView tvSomar;

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
        etValor1 = findViewById(R.id.etValor1);
        etValor1.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);
        etValor2 = findViewById(R.id.etValor2);
        etValor2.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);
        tvComparar = findViewById(R.id.tvComparar);
        tvComparar.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);
        tvSomar = findViewById(R.id.tvSomar);
        tvSomar.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);
        Button btnSomar = findViewById(R.id.btnSomar);
        Button btnComparar = findViewById(R.id.btnComparar);

        btnSomar.setOnClickListener(op -> somar());
        btnComparar.setOnClickListener(op -> comparar());
    }
    private void comparar(){
        Operacao op = new Operacao();
        int valor1 = Integer.parseInt(etValor1.getText().toString());
        int valor2 = Integer.parseInt(etValor2.getText().toString());
        String comp = op.comparar(valor1, valor2);
        tvComparar.setText(comp);
    }
    private void somar(){
        Operacao op = new Operacao();
        int valor1 = Integer.parseInt(etValor1.getText().toString());
        int valor2 = Integer.parseInt(etValor2.getText().toString());
        int soma = op.somaImpar(valor1, valor2);
        tvComparar.setText("Soma dos valores impares dos 2 numeros "+soma);
    }

}