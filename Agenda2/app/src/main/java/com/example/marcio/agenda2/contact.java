package com.example.marcio.agenda2;

import java.io.Serializable;

public class contact implements Serializable {
    private String nome;
    private String telefone;

    public contact(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

}
