package br.edu.infnet.appsdi.tp2;

public class CalculadoraTeste {
	public static void main(String[] args) {
		float numeroUm = Float.valueOf(args[0]);
		float numeroDois = Float.valueOf(args[1]);
		int operacao = Integer.valueOf(args[2]);
		String nome = args[3];
	
		float resultado = 0;
		
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Divisão");
		System.out.println("4 - Multiplicação");
		System.out.println("A operação escolhida foi: " + operacao);
		
		
		if(operacao == 1) {
			resultado = numeroUm + numeroDois;
			System.out.printf("[%s] Soma: %.2f = %.2f + %.2f", nome, resultado, numeroUm, numeroDois );
		} else if (operacao == 2) {
			resultado = numeroUm - numeroDois;
			System.out.printf("[%s] Subtração: %.2f = %.2f - %.2f", nome, resultado, numeroUm, numeroDois );
		}else if (operacao == 3) {
			resultado = numeroUm / numeroDois;
			System.out.printf("[%s] Divisão: %.2f = %.2f / %.2f", nome, resultado, numeroUm, numeroDois );
		}else if (operacao == 4) {
			resultado = numeroUm * numeroDois;
			System.out.printf("[%s] Multiplicação: %.2f = %.2f * %.2f", nome, resultado, numeroUm, numeroDois );
		} else{
			System.out.printf("Operação inválida");
		}
	
		
		
	}
}
