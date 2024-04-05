package sumar;


import java.util.Locale;
import java.util.Scanner;

public class sumaWhile {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		leer.useLocale( Locale.ENGLISH );
		int i = 1;
		float n, suma = 0;
		while (i <= 3) {
			System.out.print("Introduce numero #" + i + ": ");
			n = leer.nextFloat();
			suma += n;
			i++;
		}
		System.out.printf("La suma de los 3 numeros es: %.1f ", suma);
		leer.close();
	}
}
