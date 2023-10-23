package com.projeto.filaRefatorada;

public class Main {

    public static void main(String [] args)
    {
        Fila<String> minhFila = new Fila<>();

        minhFila.enqueue("primeiro");
        minhFila.enqueue("segundo");
        minhFila.enqueue("terceiro");
        minhFila.enqueue("quarto");

        System.out.println(minhFila);

        minhFila.dequeue();
        System.out.println(minhFila);
        System.out.println("######################");
        System.out.println( minhFila.first());
    }
}
