package sumar;

import java.util.Scanner;

public class sumarSoloDiez {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, suma_total;
		suma_total = 0;

		for (int i = 1; i <= 30; i++) {
			System.out.print("Introduzca numero: ");
			num = teclado.nextInt();
			suma_total = suma_total + num;
		}
		System.out.println("La suma total es: " + suma_total);
		teclado.close();
	}

}
