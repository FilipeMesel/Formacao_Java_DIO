package com.mastersoft.automobilismo;

public class Carro extends Veiculo {

    @Override
    public void ligar()
    {
        confereCombustivel();
        confereCambio();
        System.out.println("CARRO LIGADO");
    }

    private void confereCombustivel()
    {
        System.out.println("CONFERINDO COMBUSTÍVEL...100%");
    }

    private void confereCambio()
    {
        System.out.println("CONFERINDO CAMBIO");
    }
    
}
