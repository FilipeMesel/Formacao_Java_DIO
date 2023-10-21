import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
	}
	/**
	 * @param parametroUm
	 * @param parametroDois
	 * @throws ParametrosInvalidosException
	 */
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção

        if(parametroUm > parametroDois)
        {
            throw new ParametrosInvalidosException("Parâmetros inválidos");
        }
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
        for(int idx = 0; idx < contagem; idx++)
        {
            System.out.println("N* " + (idx + 1));
        }
	}
}