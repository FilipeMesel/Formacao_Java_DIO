package com.mastersoft.automobilismo;

public class Autodromo {

   public static void main(String  [] args)
   {
     Carro jeep = new Carro();
     jeep.setChassi("12345");
     jeep.ligar();

     Moto c50 = new Moto();
     c50.setChassi("54321");

     c50.ligar();

     System.out.println(c50.getChassi());
     System.out.println(jeep.getChassi());

     Veiculo coringa = jeep;
     coringa.ligar();
     coringa = c50;
     coringa.ligar();
   }
}
