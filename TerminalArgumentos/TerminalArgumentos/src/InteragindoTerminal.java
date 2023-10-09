import java.util.Scanner;

class InteragindoTerminal{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String digiteNome = s.next();
        System.out.println("Digite sua idade: ");
        int idade = s.nextInt();
        System.out.println("Você digitou: " + digiteNome + " "+ idade);
    }
}