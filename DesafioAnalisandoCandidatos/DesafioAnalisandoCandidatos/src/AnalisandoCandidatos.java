import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class AnalisandoCandidatos{
    public static void main(String [] args)
    {
        System.out.println("Digite sua pretenção slarial: ");
        Scanner s =new Scanner(System.in);
        double pretencao = s.nextDouble();
        analisarCandidato(pretencao);
        
        selecionarCandidatos();
        imprimirSelecionados();
        tentarLigarCandidatos();
    }

    static void analisarCandidato(double valor) {

        if(valor < 2000)
        {
            System.out.println("Ligar para o candidato");
        }else if(valor == 2000)
        {
            System.out.println("Ligar para o candidato com contra proposta");
        }else {
            System.out.println("Avaliar outros candidatos");
        }
    }
    static void selecionarCandidatos()
    {
        String [] candidatos = {"Filipe", "Lucia", "Tatiana"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000;
        while(candidatosSelecionados < 1 && candidatoAtual < candidatos.length)
        {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " solicitou esse valor R$ "+ salarioPretendido);
            if(salarioBase >= salarioPretendido)
            {
                System.out.println("Candidato selecionado para a vaga: " + candidato);
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }
    static double valorPretendido()
    {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void imprimirSelecionados()
    {
        String [] candidatos = {"Filipe", "Lucia", "Tatiana"};
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento: ");
        for(int indice = 0; indice < candidatos.length; indice++)
        {
            System.out.println(candidatos[indice]);
        }
        System.out.println("for...each");
        for(String candidato: candidatos)
        {
            System.out.println(candidato);
        }
    }

    static void tentarLigarCandidatos()
    {
        String [] candidatos = {"Filipe", "Lucia", "Tatiana"};
        for(int indice = 0; indice < candidatos.length; indice++)
        {
            entrandoEmContato(candidatos[indice]);
        }

    }

    static void entrandoEmContato(String candidato)
    {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if(continuarTentando)
            {
                tentativasRealizadas++;
            }else {
                System.out.println("O CANDIDATO ATENDEU");
            }

        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
        {
            System.out.println("O contato voi realizado com o " + candidato);
        }else {
            System.out.println("O " + candidato + " não atendeu");
        }
    }

    /**
     * Método auxiliar que simula o processo de ligações para os candidatos
     * @return
     */
    static boolean atender()
    {
        return new Random().nextInt(3)==1;
    }
}