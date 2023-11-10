package gerador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GeradorNumeros {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("De qual numero até qual quer que gere? \n"
				+ "Exemplo: 1 a 25");
		String limitador = scan.nextLine();
		int min = Integer.valueOf(limitador.toLowerCase().split("a")[0].trim());
		int max = Integer.valueOf(limitador.toLowerCase().split("a")[1].trim());

		System.out.println("Quantos numeros quer que gere?");
		int qtdNumeros = scan.nextInt();
		
		gerarNumero(min,max, qtdNumeros);
	}

	public static void gerarNumero(Integer min, Integer max, Integer qtdNumeros) {
		List<Integer> numeros = new ArrayList<>();
		for(int i = 0; i < qtdNumeros; i++) {
			Integer numRandom = (int) ((Math.random()*max)+min);

			if(!numeros.contains(numRandom)) {
				numeros.add(numRandom);
				System.out.println(numRandom);
			}else {
				i--;
			}

		}
	}

}
