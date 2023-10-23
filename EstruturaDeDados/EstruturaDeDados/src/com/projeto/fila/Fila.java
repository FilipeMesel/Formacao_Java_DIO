package com.projeto.fila;

public class Fila {
    private No refNoEntrada;

    public Fila() {
        this.refNoEntrada = null;
    }
    

    public void enqueue(No novoNo)
    {
        novoNo.setrefNo(this.refNoEntrada);
        this.refNoEntrada = novoNo;
    }

    public No dequeue()
    {
        if(!isEmpty())
        {
            No primeirNo = refNoEntrada;
            No noAuaxiliar = refNoEntrada;
            while(true)
            {
                if(primeirNo.getRefNo() != null)
                {
                    noAuaxiliar = primeirNo;
                    primeirNo = primeirNo.getRefNo();
                }else {
                    noAuaxiliar.setrefNo(null);
                    break;
                }
            }
            return primeirNo;

        }
        return null;
    }

    public No first()
    {
        if(!isEmpty())
        {
            No primeirNo = refNoEntrada;
            while(true)
            {
                if(primeirNo.getRefNo() != null)
                {
                    primeirNo = primeirNo.getRefNo();
                }else {
                    break;
                }
            }
            return primeirNo;

        }
        return null;
    }

    public boolean isEmpty()
    {
        return this.refNoEntrada == null? true: false;
    }
    
    @Override
    public String toString()
    {
        String stringRetorno = "--------------\n";
        stringRetorno += "-------Fila------\n";
        stringRetorno += "--------------\n";

        No noAuxiliar = refNoEntrada;

        if(refNoEntrada != null)
        {

            while(true)
            {
                stringRetorno += "[No{object=" + noAuxiliar.getObject() +"}]--->";
                if(noAuxiliar.getRefNo() != null)
                {
                    noAuxiliar = noAuxiliar.getRefNo();
                }else {
                    stringRetorno += "null\n";
                    break;
                }
            }

        }else {
            stringRetorno = "null\n";
        }

        stringRetorno += "===================\n";
        return stringRetorno;
    }
}
