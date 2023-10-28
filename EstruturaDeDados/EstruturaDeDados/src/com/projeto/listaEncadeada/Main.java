package com.projeto.listaEncadeada;

public class Main {
    public static void main(String [] args)
    {
        ListaEncadeada<String> minhListaEncadeada = new ListaEncadeada<>();

        for(int i = 0; i < 4; i++)
        {
            String str = "teste" + String.valueOf(i+1);
            minhListaEncadeada.add(str);
        }

        for(int i = 0; i < 4; i++)
        {
            System.out.println(minhListaEncadeada.get(i));
        }

        System.out.println(minhListaEncadeada);
        System.out.println(minhListaEncadeada.remove(3));
        System.out.println(minhListaEncadeada);
    }
}
