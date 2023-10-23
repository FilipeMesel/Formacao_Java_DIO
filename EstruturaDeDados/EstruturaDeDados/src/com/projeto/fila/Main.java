package com.projeto.fila;

public class Main {

    public static void main(String [] args)
    {
        Fila minhFila = new Fila();

        minhFila.enqueue(new No("primeiro"));
        minhFila.enqueue(new No("segundo"));
        minhFila.enqueue(new No("terceiro"));
        minhFila.enqueue(new No("quarto"));

        System.out.println(minhFila);

        minhFila.dequeue();
        System.out.println(minhFila);
        System.out.println("######################");
        System.out.println( minhFila.first());
    }
}
