package Clase1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class excepciones {

	/* francisco ortiz tomás */
	/* 11/11/2025*/

	public static void main(String[] args) {

		// declaramos el array//
		int[] arrayenteros = { 0, 1, 2, 3, 4 };

		Scanner sc = new Scanner(System.in);

	

		try {
			System.out.print("Introduce el divisor: ");
			int divisor = sc.nextInt();

			System.out.print("Introduce el numero de la posición del array(dividendo): ");
			int posicionArray = sc.nextInt();
			
			int division = arrayenteros[posicionArray] / divisor;
			System.out.print("El resultado de la división es: " + division);
			

		} catch (ArithmeticException e) {

			System.out.println("Error: No se puede dividir entre cero");

		} catch (InputMismatchException e) {

			System.out.println("Error: Entrada inválida. introduce un número");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: posicion de array (dividendo) inexistente");

		} finally {
			sc.close();
		}
	}

}
