package br.com.filipeMesel.tests;

import br.com.filipeMesel.banco.Banco;
import br.com.filipeMesel.cliente.Cliente;
import br.com.filipeMesel.conta.ContaCorrente;
import br.com.filipeMesel.conta.ContaPoupanca;

public class Testadora {

    public static void testeContaCorrente()
    {
        Cliente filipe = new Cliente("Filipe","M", 27);
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setAgencia("BB");
        contaCorrente.setNumero("4321");
        filipe.addConta(contaCorrente);
        System.out.println("Depositando");
        filipe.depositar(contaCorrente, 200);
        System.out.println("Sacando");
        filipe.sacar(contaCorrente, 10);
        System.out.println("imprimindo o extrato");
        filipe.imprimirExtrato(contaCorrente);

    }

    public static void testeContaPoupanca()
    {
        Cliente filipe = new Cliente("Filipe","M", 27);
        ContaPoupanca contaPContaPoupanca = new ContaPoupanca();
        contaPContaPoupanca.setAgencia("BB");
        contaPContaPoupanca.setNumero("4321");
        filipe.addConta(contaPContaPoupanca);
        System.out.println("Depositando");
        filipe.depositar(contaPContaPoupanca, 200);
        System.out.println("Sacando");
        filipe.sacar(contaPContaPoupanca, 10);
        System.out.println("imprimindo o extrato");
        filipe.imprimirExtrato(contaPContaPoupanca);
    }

    public static void testeBanco()
    {
        Banco bb = new Banco();
        bb.setNome("Banco do Brasil");
        bb.setAddress("Rua A, Bairro b");
        Cliente filipe = new Cliente("Filipe","M", 27);
        bb.addCliente(filipe);

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setAgencia("BB");
        contaCorrente.setNumero("4321");
        ContaCorrente contaCorrente2 = new ContaCorrente();
        contaCorrente2.setAgencia("BB");
        contaCorrente2.setNumero("1234");
        filipe.addConta(contaCorrente);
        filipe.addConta(contaCorrente2);
        
        bb.addCliente(filipe);
        bb.realizarTranzacao(filipe, contaCorrente, "depositar", 1000);
        bb.realizarTranzacao(filipe, contaCorrente, contaCorrente2, "transferencia", 10);
        bb.imprimirExtrato(filipe, contaCorrente2);
        bb.imprimirExtrato(filipe, contaCorrente);

    }

    public static void main(String [] args)
    {
        System.out.println("Testadora");
        testeContaPoupanca();
        testeContaCorrente();
        testeBanco();
    }
}
