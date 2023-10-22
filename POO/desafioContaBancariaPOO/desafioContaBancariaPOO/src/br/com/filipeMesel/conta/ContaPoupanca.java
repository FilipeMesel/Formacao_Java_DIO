package br.com.filipeMesel.conta;
import java.util.List;

public class ContaPoupanca extends Conta {
    public ContaPoupanca()
    {
        this.setTipo("Poupança");
    }
    @Override
    void addToHistorico(String texto, double valor) {
        List<String>Historico = getHistorico();
        // TODO Auto-generated method stub
        if(texto.equals("sacar"))
        {
            Historico.add(" - Saque da conta poupança do valor de R$" + valor +",00");

        }else if(texto.equals("depositar"))
        {
            Historico.add(" + Depósito da conta poupança do valor de R$" + valor +",00");

        }else if(texto.equals("transferencia"))
        {
            Historico.add(" # Transferencia da conta poupança do valor de R$" + valor +",00");

        }
    }
    
}
