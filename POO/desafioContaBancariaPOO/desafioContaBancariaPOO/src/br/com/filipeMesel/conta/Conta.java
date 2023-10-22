package br.com.filipeMesel.conta;
import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
    private String agencia;
    private String numero;
    private List<String>Historico =  new ArrayList<>();
    private double valor;
    private String tipo;

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public List<String> getHistorico() {
        return Historico;
    }
    public void setHistorico(List<String> historico) {
        Historico = historico;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean sacar(double valor) {

        if(valor <= this.valor){
            this.valor = this.valor - valor;
            addToHistorico("sacar", valor);
            return true;
        }else {
            return false;
        }
    }

    public boolean depositar(double valor)
    {
        this.valor = this.valor + valor;
        addToHistorico("depositar", valor);
        return true;
    }

    public boolean transferir(double valor, Conta contaDestino)
    {
        if(this.valor > valor)
        {
            sacar(valor);
            contaDestino.depositar(valor);
            addToHistorico("transferencia", valor);
            return true;
        }else {
            return false;
        }
    }

    abstract void addToHistorico(String texto, double valor);

}