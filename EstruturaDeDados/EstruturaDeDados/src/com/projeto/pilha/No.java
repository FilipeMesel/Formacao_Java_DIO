package com.projeto.pilha;

/**
 * O Nó é uma estrutura de dados dinâmica. Assim como os ponteiros funcionam no C++;
 */
public class No {
    private int dado;
    private No proximoNo;

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    public No(int dado) {
        this.proximoNo = null;
        this.dado = dado;
    }

    public No()
    {
    }

    @Override
    public String toString()
    {
        return "No{" +
                "dado'" + dado + '\'' +
                '}';
    }
}
