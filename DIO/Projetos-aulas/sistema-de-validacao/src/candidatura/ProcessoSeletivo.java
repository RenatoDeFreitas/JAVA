package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"}; /* melhor cenário é criar novo array e set selecionados*/
		for (String candidato : candidatos) {
			entrandoEmContato(candidato);
		}
				
	}
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu=false;
		do {
			atendeu = atender();
			continuarTentando =! atendeu;
			
			if (continuarTentando) {
				tentativasRealizadas++;
			} else {
				System.out.println("Contato realizado com sucesso!");
			}
			
		}while(continuarTentando && tentativasRealizadas < 3);
			if (atendeu) {
				System.out.println("Contato com " + candidato + " na tentativa " + tentativasRealizadas);
			} else {
				System.out.println(candidato + " não atendeu! Ligamos " + tentativasRealizadas + "vezes.");
			}
		
	}
	
	//método auxiliar - valor 3 = atendeu
	static boolean atender() {
		return new Random().nextInt(3)==1;	
	}
	static void imprimirSelecionados() {
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"}; /* melhor cenário é criar novo array e set selecionados*/
		System.out.println("Lista com índice do elemento (array).");
		for (int indice = 0; indice < candidatos.length; indice++) {
			System.out.println("Canditado de nº " + (indice + 1 ) + " é " + candidatos[indice]);
		}
		System.out.println();
		System.out.println("Seleção abreviada (for - each)");
			for (String candidato : candidatos) {
				System.out.println("Selecionado foi: " + candidato);
			}
	}
	

	static void selecaoCandidatos(){
		
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
		
		int candidatosSelecionados = 0; 					/* índice do while*/
		int candidatosAtual = 0; 							/* índice do Array*/
		double salarioBase = 2000.0;
		while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];				/* cria variável que recebe candidato no array*/
			double salarioPretendido = valorPretendido();				/* método - aleatório - salario */
			System.out.println("Análsie: "+ candidato + " solicitou R$ " + salarioPretendido);
			
			if (salarioBase >= salarioPretendido) {
				System.out.println(candidato + " ,foi selecionado.");
				candidatosSelecionados ++; 
			}
			else {
				System.out.println(candidato + " ,não selecionado. Pretendido R$ " + salarioPretendido);
				System.out.println("");
			}
			candidatosAtual ++;
			
		}
	}
	static double valorPretendido() {
	     return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	static void analisarCandidato (double salarioPretendido) {
		double salarioBase = 2000.00;
		if (salarioBase > salarioPretendido) {
			System.out.println("Ligar para o candidato.");
		}
		else if (salarioBase == salarioPretendido){
			System.out.println("Ligar e fazer contra proposta.");
		}
		else {
			System.out.println("Agaurdar demais candidatos");
		}
	}

}
