package com.example.appbatma;

import java.util.ArrayList;

public class classHero {
    public String Nome;
    public String Codinome;
    public String Especie;
    public String Habilidades;
    public String Vulnerabilidades;
    public String NivelAcesso;
    public ArrayList<classHero> equipamentos;

    public ArrayList<classHero> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(ArrayList<classHero> equipamentos) {
        this.equipamentos = equipamentos;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCodinome() {
        return Codinome;
    }

    public void setCodinome(String codinome) {
        Codinome = codinome;
    }

    public String getEspecie() {
        return Especie;
    }

    public void setEspecie(String especie) {
        Especie = especie;
    }

    public String getHabilidades() {
        return Habilidades;
    }

    public void setHabilidades(String habilidades) {
        Habilidades = habilidades;
    }

    public String getVulnerabilidades() {
        return Vulnerabilidades;
    }

    public void setVulnerabilidades(String vulnerabilidades) {
        Vulnerabilidades = vulnerabilidades;
    }

    public String getNivelAcesso() {
        return NivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        NivelAcesso = nivelAcesso;
    }
}
