package com.projeto.listaDuplamenteEncadeada;

public class NoDuplo<T> {
    private T conteudo;
    private NoDuplo<T> noProximo;
    private NoDuplo<T> noPrevio;

    
    public NoDuplo<T> getNoPrevio() {
        return noPrevio;
    }

    public void setNoPrevio(NoDuplo<T> noPrevio) {
        this.noPrevio = noPrevio;
    }

    public NoDuplo(T conteudo, NoDuplo<T> noProximo) {
        this.conteudo = conteudo;
        this.noProximo = noProximo;
    }

    public NoDuplo(T conteudo) {
        this.conteudo = conteudo;
        this.noProximo = null;
    }

    public NoDuplo() {
        this.noProximo = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoDuplo<T> getNoProximo() {
        return noProximo;
    }

    public void setProximoNo(NoDuplo<T> proximoNo) {
        this.noProximo = proximoNo;
    }

    @Override
    public String toString()
    {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }

    // public String toStringEncadeado()
    // {
    //     String str = "No{" +
    //             "conteudo='" + conteudo + '\'' +
    //             '}';
        
    //     if(noProximo != null)
    //     {
    //         str += "->" + noProximo.toString();
    //     }else
    //     {
            
    //         str += "->null";
    //     }

    //     return str;
    // }
}