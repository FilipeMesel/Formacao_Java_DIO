public class MinhaClasse {
    public static void main(String [] args)
    {
        System.out.println("Minha primeira classe Java");

        /*Criando uma constante */
        final String BR = "Brasil";
        System.out.println(BR);
        System.out.println(meu_primeiro_metodo("Filipe", "Mesel"));
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
}
