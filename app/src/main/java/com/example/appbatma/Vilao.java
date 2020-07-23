package com.example.appbatma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Vilao extends AppCompatActivity {
    Button btnCad, btnConsul;
    EditText txtNome, txtCodinome, txtEspecie, txtHabi, txtVulne, txtNivel, txtEscon, txtRival, txtDate;
    Spinner ddlEquip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vilao);
        btnCad = findViewById(R.id.btnCadVilao);
        btnConsul = findViewById(R.id.btnConsulVilao);
        txtCodinome = findViewById(R.id.txtCodiVilao);
        txtNome = findViewById(R.id.txtNomeVilao);
        txtEspecie = findViewById(R.id.txtEspVilao);
        txtHabi = findViewById(R.id.txtHabVilao);
        txtVulne = findViewById(R.id.txtVulVilao);
        txtNivel = findViewById(R.id.txtAcessoVilao);
        ddlEquip = findViewById(R.id.ddlEquipVilao);
        txtEscon = findViewById(R.id.txtEscondVilao);
        txtRival = findViewById(R.id.txtRivalVilao);
        txtDate = findViewById(R.id.txtDateAtq);
    }

    public void cadVilao(View v) throws ParseException {
        classVilao viloes = new classVilao();
        viloes.setNome(txtNome.getText().toString());
        viloes.setCodinome(txtCodinome.getText().toString());
        viloes.setEspecie(txtEspecie.getText().toString());
        viloes.setHabilidades(txtHabi.getText().toString());
        viloes.setVulnerabilidades(txtVulne.getText().toString());
        viloes.setHeroisRivais(txtRival.getText().toString());
        viloes.setEsconderijos(txtEscon.getText().toString());
        viloes.setDataAtaques(new SimpleDateFormat("dd/MM/yyyy").parse(txtDate.getText().toString()));
    }

    public void consulVilao(View v){

    }
}