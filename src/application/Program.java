package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número de linhas: ");
		int n = sc.nextInt();

		System.out.print("Digite o número de colunas: ");
		int m = sc.nextInt();

		int[][] matriz = new int[n][m];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		System.out.print("Qual número você deseja encontrar dentro da matriz? ");
		int x = sc.nextInt();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == x) {
					System.out.printf("%dª ocorrência%n", i + 1);
					System.out.printf("Posição: %d, %d%n", i, j);
					if (j > 0)
						System.out.printf("Esquerda: %d%n", matriz[i][j - 1]);

					if (j < matriz.length)
						System.out.printf("Direita: %d%n", matriz[i][j + 1]);
					
					if(i > 0)
						System.out.printf("Acima: %d%n", matriz[i-1][j]);
					
					if(i < matriz[i].length)
						System.out.printf("Abaixo: %d%n%n", matriz[i+1][j]);
				}
			}
		}

		sc.close();

	}

}
