package com.projeto.listaDuplamenteEncadeada;

public class ListaDuplamenteEncadeada<T> {
    NoDuplo<T> primeirNo;
    NoDuplo<T> ultimoNo;
    private int tamanhoLista;

    public ListaDuplamenteEncadeada() {
        this.primeirNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public int size()
    {
        return this.tamanhoLista;
    }

    public void add(T conteudo)
    {
        NoDuplo<T> novoNo = new NoDuplo<>(conteudo);
        novoNo.setProximoNo(null);
        novoNo.setNoPrevio(ultimoNo);
        
        if(primeirNo == null)
        {
            primeirNo = novoNo;
        }

        if(ultimoNo != null)
        {
            ultimoNo.setProximoNo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void add(T conteudo, int index)
    {
        NoDuplo<T> noAuxiliar= getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(conteudo);

        novoNo.setProximoNo(noAuxiliar);

        if(novoNo.getNoProximo() != null)
        {
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
            novoNo.getNoProximo().setNoPrevio(novoNo);
        }else {
            novoNo.setNoPrevio(ultimoNo);
            ultimoNo = novoNo;
        }

        if(index == 0)
        {
            primeirNo = novoNo;
        }else {
            novoNo.getNoPrevio().setProximoNo(novoNo);
        }
        tamanhoLista++;

    }

    public void remove(int index)
    {

        if(index == 0)
        {
            primeirNo = primeirNo.getNoProximo();
            if(primeirNo != null)
            {
                primeirNo.setNoPrevio(null);
            }

        }else {
            NoDuplo<T> noAuxiliar= getNo(index);
            noAuxiliar.getNoPrevio().setProximoNo(noAuxiliar.getNoProximo());
            if(noAuxiliar != ultimoNo)
            {
                noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());
            }else {
                ultimoNo = noAuxiliar;
            }
        }

        this.tamanhoLista--;


    }

    private NoDuplo<T> getNo(int index)
    {

        NoDuplo<T> noAuxiliar = primeirNo;
        for(int i = 0; (i < index) && (noAuxiliar != null); i++)
        {
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        return noAuxiliar;
    }

    public T get(int index)
    {
        return this.getNo(index).getConteudo();
    }

    @Override
    public String toString()
    {
        String strRertorno = "";
        NoDuplo<T> noAuxiliar = primeirNo;
        for(int i =0; i < size(); i++)
        {
            strRertorno += "[No{" + "conteudo='" + noAuxiliar.getConteudo() + '\'' + "}]--->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        strRertorno += "null";
        return strRertorno;
    }
}
