package br.com.filipeMesel.cliente;
import java.util.ArrayList;
import java.util.List;

import br.com.filipeMesel.conta.Conta;



public class Cliente {
    String nome;
    int idade;
    String sexo;
    List<Conta> contas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void addConta(Conta conta)
    {
        this.contas.add(conta);
    }

    public Conta getCotaByID(int id)
    {
        return this.contas.get(id);
    }

    public List<Conta> getContasByType(String type)
    {
        List<Conta>contasRetorno =  new ArrayList<>();
        if(type.equals("poupança"))
        {
            for(Conta conta : this.contas)
            {
                if(conta.getTipo().equals("Poupança"))
                {
                    contasRetorno.add(conta);
                }
            }
        }else {
            for(Conta conta : this.contas)
            {
                if(conta.getTipo().equals("Poupança"))
                {
                    contasRetorno.add(conta);
                }
            }

        }
        return contasRetorno;
    }

    public Conta getContaByNumeroEAgencia(String numeo, String agencia)
    {
        Conta retorno = null;
        for(Conta c: contas)
        {
            if(c.getNumero().equals(numeo) && c.getAgencia().equals(agencia))
            {
                retorno =  c;
                break;
            }
        }

        return retorno;
    }

    public boolean sacar(Conta c, double valor)
    {
        boolean retorno = false;
        if(getContaByNumeroEAgencia(c.getNumero(), c.getAgencia())!=null)
        {
            retorno = c.sacar(valor);
        }
        return retorno;
    }

    public boolean depositar(Conta c, double valor)
    {
        boolean retorno = false;
        if(getContaByNumeroEAgencia(c.getNumero(), c.getAgencia())!=null)
        {
            retorno = c.depositar(valor);
        }
        return retorno;
    }
    
    public List<String> getExtrato(Conta c)
    {
        List<String> hist =  new ArrayList<>();
        if(getContaByNumeroEAgencia(c.getNumero(), c.getAgencia())!=null)
        {
            hist = c.getHistorico();
        }else {
            System.out.println("[Cliente] - Não achei a conta de número " + c.getNumero() + " e agencia " + c.getAgencia());
        }
        return hist;
    }

    public void imprimirExtrato(Conta c)
    {
        List<String> hist = getExtrato(c);
        for(String msg: hist)
        {
            System.out.println(msg);
        }
        System.out.println("Valor total na conta " + c.getValor());
    }

    public Cliente(String nome, String sexo, int idade)
    {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }
    public Cliente()
    {
        super();
    }

}
