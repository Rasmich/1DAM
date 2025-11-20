package Clases;

import java.util.Scanner;

/**
 * @author Francisco Ortiz Tomás
 * @since 2025-09-30
 */
public class Calculadora {

    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	double numero1 = 0;

	double numero2 = 0;

	boolean fin = false;

	while (!fin) {

	    System.out.println("Menú de la calculadora:");

	    System.out.println("1. Cambiar el primer número");

	    System.out.println("2. Cambiar el segundo número");

	    System.out.println("3. Sumar");

	    System.out.println("4. Restar");

	    System.out.println("5. Multiplicar");

	    System.out.println("6. Dividir");

	    System.out.println("7. Salir");

	    System.out.print("Seleccione una opción: ");

	    int opcion = scanner.nextInt();

	    switch (opcion) {

	    case 1:

		System.out.print("Introduce el primer número: ");

		numero1 = scanner.nextDouble();

		break;

	    case 2:

		System.out.print("Introduce el segundo número: ");

		numero2 = scanner.nextDouble();

		break;

	    case 3:

		System.out.println("La suma es: " + (numero1 + numero2));

		break;

	    case 4:

		System.out.println("La resta es: " + (numero1 - numero2));

		break;

	    case 5:

		System.out.println("La multiplicación es: " + (numero1 * numero2));

		break;

	    case 6:

		System.out.println("La división es: " + (numero1 / numero2));

		break;

	    case 7:
		System.out.println("7. Salir");

		fin = true;

		break;

	    default:

		System.out.println("Opción no válida. Por favor, intenta de nuevo.");

		break;

	    }

	}

	scanner.close();

	System.out.println("Programa finalizado.");

    }

}
