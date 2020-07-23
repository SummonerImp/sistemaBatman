package com.example.appbatma;

public class classEquip {
    public String nomeEquip;
    public String descricao;
    public String finalidade;

    public String getNomeEquip(){
        return nomeEquip;
    }

    public void setNomeEquip(String equipamento){
        nomeEquip = equipamento;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String desc){
        descricao = desc;
    }

    public String getFinalidade(){
        return finalidade;
    }

    public void setFinalidade(String fin){
        finalidade = fin;
    }
}
