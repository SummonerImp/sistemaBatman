package com.example.appbatma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnHero, btnVilain, btnEquip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnEquip = findViewById(R.id.btnEquip);
        btnHero = findViewById(R.id.btnHero);
        btnVilain = findViewById(R.id.btnVilao);
    }

    public void viewEquip(View v){
        Intent it = new Intent(this,Equipamento.class);
        startActivity(it);
    }

    public void viewHero(View v){
        Intent it = new Intent(this,Heroi.class);
        startActivity(it);
    }

    public void viewVilain(View v){
        Intent it = new Intent(this,Vilao.class);
        startActivity(it);
    }
}