package com.projeto.atribuicaoReferencia;

public class MeuObjeto {
    Integer num;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String toString()
    {
        return this.num.toString();
    }

    public MeuObjeto(Integer num)
    {
        this.num = num;
    }

}
