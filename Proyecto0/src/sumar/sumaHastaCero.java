package sumar;

import java.util.Scanner;

public class sumaHastaCero {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
        int numero, suma = 0;

        do {
            System.out.printf("Introduce un numero (0 para terminar y sumar): ");
            numero = input.nextInt();
            suma += numero;
        } while (numero != 0);

        System.out.println("La suma de los numeros introducidos es: " + suma);
        input.close();
    }
}