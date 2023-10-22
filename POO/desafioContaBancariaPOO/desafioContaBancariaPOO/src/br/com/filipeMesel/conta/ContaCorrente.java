package br.com.filipeMesel.conta;
import java.util.List;

public class ContaCorrente extends Conta {

    public ContaCorrente()
    {
        this.setTipo("Corrente");
    }

    @Override
    void addToHistorico(String texto, double valor) {
        List<String>Historico = getHistorico();
        // TODO Auto-generated method stub
        if(texto.equals("sacar"))
        {
            Historico.add(" - Saque da conta corrente do valor de R$" + valor +",00");

        }else if(texto.equals("depositar"))
        {
            Historico.add(" + Depósito da conta corrente do valor de R$" + valor +",00");

        }else if(texto.equals("transferencia"))
        {
            Historico.add(" # Transferencia da conta corrente do valor de R$" + valor +",00");

        }
    }
    
}
