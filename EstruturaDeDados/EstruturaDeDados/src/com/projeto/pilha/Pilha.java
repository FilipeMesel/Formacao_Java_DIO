package com.projeto.pilha;

public class Pilha {

    /*Nó de referência */
    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public No pop()
    {
        if(!isEmpty())
        {
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getProximoNo();
            return noPoped;
        }else {
            return null;
        }
    }

    public void push(No novoNo)
    {
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setProximoNo(refAuxiliar);
    }

    public No top()
    {
        return refNoEntradaPilha;
    }

    public boolean isEmpty()
    {
        return this.refNoEntradaPilha == null? true: false;
    }

    @Override
    public String toString()
    {
        String stringRetorno = "--------------\n";
        stringRetorno += "-------Pilha------\n";
        stringRetorno += "--------------\n";

        No noAuxiliar = refNoEntradaPilha;
        while(true)
        {
            if(noAuxiliar != null)
            {

                stringRetorno += "[No{dado = " + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getProximoNo();

            }else {
                break;
            }

        }
        stringRetorno += "===================\n";
        return stringRetorno;
    }
}
