/**
 * Explicação sobre o tipo de variáveis
 */

package edu.FormacaoJavaDio.modulo2;

public class TiposVariaveis {
    public static void main(String [] args)
    {
        double salarioMinimo = 2500.0;
        int idade = 10;
        byte idadeByte = 123;
        short cep = 123456;
        long cpf = 123456789;
        float pi = 3.14f; //Float precisa ter o F no final (Podendo ser maiúsculo ou minúsculo)
        //Casting:
        int cepInt = (int)cep;

        //Constantes:
        final float VALOR_DE_PI = 3.14f;
    }
}
