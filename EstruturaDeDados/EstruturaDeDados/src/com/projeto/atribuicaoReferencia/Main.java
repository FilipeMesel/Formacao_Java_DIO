package com.projeto.atribuicaoReferencia;

public class Main {
    public static void main(String [] args)
    {
        int intA = 1;
        int intB = 1;
        System.out.println("intA: " + intA + " intB: " + intB);
        intB = 2;
        System.out.println("intA: " + intA + " intB: " + intB);

        //Atribuição por referência de memória
        MeuObjeto meuObjetoA = new MeuObjeto(1);
        MeuObjeto meuObjetoB = meuObjetoA; //B vira uma cópia de A...tudo o que ocorre em A, também ocorre em B
        System.out.println("meuObjetoA: " + meuObjetoA + " meuObjetoB: " + meuObjetoB);

        meuObjetoA.setNum(2); //B também vira 2
        System.out.println("meuObjetoA: " + meuObjetoA + " meuObjetoB: " + meuObjetoB);
    }
}
