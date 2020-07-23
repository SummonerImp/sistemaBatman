package com.example.appbatma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class Heroi extends AppCompatActivity {
    Button btnCad, btnConsul;
    EditText txtNome, txtCodinome, txtEspecie, txtHabi, txtVulne, txtNivel;
    Spinner ddlEquip;
    classEquip equip =new classEquip();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroi);
        ArrayList<String> equipamentosArray = new ArrayList<>();
        ArrayAdapter<classEquip> equipArray = new ArrayAdapter<classEquip>(this,android.R.layout.simple_spinner_dropdown_item);
        btnCad = findViewById(R.id.btnCadHeroi);
        btnConsul = findViewById(R.id.btnConsulHeroi);
        txtCodinome = findViewById(R.id.txtCodi);
        txtNome = findViewById(R.id.txtNome);
        txtEspecie = findViewById(R.id.txtEsp);
        txtHabi = findViewById(R.id.txtHab);
        txtVulne = findViewById(R.id.txtVul);
        txtNivel = findViewById(R.id.txtAcesso);
        ddlEquip = findViewById(R.id.ddlEquip);
        for(int i = 0; i < equipamentosArray.size(); i++){
            equipamentosArray.add(equip.getNomeEquip());
        }
        ddlEquip.setAdapter(equipArray);
    }

    public void cadHero(View v){
        classHero hero = new classHero();
        hero.setNome(txtNome.getText().toString());
        hero.setCodinome(txtCodinome.getText().toString());
        hero.setEspecie(txtEspecie.getText().toString());
        hero.setHabilidades(txtHabi.getText().toString());
        hero.setVulnerabilidades(txtVulne.getText().toString());
        hero.setNivelAcesso(txtNivel.getText().toString());
    }

    public void conHero(View v){

    }
}