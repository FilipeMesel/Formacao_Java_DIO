/**
 * Explicação sobre a anatomia das classes e criação do primerio pacote
 */

package edu.FormacaoJavaDio;

public class AnatomiaClasses {
    public static void main(String [] args)
    {
        System.out.println("Minha primeira classe Java");

        /*Criando uma constante */
        final String BR = "Brasil";
        System.out.println(BR);
        System.out.println(meu_primeiro_metodo("Filipe", "Mesel"));

        imprimir_media_aluno(calcular_media_aluno(10, 7));
    }

    /**
     * Meu primeiro método escrito em Java
     * @param primeiroNome
     * @param segundoNome
     * @return String união dos nomes
     */
    public static String meu_primeiro_metodo(String primeiroNome, String segundoNome)
    {
        return primeiroNome + " " + segundoNome;
    }

    /**
     * Método para calcular a média do aluno
     * @param nota1
     * @param nota2
     * @return double média 
     */
    public static double calcular_media_aluno(double nota1, double nota2)
    {
        return (nota1+nota2)/2.0;
    }

    /**
     * Método que imprime a media do aluno
     * @param media
     */
    public static void imprimir_media_aluno(double media)
    {
        System.out.println(media);
    }
}
