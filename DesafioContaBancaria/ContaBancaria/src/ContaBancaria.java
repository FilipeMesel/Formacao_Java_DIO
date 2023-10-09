import java.util.Scanner;

public class ContaBancaria {

    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua agência: ");
        String agencia = s.next();
        System.out.println("Digite sua conta: ");
        int conta = s.nextInt();
        System.out.println("Digite seu saldo: ");
        double saldo = s.nextDouble();

        System.out.println("Obrigado por criar uma conta aqui! Sua agencia " +
        agencia + " ,sua conta " + conta + " ,seu saldo atual " + saldo
        );
    }
}