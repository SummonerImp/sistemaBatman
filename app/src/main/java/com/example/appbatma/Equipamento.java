package com.example.appbatma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Equipamento extends AppCompatActivity {
    EditText txtNome, txtDesc, txtFinal;
    Button btnCad, btnConsul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipamento);
        btnCad = findViewById(R.id.btnCadEquip);
        btnConsul = findViewById(R.id.btnConsulEquip);
        txtNome = findViewById(R.id.txtNomeEquip);
        txtDesc = findViewById(R.id.txtDesc);
        txtFinal = findViewById(R.id.txtFinal);
    }

    public void cadEquip(View v){
        classEquip equipamentos = new classEquip();
        equipamentos.setNomeEquip(txtNome.getText().toString());
        equipamentos.setDescricao(txtDesc.getText().toString());
        equipamentos.setFinalidade(txtFinal.getText().toString());
    }

    public void consulEquip(View v){

    }
}