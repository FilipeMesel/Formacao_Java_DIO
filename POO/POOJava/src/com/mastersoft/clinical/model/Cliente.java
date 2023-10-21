package com.mastersoft.clinical.model;

public class Cliente {
    String nome;
    int idade;
    private String endereco;

    public void setEndereco(String novoEndereco)
    {
        this.endereco = novoEndereco;
    }
    public String getEndereco()
    {
        return this.endereco;
    }

    public String getNome()
    {
        return this.nome;
    }
    public int getIdade()
    {
        return this.idade;
    }

    public Cliente(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }
    public Cliente()
    {
        super();
    }
}
