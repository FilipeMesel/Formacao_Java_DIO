import java.util.Scanner;

public class ContaBancaria {

    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        String agencia = s.next();
        int conta = s.nextInt();
        double saldo = s.nextDouble();

        System.out.println("Obrigado por criar uma conta aqui! Sua agencia " +
        agencia + " ,sua conta " + conta + " ,seu saldo atual " + saldo
        );
    }
}