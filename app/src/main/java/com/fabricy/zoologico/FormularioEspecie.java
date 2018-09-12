package com.fabricy.zoologico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class FormularioEspecie extends AppCompatActivity {
    private EditText etEspecie;
    private Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_especie);

        etEspecie = (EditText)findViewById(R.id.etEspecieDoAnimal);
        btnSalvar = (Button)findViewById(R.id.btnSalvar)
    }
}
