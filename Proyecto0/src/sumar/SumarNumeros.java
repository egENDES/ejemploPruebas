package sumar;
import java.util.Scanner;

public class SumarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Indique la cantidad de numeros a sumar: ");
        int totalNumeros = scanner.nextInt();

        int suma = 0;
        for (int i = 0; i < totalNumeros; i++) {
            System.out.print("Introduzca numero #" + (i + 1) + ": ");
            int numero = scanner.nextInt();
            suma += numero;
        }

        System.out.println("La suma total es: " + suma);
        scanner.close();
    }
}