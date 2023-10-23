package com.projeto.refatorandoClasseNo;

public class NoGenerico<T> {

    //Criando um tipo genérico
    private T conteudo;
    private NoGenerico<T> proximoNo;

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }


    public NoGenerico<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(NoGenerico<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    public NoGenerico(T conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    @Override
    public String toString()
    {
        return "NoGenerico{" +
                "conteudo'" + conteudo + '\'' +
                '}';
    }
}
