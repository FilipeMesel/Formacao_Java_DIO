/**
 * Tipos de operadores
 */

package edu.FormacaoJavaDio.modulo2;

public class OperadoresJava {
    public static void main(String [] args)
    {
        int idx = 1;
        idx+=1;
        idx--;
        idx++;
        /* Aqui vamos imprimir idx e depois somar idx */
        System.out.println("Imprimindo idx e depois somando idx");
        System.out.println(idx++);
        System.out.println(idx);
        /* Aqui vamos somar idx e depois imprimir idx */
        System.out.println("Somando idx e depois imprimindo idx");
        System.out.println(++idx);
        System.out.println(idx);

        System.out.println("Soma, subtração, divisão, multiplicação");
        double valor1 = 10, valor2 = 20.5;
        double soma = valor1 + valor2;
        double subtracao = valor1 - valor2;
        double divisao =  valor2/valor1;
        double multiplicacao = valor1*valor2;
        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(divisao);
        System.out.println(multiplicacao);

        System.out.println("Lógicos");
        boolean verdadeiro = true, falso = false;

        System.out.print("verdadeiro&falso: ");
        System.out.println(verdadeiro&falso);
        System.out.print("verdadeiro|falso: ");
        System.out.println(verdadeiro|falso);
        System.out.print("!verdadeiro|falso: ");
        System.out.println(!verdadeiro|falso);
        System.out.print("!verdadeiro&falso: ");
        System.out.println(!verdadeiro&falso);
        System.out.print("verdadeiro&&falso: ");
        System.out.println(verdadeiro&&falso);
        System.out.print("verdadeiro||falso: ");
        System.out.println(verdadeiro||falso);
        System.out.print("Ternário: ");
        System.out.println(verdadeiro&&falso ? "verdadeiro":"falso");

        System.out.println("Soma de strings = concatenação");
        String numero1="1", numero2="1";
        System.out.print("numero1 + numero2 = 11 -> ");
        System.out.println(numero1+numero2);
        System.out.println(numero1+(1+1+1));
    }
}
