package com.projeto.filaRefatorada;

public class No<T> {
    private T object;
    private No<T> refNo;


    public No(T object) {
        this.refNo = null;
        this.object = object;
    }

    public No() {
    }

    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
    
    public No getRefNo() {
        return refNo;
    }

    public void setrefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString()
    {
        return "No{" +
                "object='" + object + '\'' +
                '}';
    }
    
}
