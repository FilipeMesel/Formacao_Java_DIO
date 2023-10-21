package edu.Estruturas.Condicionais;

public class EstruturasCondicionais {
    public static void main (String[] args)
    {
        int numero1 = 10, numero2 = 20;
        if(numero1 == numero2) {
            System.out.println("Numero 1 é igual a numero 2");
        }else if(numero1 > numero2)
        {
            System.out.println("Numero 1 é maior que numero 2");
        }else {
            System.out.println("Numero 1 é menor que numero 2");
        }

        switch(numero1)
        {
            case 10:
            {
                System.out.println("Numero 1 = 10");
            }
            break;
            case 20:
            {
                System.out.println("Numero 1 = 20");
            }
            break;
            default:
            {

                System.out.println("Numero 1 != 10 e 20");
            }
            break;
        }

        System.out.print("Ternário: ");
        System.out.println(numero1 < 10? "i é menor que 10": "i não é menor que 10");
    }
}
