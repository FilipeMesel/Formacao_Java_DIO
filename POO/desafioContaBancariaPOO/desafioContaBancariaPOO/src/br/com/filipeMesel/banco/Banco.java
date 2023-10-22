package br.com.filipeMesel.banco;

import java.util.ArrayList;
import java.util.List;

import br.com.filipeMesel.cliente.Cliente;
import br.com.filipeMesel.conta.Conta;

public class Banco {
    String nome;
    String address;
    List<Cliente> clientes =  new ArrayList<>();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public List<Cliente> getClientes() {
        return this.clientes;
    }
    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void addCliente(Cliente clienteNovo)
    {
        this.clientes.add(clienteNovo);
    }

    public Cliente getClienteByID(int id)
    {
        return this.clientes.get(id);
    }

    public Cliente getClietneByName(String nomeCliente)
    {
        Cliente retorno = new Cliente();
        boolean achouCliente = false;
        for(Cliente c: clientes)
        {
            if(c.getNome().equals(nomeCliente))
            {
                retorno = c;
                achouCliente = true;
                break;
            }
        }
        if(achouCliente == true)
        {
            return retorno;
        }else {
            return null;
        }
    }

    public void realizarTranzacao(Cliente cl, Conta ca, String tipo, double valor)
    {
        if(tipo.equals("sacar"))
        {
            if(cl.getContaByNumeroEAgencia(ca.getNumero(), ca.getAgencia()) != null)
            {
                ca.sacar(valor);
            }
        }else if(tipo.equals("depositar"))
        {
            if(cl.getContaByNumeroEAgencia(ca.getNumero(), ca.getAgencia()) != null)
            {
                ca.depositar(valor);
            }

        }
    }

    public void realizarTranzacao(Cliente cl, Conta contaOrigem, Conta contaDestino, String tipo, double valor)
    {
        if(tipo.equals("transferencia"))
        {
            if(cl.getContaByNumeroEAgencia(contaOrigem.getNumero(), contaOrigem.getAgencia()) != null)
            {
                contaOrigem.transferir(valor, contaDestino);
            }
        }
    }

    public void imprimirExtrato(Cliente cl, Conta ca)
    {
        if(cl.getContaByNumeroEAgencia(ca.getNumero(), ca.getAgencia()) != null)
        {
            cl.imprimirExtrato(ca);
        }
    }

}
