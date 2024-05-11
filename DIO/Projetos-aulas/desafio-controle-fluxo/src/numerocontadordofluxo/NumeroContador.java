package numerocontadordofluxo;

import java.util.Scanner;



public class NumeroContador {
	public static void main(String[] args) {
	/* receber parâmetros via terminal retorna inteiros*/
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o primeiro número:");
		int parametroUm = teclado.nextInt();
		
		System.out.println("Digite o segundo número:");
		int parametroDois = teclado.nextInt();
		
		System.out.println("Primeiro número: " + parametroUm);
		System.out.println("Primeiro segundo: " + parametroDois);		
		
			
		try {
			contar(parametroUm, parametroDois);
		}
		catch (ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage());
		}
		teclado.close();	
	}
	static void contar(int parametroUm,int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo número é ("+ parametroDois + ") ele deve ser maior que o primeiro (" + parametroUm + ").");
		}
		else {
			int contagem = parametroDois - parametroUm;
			for(int i = 0; i <= contagem; i++) {
				System.out.println("Número: " + i);
			}
		}
		
	}
}



