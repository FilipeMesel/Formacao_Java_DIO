package edu.Estruturas.Repeticao;

public class EstruturasRepeticao {
    public static void main(String [] args)
    {
        for(int i =0; i< 10; i++)
        {
            System.out.println("FOR Contagem em " + i);
        }

        int i =0;
        while(i < 10)
        {
            System.out.println(" WHILE Contagem em " + i);
            i++;
        }

        i =0;
        do {
            System.out.println("DO... WHILE Contagem em " + i);
            i++;
        }while(i<10);

        String alunos []= {"Filipe", "Arthur", "Rodrigo", "Gustavo"};

        for(int idx =0; idx< alunos.length; idx++)
        {
            System.out.println("Aluno N0."+idx+": "+alunos[idx]);
        }

        /**For each */
        for(String aluno: alunos){
            System.out.println("Aluno: "+aluno);
        }
    }
}
