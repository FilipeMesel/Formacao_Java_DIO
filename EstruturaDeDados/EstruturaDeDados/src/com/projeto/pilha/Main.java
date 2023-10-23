package com.projeto.pilha;

public class Main {
    public static void main(String [] args)
    {
        Pilha minPilha = new Pilha();
        for(int i = 1; i < 7; i++)
        {
            minPilha.push(new No(i));
        }

        System.out.println(minPilha);
        System.out.println("Pop: " + minPilha.pop());
        System.out.println(minPilha);
        System.out.println("Top: " + minPilha.top());
        System.out.println(minPilha);
    }
}
