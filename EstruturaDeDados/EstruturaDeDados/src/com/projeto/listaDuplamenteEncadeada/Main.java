package com.projeto.listaDuplamenteEncadeada;

public class Main {

    public static void main(String[] args) {

        ListaDuplamenteEncadeada<String> minhaLIListaDuplamenteEncadeada = new ListaDuplamenteEncadeada<>();

        for(int i =0; i < 7; i++)
        {
            String str = "c" + (i+1);
            minhaLIListaDuplamenteEncadeada.add(str);

        }
        System.out.println(minhaLIListaDuplamenteEncadeada);

        minhaLIListaDuplamenteEncadeada.remove(3);
        System.out.println(minhaLIListaDuplamenteEncadeada);
        minhaLIListaDuplamenteEncadeada.add("c99", 3);
        System.out.println(minhaLIListaDuplamenteEncadeada);
        System.out.println(minhaLIListaDuplamenteEncadeada.get(3));
    }
}