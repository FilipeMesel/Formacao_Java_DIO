package com.mastersoft.clinical.model;

public class CadastroCliente {
    public void cadastrarCliente(String nome, int idade, String endereco)
    {
        Cliente cliente = new Cliente(nome, idade);
        cliente.setEndereco(endereco);
    }
}
