package com.projeto.conceitoDeNo;

/**
 * O Nó é uma estrutura de dados dinâmica. Assim como os ponteiros funcionam no C++;
 */
public class No {
    private String conteudo;
    private No proximoNo;

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    public No(String conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    @Override
    public String toString()
    {
        return "No{" +
                "conteudo'" + conteudo + '\'' +
                '}';
    }
}
