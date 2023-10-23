package com.projeto.refatorandoClasseNo;



public class Main {
    public static void main(String [] args)
    {
        NoGenerico<String> no1 = new NoGenerico<>("Conteudo No1");
        NoGenerico<String> no2 = new NoGenerico<>("Conteudo No2");

        no1.setProximoNo(no2);

        
        NoGenerico<String> no3 = new NoGenerico<>("Conteudo No3");
        no2.setProximoNo(no3);

        
        NoGenerico<String> no4 = new NoGenerico<>("Conteudo No4");
        no3.setProximoNo(no4);

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
    }
}
